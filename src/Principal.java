import java.util.Scanner;

/**
 * Created by alumno on 3/07/2017.
 */
public class Principal {

    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido");
        System.out.println("Primer paso agregar al profesor");
        Scanner sn = new Scanner(System.in);
        Profesor profesor = new Profesor();
        System.out.println("Ingrese el nombre del profesor");
        profesor.setNombre(sn.next());
        System.out.println("Especialidad del profesor");
        profesor.setEspecialidad(sn.next());
        System.out.println("Siguiente paso: Agregar estudiantes");
        System.out.println("Cuantos estudiantes ingresará?");
        int cantidadEstudiantes=sn.nextInt();
        for(int i=0; i<=cantidadEstudiantes;i++){
            System.out.println("");
        }

    }


}
