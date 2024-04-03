package domain.alumno;

import domain.materia.Materia;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;
    private List<Materia> materiasAprobadas;
    //CONSTRUCTOR
    public Alumno(String nombre, List<Materia> materiasAprobadas){
        this.nombre             = nombre;
        this.materiasAprobadas  = materiasAprobadas;
    }
    //GETTER
    public String getNombre() {
        return nombre;
    }
    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }
    //SETTER
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setMateriasAprobadas(List<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }
    //METODOS
    public boolean aproboCorrelativasDe(Materia unaMateria){
        return unaMateria.cumpleCorrelatividad(this.materiasAprobadas);
    }
}
