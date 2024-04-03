package domain.inscripcion;

import domain.alumno.Alumno;
import domain.materia.Materia;

import java.util.List;

public class Inscripcion {
    public Alumno alumno;
    public List<Materia> materias;
    //CONSTRUCTOR
    public Inscripcion(Alumno alumno, List<Materia> materias){
        this.alumno     = alumno;
        this.materias   = materias;
    }
    //METODOS
    public Boolean aprobo(){
        return  this.materias.stream().allMatch(materia ->  alumno.aproboCorrelativasDe(materia));
    }
}
