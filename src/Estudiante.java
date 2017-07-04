import java.nio.channels.AsynchronousChannelGroup;
import java.util.ArrayList;

/**
 * Created by alumno on 3/07/2017.
 */
public class Estudiante {
    private String nombre = "";
    private int edad = 0;
    private ArrayList<Asignatura> asignaturaList = null;


    public Estudiante() {
        asignaturaList = new ArrayList<Asignatura>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float promedio() {
        float suma = 0;
        for (Asignatura asignatura : asignaturaList) {
            suma += asignatura.getNota();
        }
        return (suma / asignaturaList.size());

    }

    public void addAsignatura(Asignatura asignatura) {
        asignaturaList.add(asignatura);
    }

}
