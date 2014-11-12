package es.uvigo.dagss.ejemplojpa.entidades;

import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private long id;

    private String nombre;
    
    private List<Asignatura> asignaturas;

    
    public Profesor() {
    }

    public Profesor(String nombre) {
        this.nombre = nombre;
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
        final Profesor other = (Profesor) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Profesor{" + "id=" + id + ", nombre=" + nombre + "}";
    }

    public String toStringCompleto() {
        return "Profesor{" + "id=" + id + ", nombre=" + nombre + ", asignaturas=" + asignaturas.toString() + "}";
    }
  
}
