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
public class AlumMat {
    private Alumno unAlumno;
    private Materia unaMateria;

    public AlumMat() {
    }

    public AlumMat(Alumno unAlumno, Materia unaMateria) {
        this.unAlumno = unAlumno;
        this.unaMateria = unaMateria;
    }
    

    /**
     * @return the unAlumno
     */
    public Alumno getUnAlumno() {
        return unAlumno;
    }

    /**
     * @param unAlumno the unAlumno to set
     */
    public void setUnAlumno(Alumno unAlumno) {
        this.unAlumno = unAlumno;
    }

    /**
     * @return the unaMateria
     */
    public Materia getUnaMateria() {
        return unaMateria;
    }

    /**
     * @param unaMateria the unaMateria to set
     */
    public void setUnaMateria(Materia unaMateria) {
        this.unaMateria = unaMateria;
    }
}
