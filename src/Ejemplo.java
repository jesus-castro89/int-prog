import java.util.Arrays;
import java.util.Comparator;

public class Ejemplo {

    void main() {
        Persona personas[] = {
            new Persona("Ana", 25),
            new Persona("Luis", 30),
            new Persona("Carlos", 20),
            new Persona("Beatriz", 28)
        };
        for(int i = 0; i < personas.length; i++) {
            IO.println("La Persona " + (i+1) + ": se llama "
                    + personas[i].nombre + ", y tiene "
                    + personas[i].edad + " años");
        }
    }
}
