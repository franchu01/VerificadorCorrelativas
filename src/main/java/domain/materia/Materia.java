package domain.materia;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Materia {
    private String nombre;
    private List<Materia> correlativas;

    //CONSTRUCTOR
    public Materia(String nombre, List<Materia> correlativas){
        this.nombre         = nombre;
        this.correlativas   = correlativas;
    }
    // SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public List<Materia> getCorrelativas() {
        return correlativas;
    }
    // GETTERS
    public void setCorrelativas(List<Materia> correlativas) {
        this.correlativas = correlativas;
    }
    public String getNombre() {
        return nombre;
    }
    //METODOS
    public boolean cumpleCorrelatividad(List<Materia> unasMaterias){
        return new HashSet<>(unasMaterias).containsAll(this.correlativas);
    }
}
