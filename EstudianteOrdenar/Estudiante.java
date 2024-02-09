package EstudianteOrdenar;

public class Estudiante implements Comparable<Estudiante>{

    private String nombre;
    private int edad;
    private int altura;


    //Constructores

    public Estudiante(){
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public Estudiante(String nombre, int edad, int altura){
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }


    //Métodos

    @Override
    public int compareTo(Estudiante o) {
        int respuesta = 0;

        if(this.altura > o.altura){
            respuesta = -1;
        }
        if(this.altura < o.altura){
            respuesta = 1;
        }
        if(this.altura == o.altura){
            if(this.edad > o.edad){
                respuesta = -1;
            }
            if(this.edad < o.edad){
                respuesta = 1;
            }
        }
        return respuesta;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", altura=" + altura +
                '}';
    }

    //Getters and Setters

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

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
