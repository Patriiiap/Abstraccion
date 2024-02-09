package Forma;

public class Triangulo extends Forma implements Redimensionable, Comparable<Forma>{

    private double ancho;
    private double alto;


    //Constructor

    public Triangulo(int numLados, double ancho, double alto){
        super(numLados);
        this.ancho = ancho;
        this.alto = alto;
    }


    //Métodos

    @Override
    public double getArea() {
        return ((ancho * ancho) / 2);
    }

    @Override
    public double getPerimeter() {
        double lado1 = ancho;
        double formulaLado2 = (alto * alto) + ((ancho / 2) + (ancho / 2));
        double lado2 = Math.sqrt(formulaLado2);
        double lado3 = lado2;

        return (lado1 + lado2 + lado3);
    }

    @Override
    public void redimensionar(int x) {
        ancho = ancho * x;
        alto = alto * x;
    }

    @Override
    public int compareTo(Forma o) {
        return super.compareTo(o);
    }

    //Getters and Setters

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
}
