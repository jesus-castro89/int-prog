public class Lector {

    private static void showPrettyMessage(String message) {

        IO.println("=== " + message + " ===");
    }

    public static int leerNumero(String mensaje) {

        String palabra;
        do {
            palabra = IO.readln(mensaje);
            if (!palabra.matches("[0-9]+")) {
                showPrettyMessage("Error: Debes introducir un número válido.");
            }
        } while (!palabra.matches("[0-9]+"));
        return Integer.parseInt(palabra);
    }

    void main() {
        int base = leerNumero("Introduce la base del rectángulo:");
        int altura = leerNumero("Introduce la altura del rectángulo:");
        showPrettyMessage("La base del rectángulo es: " + base);
    }
}
