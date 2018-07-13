/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.util.Date;





/**
 *
 * @author sandra
 */
public class Alumno{
    private int dni;
    private String apellido;
    private String nombre;
    private Date fechnac;
    private String domicilio;
    private int telefono;
    

    public Alumno() {
    }

    public Alumno(int dni, String apellido, String nombre, Date fechnac, String domicilio, int telefono) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechnac = fechnac;
        this.domicilio = domicilio;
        this.telefono = telefono;
        
    }

    
    
    

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the domicilio
     */
    public String getDomicilio() {
        return domicilio;
    }

    /**
     * @param domicilio the domicilio to set
     */
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    /**
     * @return the fechnac
     */
    public Date getFechnac() {
        return fechnac;
    }

    /**
     * @param fechnac the fechnac to set
     */
    public void setFechnac(Date fechnac) {
        this.fechnac = fechnac;
    }

    /**
     * @return the dni
     */
    public int getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(int dni) {
        this.dni = dni;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

   
}
