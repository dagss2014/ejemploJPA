package es.uvigo.dagss.ejemplojpa.entidades;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private long id;
    
    private String nombre;    
    private String apellidos;
    private String domicilio;
    
    private List<Asignatura> asignaturas;

    
    public Alumno() {
    }

    public Alumno(String nombre, String apellidos, String domicilio) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.domicilio = domicilio;
        this.asignaturas = new ArrayList<Asignatura>();
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(List<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }
    
    public void anadirAsignatura(Asignatura asignatura) {
        this.asignaturas.add(asignatura);
    }
    
    public void eliminarAsignatura(Asignatura asignatura) {
        this.asignaturas.remove(asignatura);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (int) (this.id ^ (this.id >>> 32));
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
        final Alumno other = (Alumno) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + '}';
    }
    

}
