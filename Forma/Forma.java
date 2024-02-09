package Forma;

public abstract class Forma implements Redimensionable, Comparable<Forma>{

    private int numLados;


    //Constructor

    public Forma (int numLados){
        this.numLados = numLados;
    }


    //Métodos

    public abstract double getArea();

    public abstract double getPerimeter();

    public int compareTo(Forma o) {
        return 0;
    }

    //Getters and Setters

    public int getNumLados() {
        return numLados;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }

}
