/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador;

import aplicacion.modelo.datos.ListadoAlumnos;
import aplicacion.modelo.dominio.AlumMat;
import aplicacion.modelo.dominio.Alumno;
import aplicacion.modelo.dominio.Materia;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;


/**
 *
 * @author sandra
 */
@ManagedBean
@ViewScoped
public class AlumnoFormBean implements Serializable {
    private ListadoAlumnos alumnos;
    private ArrayList<Materia> listaMateria;
    private AlumMat inscripto;
    private Alumno alumno;
    private Materia mat;
    private int dni;
    private String ape;
    private String nom;
    private Date fecN;
    private String dom;
    private int tel;
    private int cod;
    private String AñoC;
    
    
    public AlumnoFormBean() {
        listaMateria=new ArrayList();
        alumnos=new ListadoAlumnos();
        inscripto=new AlumMat();
        alumno=new Alumno();
        mat=new Materia();
        listaMateria.add(new Materia(1,"Programacion Estructurada","APU","Primero"));
        listaMateria.add(new Materia(2,"Base de Datos I","APU","Segundo"));
        listaMateria.add(new Materia(3,"Algebra","APU","Tercero"));
        
    }

    public void reiniciarLista(){
        FacesMessage message=new FacesMessage("Hecho"+" Lista Reiniciada");
        FacesContext.getCurrentInstance().addMessage(null, message);
        setAlumnos(new ListadoAlumnos());
    }
    public void inscribirAlumno(){
        inscripto=new AlumMat();
        setAlumno(new Alumno(getDni(),getApe(),getNom(),getFecN(),getDom(),getTel()));
        getInscripto().setUnAlumno(getAlumno());
        getInscripto().setUnaMateria(getMat());
        alumnos.agregarLista(inscripto);
        FacesMessage message=new FacesMessage("Se inscribió alumno");
        FacesContext.getCurrentInstance().addMessage(null, message);
        
        
    }
    
    public void eliminarAlumno(){
        alumnos.eliminarAlumno(getInscripto());
    }
     public void modificarAlumno(){
        getAlumnos().modificarAlumno(getInscripto());
    }
    
    public void establecerAlumno(AlumMat unIns){
      setInscripto(unIns);
    }

    /**
     * @return the alumnos
     */
    public ListadoAlumnos getAlumnos() {
        return alumnos;
    }

    /**
     * @param alumnos the alumnos to set
     */
    public void setAlumnos(ListadoAlumnos alumnos) {
        this.alumnos = alumnos;
    }

    /**
     * @return the listaAlumno
     */
    

    /**
     * @return the listaMateria
     */
    public ArrayList<Materia> getListaMateria() {
        return listaMateria;
    }

    /**
     * @param listaMateria the listaMateria to set
     */
    public void setListaMateria(ArrayList<Materia> listaMateria) {
        this.listaMateria = listaMateria;
    }

    /**
     * @return the ape
     */
    public String getApe() {
        return ape;
    }

    /**
     * @param ape the ape to set
     */
    public void setApe(String ape) {
        this.ape = ape;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the dom
     */
    public String getDom() {
        return dom;
    }

    /**
     * @param dom the dom to set
     */
    public void setDom(String dom) {
        this.dom = dom;
    }

    /**
     * @return the dNi
     */
    public int getDni() {
        return dni;
    }

   
    public void setDni(int dni) {
        this.dni = dni;
    }

    /**
     * @return the tel
     */
    public int getTel() {
        return tel;
    }

    /**
     * @param tel the tel to set
     */
    public void setTel(int tel) {
        this.tel = tel;
    }

    /**
     * @return the fecN
     */
    public Date getFecN() {
        return fecN;
    }

    /**
     * @param fecN the fecN to set
     */
    public void setFecN(Date fecN) {
        this.fecN = fecN;
    }

    /**
     * @return the alumno
     */
  

    /**
     * @return the mat
     */
    public Materia getMat() {
        return mat;
    }

    /**
     * @param mat the mat to set
     */
    public void setMat(Materia mat) {
        this.mat = mat;
    }

    /**
     * @return the unAlumno
     */
    public Alumno getAlumno() {
        return alumno;
    }

    /**
     * @param alumno the unAlumno to set
     */
    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    /**
     * @return the cod
     */
    public int getCod() {
        return cod;
    }

    /**
     * @param cod the cod to set
     */
    public void setCod(int cod) {
        this.cod = cod;
    }

    /**
     * @return the AñoC
     */
    public String getAñoC() {
        return AñoC;
    }

    /**
     * @param AñoC the AñoC to set
     */
    public void setAñoC(String AñoC) {
        this.AñoC = AñoC;
    }


    /**
     * @return the inscripto
     */
    public AlumMat getInscripto() {
        return inscripto;
    }

    /**
     * @param inscripto the inscripto to set
     */
    public void setInscripto(AlumMat inscripto) {
        this.inscripto = inscripto;
    }
    
    
    
}
