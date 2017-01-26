package com.modeloController;

import com.modeloEntities.Ejercicios;
import com.modeloController.util.JsfUtil;
import com.modeloController.util.PaginationHelper;
import com.modeloDTO.EjerciciosFacade;

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

@Named("ejerciciosController")
@SessionScoped
public class EjerciciosController implements Serializable {

    private Ejercicios current;
    private DataModel items = null;
    @EJB
    private com.modeloDTO.EjerciciosFacade ejbFacade;
    private PaginationHelper pagination;
    private int selectedItemIndex;

    public EjerciciosController() {
    }

    public Ejercicios getSelected() {
        if (current == null) {
            current = new Ejercicios();
            current.setEjerciciosPK(new com.modeloEntities.EjerciciosPK());
            selectedItemIndex = -1;
        }
        return current;
    }

    private EjerciciosFacade getFacade() {
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
        current = (Ejercicios) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "View";
    }

    public String prepareCreate() {
        current = new Ejercicios();
        current.setEjerciciosPK(new com.modeloEntities.EjerciciosPK());
        selectedItemIndex = -1;
        return "Create";
    }

    public String create() {
        try {
            current.getEjerciciosPK().setFuerzaidFuerza(current.getFuerza().getIdFuerza());
            getFacade().create(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("EjerciciosCreated"));
            return prepareCreate();
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public String prepareEdit() {
        current = (Ejercicios) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "Edit";
    }

    public String update() {
        try {
            current.getEjerciciosPK().setFuerzaidFuerza(current.getFuerza().getIdFuerza());
            getFacade().edit(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("EjerciciosUpdated"));
            return "View";
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public String destroy() {
        current = (Ejercicios) getItems().getRowData();
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
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("EjerciciosDeleted"));
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

    public Ejercicios getEjercicios(com.modeloEntities.EjerciciosPK id) {
        return ejbFacade.find(id);
    }

    @FacesConverter(forClass = Ejercicios.class)
    public static class EjerciciosControllerConverter implements Converter {

        private static final String SEPARATOR = "#";
        private static final String SEPARATOR_ESCAPED = "\\#";

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            EjerciciosController controller = (EjerciciosController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "ejerciciosController");
            return controller.getEjercicios(getKey(value));
        }

        com.modeloEntities.EjerciciosPK getKey(String value) {
            com.modeloEntities.EjerciciosPK key;
            String values[] = value.split(SEPARATOR_ESCAPED);
            key = new com.modeloEntities.EjerciciosPK();
            key.setIdejercicios(Integer.parseInt(values[0]));
            key.setFuerzaidFuerza(Integer.parseInt(values[1]));
            return key;
        }

        String getStringKey(com.modeloEntities.EjerciciosPK value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value.getIdejercicios());
            sb.append(SEPARATOR);
            sb.append(value.getFuerzaidFuerza());
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof Ejercicios) {
                Ejercicios o = (Ejercicios) object;
                return getStringKey(o.getEjerciciosPK());
            } else {
                throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: " + Ejercicios.class.getName());
            }
        }

    }

}
