public class Persona {

    String nombre;

    int edad;

    Persona(String n) {
        nombre = n;
        edad = 0;
    }

    Persona(String n, int e) {
        nombre = n;
        edad = e;
    }

    static void holaMundo() {
        IO.println("Hola Mundo!");
    }

    void saludar() {
        IO.println("Hola! mi nombre es " + nombre
                + " y tengo " + edad + " años.");
    }
}
