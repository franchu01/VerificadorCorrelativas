import domain.alumno.Alumno;
import domain.inscripcion.Inscripcion;
import domain.materia.Materia;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class Tests {
    @Test
    public void test1(){
        Materia Algebra         = new Materia("Algebra", new ArrayList<>());
        Materia Analisis1       = new Materia("Analisis1", new ArrayList<>());
        Materia Analisis2       = new Materia("Analisis2" , List.of(Algebra,Analisis1));

        Alumno roberto          = new Alumno("Roberto",List.of(Algebra));
        Inscripcion inscripcion = new Inscripcion(roberto,List.of(Analisis2));
        assert !inscripcion.aprobo() : "Roberto no se pudo anotar a analisis2, le falta analisis 1";
    }
    @Test
    public void test2(){
        Materia Algebra         = new Materia("Algebra", new ArrayList<>());
        Materia Analisis1       = new Materia("Analisis1", new ArrayList<>());
        Materia Analisis2       = new Materia("Analisis2" , List.of(Algebra,Analisis1));

        Alumno roberto          = new Alumno("Roberto",List.of(Algebra,Analisis1));
        Inscripcion inscripcion = new Inscripcion(roberto,List.of(Analisis2));
        assert inscripcion.aprobo() : "Roberto se anoto satisfactoriamente a Analisis2";
    }
    @Test
    public void test3(){
        Materia Algebra         = new Materia("Algebra", new ArrayList<>());
        Materia Analisis1       = new Materia("Analisis1", new ArrayList<>());
        Materia Analisis2       = new Materia("Analisis2" , List.of(Algebra,Analisis1));
        Materia Ayed            = new Materia("Ayed", new ArrayList<>());
        Materia Discreta        = new Materia("Discreta", new ArrayList<>());
        Materia SySL            = new Materia("Analisis2" , List.of(Ayed,Discreta));

        Alumno roberto          = new Alumno("Roberto",List.of(Algebra,Analisis1));
        Inscripcion inscripcion = new Inscripcion(roberto,List.of(Analisis2,SySL));
        assert !inscripcion.aprobo() : "Se rechazo la inscripcion, roberto no cumple con los requisitos para anotarse a SySL";
    }
    @Test
    public void test4(){
        Materia Algebra         = new Materia("Algebra", new ArrayList<>());
        Materia Analisis1       = new Materia("Analisis1", new ArrayList<>());
        Materia Analisis2       = new Materia("Analisis2" , List.of(Algebra,Analisis1));
        Materia Ayed            = new Materia("Ayed", new ArrayList<>());
        Materia Discreta        = new Materia("Discreta", new ArrayList<>());
        Materia SySL            = new Materia("Analisis2" , List.of(Ayed,Discreta));

        Alumno roberto          = new Alumno("Roberto",List.of(Algebra,Analisis1,Ayed,Discreta));
        Inscripcion inscripcion = new Inscripcion(roberto,List.of(Analisis2,SySL));
        assert inscripcion.aprobo() : "Se acepto la inscripcion, roberto cumple con los requisitos";
    }

}
