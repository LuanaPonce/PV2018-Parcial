/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

/**
 *
 * @author sandra
 */
public class Materia {
    private int codigo;
    private String denom;
    private String carrera;
    private String año;

    public Materia() {
    }

    public Materia(int codigo, String denom, String carrera, String año) {
        this.codigo = codigo;
        this.denom = denom;
        this.carrera = carrera;
        this.año = año;
    }
    
    

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the denom
     */
    public String getDenom() {
        return denom;
    }

    /**
     * @param denom the denom to set
     */
    public void setDenom(String denom) {
        this.denom = denom;
    }

    /**
     * @return the carrera
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * @param carrera the carrera to set
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    /**
     * @return the año
     */
    public String getAño() {
        return año;
    }

    /**
     * @param año the año to set
     */
    public void setAño(String año) {
        this.año = año;
    }
}
