import java.util.Arrays;
import java.util.Comparator;

public class Ejemplo {

    void main() {
        String[] names = {"Ana", "Luis", "Carlos", "Marta",
                "Sofía", "Jorge", "Lucía", "Miguel",
                "Elena", "Diego", "Carmen", "Pablo", "Laura"};
        IO.println("Lista original:");
        IO.println(Arrays.toString(names));
        Arrays.sort(names, Comparator.reverseOrder());
        IO.println("Lista ordenada alfabéticamente:");
        IO.println(Arrays.toString(names));
        // Búsqueda binaria de "Miguel"
        IO.println("Busqueda binaria de \"Miguel\":");
        int pos = Arrays.binarySearch(names,
                "Miguel", Comparator.reverseOrder());
        if (pos >= 0) {
            IO.println("\"Miguel\" encontrado en la posición: " + pos);
        } else {
            IO.println("\"Miguel\" no encontrado en la lista.");
        }
    }
}
