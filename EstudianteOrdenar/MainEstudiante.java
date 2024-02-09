package EstudianteOrdenar;

import java.util.Arrays;

public class MainEstudiante {

    public static void main(String[] args) {

        Estudiante Patri = new Estudiante("Patri",12,170);
        Estudiante Manuel = new Estudiante("Manuel",43 ,173);
        Estudiante Javier = new Estudiante("Javier", 72,189);
        Estudiante Alicia = new Estudiante("Alicia", 52,168);
        Estudiante Alberto = new Estudiante("Alberto", 35, 189);

        System.out.println("Estudiantes sin ordenar: ");
        System.out.println("1. " + Patri.getNombre() + " - Altura: " + Patri.getAltura() + " - Edad: " + Patri.getEdad());
        System.out.println("2. " + Manuel.getNombre() + " - Altura: " + Manuel.getAltura() + " - Edad: " + Manuel.getEdad());
        System.out.println("3. " + Javier.getNombre() + " - Altura: " + Javier.getAltura() + " - Edad: " + Javier.getEdad());
        System.out.println("4. " + Alicia.getNombre() + " - Altura: " + Alicia.getAltura() + " - Edad: " + Alicia.getEdad());
        System.out.println("5. " + Alberto.getNombre() + " - Altura: " + Alberto.getAltura() + " - Edad: " + Alberto.getEdad());

        System.out.println(" ");

        Estudiante ArrayEstudiante[] = new Estudiante[5];

        ArrayEstudiante[0] = Patri;
        ArrayEstudiante[1] = Javier;
        ArrayEstudiante[2] = Alberto;
        ArrayEstudiante[3] = Alicia;
        ArrayEstudiante[4] = Manuel;

        System.out.println("Estudiantes ordenados:");

        Arrays.sort(ArrayEstudiante);

        int numeroEstudiante = 1;

        for(int i= 0; i < ArrayEstudiante.length; i++){
            //System.out.println(ArrayEstudiante[i].toString());
            System.out.println(numeroEstudiante + ". " + ArrayEstudiante[i].getNombre() + " - Altura: " + ArrayEstudiante[i].getAltura() + " - Edad: " + ArrayEstudiante[i].getEdad());
            numeroEstudiante++;
        }

    }

}
