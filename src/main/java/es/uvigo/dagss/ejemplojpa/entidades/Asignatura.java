package es.uvigo.dagss.ejemplojpa.entidades;

import java.util.ArrayList;
import java.util.List;

public class Asignatura {
    private long id;
    
    private String nombre;
    private String codigo;
    private int curso;
    
    private List<Profesor> profesores;

    public Asignatura() {
    }

    public Asignatura(String nombre, String codigo, int curso) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.curso = curso;
        this.profesores = new ArrayList<Profesor>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }
    
    public void anadirProfesor(Profesor profesor) {
        profesor.anadirAsignatura(this);
        this.profesores.add(profesor);    
    }
    
    public void eliminarProfesor(Profesor profesor) {
        profesor.eliminarAsignatura(this);
        this.profesores.remove(profesor);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (int) (this.id ^ (this.id >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Asignatura other = (Asignatura) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "id=" + id + ", nombre=" + nombre + ", codigo=" + codigo + ", curso=" + curso + ", profesores=" + profesores.toString() + '}';
    }
       
}
