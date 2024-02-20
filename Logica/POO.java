package Logica;

public class POO{

    public static void main(String[] args) {
        Alumno a1 = new Alumno();
        Alumno a2 = new Alumno(35, "Luis", "alvarez");

        System.out.println("la id es : " + a2.getId());
        System.out.println("el nombre es " + a2.getNombre());
        System.out.println("el apellido es : " + a2.getApellido());

        a1.setId(39);
        a1.setNombre("andriana");
        a1.setApellido("barrasa");

        System.out.println("---------------------");
        System.out.println("la id es : " + a1.getId());
        System.out.println("el nombre es " + a1.getNombre());
        System.out.println("el apellido es : " + a1.getApellido());

        // cambio de variable 
        System.out.println("---------------------");
        a2.setId(40);

        System.out.println("la id es : " + a2.getId());
        System.out.println("el nombre es " + a2.getNombre());
        System.out.println("el apellido es : " + a2.getApellido());


    }
}

