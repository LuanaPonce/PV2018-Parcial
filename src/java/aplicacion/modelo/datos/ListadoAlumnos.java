/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.datos;

import aplicacion.modelo.dominio.AlumMat;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author sandra
 */
public class ListadoAlumnos implements Serializable {
    private ArrayList<AlumMat> lista;
    
    

    public ListadoAlumnos() {
        lista=new ArrayList();
    }

    public ListadoAlumnos(ArrayList<AlumMat> lista) {
        this.lista = lista;
        
        
    }
    
    
    public void agregarLista(AlumMat insc){
        getLista().add(insc);
       
        
    }
    
    public void eliminarAlumno(AlumMat insc){
        for(AlumMat a:lista){
            if (a.getUnAlumno().getNombre().equals(insc.getUnAlumno().getNombre())){
                getLista().remove(getLista().indexOf(a));
                FacesMessage message=new FacesMessage("Alumno Eliminado");
                FacesContext.getCurrentInstance().addMessage(null, message);
                break;
            }
        }
    }
    public void modificarAlumno(AlumMat insc){
        for(AlumMat a:lista){
            if (a.getUnAlumno().getNombre().equals(insc.getUnAlumno().getNombre())){
                getLista().set(getLista().indexOf(a), insc);
                FacesMessage message=new FacesMessage("Modificacion Realizada");
                FacesContext.getCurrentInstance().addMessage(null, message);
                break;
            }
        }
    }
    
    /**
     * @return the lista
     */
    public ArrayList<AlumMat> getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(ArrayList<AlumMat> lista) {
        this.lista = lista;
    }

    /**
     * @return the unAlumno
     */
   

    /**
     * @return the listadoM
     */
    

}
