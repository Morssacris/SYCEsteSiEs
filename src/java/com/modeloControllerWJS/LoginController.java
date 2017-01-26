/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modeloControllerWJS;


import com.modeloDTO.UsuariosFacade;
import com.modeloEntities.Usuarios;
import java.io.IOException;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author WJS
 */
@Named(value = "loginController")
@SessionScoped
public class LoginController implements Serializable {
    
    private String nomUsuario;
    private String clave;
    private Usuarios sesionUsuario;
    @EJB
    private UsuariosFacade usuariosFacade;

    public LoginController() {
    }

    public String getNomUsuario() {
        return nomUsuario;
    }

    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Usuarios getSesionUsuario() {
        return sesionUsuario;
    }

    public void setSesionUsuario(Usuarios sesionUsuario) {
        this.sesionUsuario = sesionUsuario;
    }
    
    public void iniciar() throws IOException{
        FacesContext contexto = FacesContext.getCurrentInstance();
        if (nomUsuario != null && clave != null) {
            Usuarios temp = usuariosFacade.login(nomUsuario, clave);
            if (temp != null) {
                contexto.getExternalContext().redirect(contexto.getExternalContext().getRequestContextPath()+"/pageAdmin/administradorInicio.xhtml");               
            }if(temp == null){
                 Usuarios temp2 = usuariosFacade.loginDeportista(nomUsuario, clave);
                if (temp2 != null) {
                contexto.getExternalContext().redirect(contexto.getExternalContext().getRequestContextPath()+"/pages/usuarios/List.xhtml");               
                
            }
            }
        }else {
            FacesMessage mensaje = new FacesMessage(
                    FacesMessage.SEVERITY_ERROR,
                    "NOmbre de Usuario y/o Clave no pueden ser vacias",
                    "Detalle del mensaje");
            contexto.addMessage(null, mensaje);
        }
    }
    
    
    
    
    
 
    
    
    
    
    

   

    
}
