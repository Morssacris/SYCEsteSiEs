package com.modeloController;

import com.modeloEntities.RendimientoHasDeportista;
import com.modeloController.util.JsfUtil;
import com.modeloController.util.PaginationHelper;
import com.modeloDTO.RendimientoHasDeportistaFacade;

import java.io.Serializable;
import java.util.ResourceBundle;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.faces.model.SelectItem;

@Named("rendimientoHasDeportistaController")
@SessionScoped
public class RendimientoHasDeportistaController implements Serializable {

    private RendimientoHasDeportista current;
    private DataModel items = null;
    @EJB
    private com.modeloDTO.RendimientoHasDeportistaFacade ejbFacade;
    private PaginationHelper pagination;
    private int selectedItemIndex;

    public RendimientoHasDeportistaController() {
    }

    public RendimientoHasDeportista getSelected() {
        if (current == null) {
            current = new RendimientoHasDeportista();
            current.setRendimientoHasDeportistaPK(new com.modeloEntities.RendimientoHasDeportistaPK());
            selectedItemIndex = -1;
        }
        return current;
    }

    private RendimientoHasDeportistaFacade getFacade() {
        return ejbFacade;
    }

    public PaginationHelper getPagination() {
        if (pagination == null) {
            pagination = new PaginationHelper(10) {

                @Override
                public int getItemsCount() {
                    return getFacade().count();
                }

                @Override
                public DataModel createPageDataModel() {
                    return new ListDataModel(getFacade().findRange(new int[]{getPageFirstItem(), getPageFirstItem() + getPageSize()}));
                }
            };
        }
        return pagination;
    }

    public String prepareList() {
        recreateModel();
        return "List";
    }

    public String prepareView() {
        current = (RendimientoHasDeportista) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "View";
    }

    public String prepareCreate() {
        current = new RendimientoHasDeportista();
        current.setRendimientoHasDeportistaPK(new com.modeloEntities.RendimientoHasDeportistaPK());
        selectedItemIndex = -1;
        return "Create";
    }

    public String create() {
        try {
            getFacade().create(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("RendimientoHasDeportistaCreated"));
            return prepareCreate();
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public String prepareEdit() {
        current = (RendimientoHasDeportista) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "Edit";
    }

    public String update() {
        try {
            getFacade().edit(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("RendimientoHasDeportistaUpdated"));
            return "View";
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public String destroy() {
        current = (RendimientoHasDeportista) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        performDestroy();
        recreatePagination();
        recreateModel();
        return "List";
    }

    public String destroyAndView() {
        performDestroy();
        recreateModel();
        updateCurrentItem();
        if (selectedItemIndex >= 0) {
            return "View";
        } else {
            // all items were removed - go back to list
            recreateModel();
            return "List";
        }
    }

    private void performDestroy() {
        try {
            getFacade().remove(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("RendimientoHasDeportistaDeleted"));
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
        }
    }

    private void updateCurrentItem() {
        int count = getFacade().count();
        if (selectedItemIndex >= count) {
            // selected index cannot be bigger than number of items:
            selectedItemIndex = count - 1;
            // go to previous page if last page disappeared:
            if (pagination.getPageFirstItem() >= count) {
                pagination.previousPage();
            }
        }
        if (selectedItemIndex >= 0) {
            current = getFacade().findRange(new int[]{selectedItemIndex, selectedItemIndex + 1}).get(0);
        }
    }

    public DataModel getItems() {
        if (items == null) {
            items = getPagination().createPageDataModel();
        }
        return items;
    }

    private void recreateModel() {
        items = null;
    }

    private void recreatePagination() {
        pagination = null;
    }

    public String next() {
        getPagination().nextPage();
        recreateModel();
        return "List";
    }

    public String previous() {
        getPagination().previousPage();
        recreateModel();
        return "List";
    }

    public SelectItem[] getItemsAvailableSelectMany() {
        return JsfUtil.getSelectItems(ejbFacade.findAll(), false);
    }

    public SelectItem[] getItemsAvailableSelectOne() {
        return JsfUtil.getSelectItems(ejbFacade.findAll(), true);
    }

    public RendimientoHasDeportista getRendimientoHasDeportista(com.modeloEntities.RendimientoHasDeportistaPK id) {
        return ejbFacade.find(id);
    }

    @FacesConverter(forClass = RendimientoHasDeportista.class)
    public static class RendimientoHasDeportistaControllerConverter implements Converter {

        private static final String SEPARATOR = "#";
        private static final String SEPARATOR_ESCAPED = "\\#";

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            RendimientoHasDeportistaController controller = (RendimientoHasDeportistaController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "rendimientoHasDeportistaController");
            return controller.getRendimientoHasDeportista(getKey(value));
        }

        com.modeloEntities.RendimientoHasDeportistaPK getKey(String value) {
            com.modeloEntities.RendimientoHasDeportistaPK key;
            String values[] = value.split(SEPARATOR_ESCAPED);
            key = new com.modeloEntities.RendimientoHasDeportistaPK();
            key.setRendimientoIdrendimiento(Integer.parseInt(values[0]));
            key.setDeportistaidDeportista(Integer.parseInt(values[1]));
            return key;
        }

        String getStringKey(com.modeloEntities.RendimientoHasDeportistaPK value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value.getRendimientoIdrendimiento());
            sb.append(SEPARATOR);
            sb.append(value.getDeportistaidDeportista());
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof RendimientoHasDeportista) {
                RendimientoHasDeportista o = (RendimientoHasDeportista) object;
                return getStringKey(o.getRendimientoHasDeportistaPK());
            } else {
                throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: " + RendimientoHasDeportista.class.getName());
            }
        }

    }

}
