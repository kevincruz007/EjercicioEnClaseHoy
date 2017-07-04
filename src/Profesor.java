import java.util.ArrayList;

/**
 * Created by alumno on 3/07/2017.
 */
public class Profesor {
    private String nombre="";
    private String especialidad="";
    private ArrayList<Estudiante> estudiantes=null;
    public Profesor() {
        estudiantes= new ArrayList<Estudiante>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void addEstudiante(Estudiante estudiante){
        estudiantes.add(estudiante);
    }

    public void promedio(){
        float notaMasAlta=0;
        String nombreEstudianteNotaMasAlta="";
        for (Estudiante estudiante:estudiantes
             ) {
            if(estudiante.promedio()>=notaMasAlta){
                nombreEstudianteNotaMasAlta= estudiante.getNombre();
                notaMasAlta=estudiante.promedio();
            }
        }
        //return estudiantes
    }



}
