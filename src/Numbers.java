public class Numbers {

    void main() {
        int option;
        String menu = """
                Seleccione una operación aritmética:
                1. Suma
                2. Resta
                3. Multiplicación
                4. División
                """;
        option = Integer.parseInt(IO.readln(menu));

        if (option == 1) {
            IO.println("La selección fue suma");
        } else if (option == 2) {
            IO.println("La selección fue resta");
        } else if (option == 3) {
            IO.println("La selección fue multiplicación");
        } else if (option == 4) {
            IO.println("La selección fue división");
        } else {
            IO.println("La selección fue invalida");
        }
    }
}
