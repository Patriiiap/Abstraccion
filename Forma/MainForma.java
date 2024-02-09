package Forma;

import java.util.Arrays;
import java.util.Scanner;

public class MainForma {

    public static void main(String[] args) {

        System.out.println("Ejercicio 6");
        System.out.println(" ");

        int numeroLados = 4;
        System.out.println("Vamos a ordenar 10 rectángulos, introduce los nombre de cada rectángulo");

        System.out.println("Primer Rectángulo (rectángulo 1)");

        System.out.println("Introduce el Ancho: ");
        double ancho1 = CapturaExcepciones();
        System.out.println("Introduce el Alto: ");
        double alto1 = CapturaExcepciones();

        Rectangulo rectangulo1 = new Rectangulo(numeroLados, ancho1, alto1);


        System.out.println(" ");

        System.out.println("Segundo Rectángulo (rectángulo 2)");

        System.out.println("Introduce el Ancho: ");
        double ancho2 = CapturaExcepciones();
        System.out.println("Introduce el Alto: ");
        double alto2 = CapturaExcepciones();

        Rectangulo rectangulo2 = new Rectangulo(numeroLados, ancho2, alto2);


        System.out.println(" ");

        System.out.println("Tercer Rectángulo (rectángulo 3)");

        System.out.println("Introduce el Ancho: ");
        double ancho3 = CapturaExcepciones();
        System.out.println("Introduce el Alto: ");
        double alto3 = CapturaExcepciones();

        Rectangulo rectangulo3 = new Rectangulo(numeroLados, ancho3, alto3);


        System.out.println(" ");

        System.out.println("Cuarto Rectángulo (rectángulo 4)");

        System.out.println("Introduce el Ancho: ");
        double ancho4 = CapturaExcepciones();
        System.out.println("Introduce el Alto: ");
        double alto4 = CapturaExcepciones();

        Rectangulo rectangulo4 = new Rectangulo(numeroLados, ancho4, alto4);


        System.out.println(" ");

        System.out.println("Quinto Rectángulo (rectángulo 5)");

        System.out.println("Introduce el Ancho: ");
        double ancho5 = CapturaExcepciones();
        System.out.println("Introduce el Alto: ");
        double alto5 = CapturaExcepciones();

        Rectangulo rectangulo5 = new Rectangulo(numeroLados, ancho5, alto5);

        System.out.println("Rectángulos ordenados");

        Rectangulo ArrayRectangulos[] = {rectangulo1, rectangulo2, rectangulo3, rectangulo4, rectangulo5};

        Arrays.sort(ArrayRectangulos);

        for(int i = 0; i < ArrayRectangulos.length; i++){
            System.out.println(ArrayRectangulos[i].toString());
        }

    }


    public static double CapturaExcepciones (){

        Scanner sc = new Scanner(System.in);
        double numero = 0;
        boolean salir = true;

        do{
            salir = true;
            try{
                do {
                    numero = sc.nextDouble();
                    if (numero <= 0){
                        System.out.println("Introduce valores mayores a 0");
                    }
                } while (numero <= 0);

            }
            catch (Exception e){
                System.out.println("Solo se pueden introducir números");
                salir = false;
                sc.next();
            }

        }
        while (salir == false);

        return numero;
    }


}
