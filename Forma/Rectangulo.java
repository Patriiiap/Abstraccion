package Forma;

public class Rectangulo extends Forma implements Redimensionable, Comparable<Forma>{

    private double ancho;
    private double alto;


    //Conctructor

    public Rectangulo (int numLados, double ancho, double alto){
        super(numLados);
        this.ancho = ancho;
        this.alto = alto;
    }


    //Métodos

    @Override
    public double getArea() {
        return alto * ancho;
    }

    @Override
    public double getPerimeter() {
        return ((2 * alto) + (2 * ancho));
    }

    @Override
    public void redimensionar(int x) {
        ancho = ancho * x;
        alto = alto * x;
    }

    @Override
    public int compareTo(Forma o) {
        int resultado;

        if(o.getArea() > this.getArea()){
            resultado = 1;
        }
        else if(o.getArea() < this.getArea()){
            resultado = -1;
        }
        else{
            resultado = 0;
        }

        return resultado;
    }

    @Override
    public String toString() {
        return "Rectangulo: Ancho = " + ancho + " - Alto = " + alto + " - Area = " + this.getArea();
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
