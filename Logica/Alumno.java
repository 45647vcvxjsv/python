package Logica;

public class Alumno {
    int id;
    String nombre;
    String apellido;
    
    // constructor vacio 
    public Alumno(){
    }

    // constructor con datos

    public Alumno(int id, String nombre, String apellido){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // los getters y setters tienen que haber uno de cada uno si hay nombre y apellido e id, un get y set para cada uno 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    // modificador de acceso la convencion camelkeys indica las clases se escriben con mayusculas y los metodos con minusculas 
    public void mostrarNombre() {
        System.out.println("hola, soy un alumno y se decir mi nombre");
    }

    public void saberAprobado(double calificacion) {
        if (calificacion >=7) {
            System.out.println("aprobe el curso");
        }
        else{
            System.out.println(" la cagaste a repetir el ano");
        }
        
    }

}
