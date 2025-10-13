public class Dice {

    void main() {
        String f = IO.readln("Ingrese el nombre de la fruta: ");
        IO.println(f);
        switch (f) {
            case "manzana" -> IO.println("El color de la manzana es rojo");
            case "banana" -> IO.println("El color de la banana es amarillo");
            case "naranja" -> IO.println("El color de la naranja es naranja");
            case String s when s.equalsIgnoreCase("kiwi") ->
                    IO.println("El color del kiwi es marrón por fuera y verde por dentro");
            default -> IO.println("No conozco el color de esa fruta");
        }

        Double sueldo = Double.parseDouble(IO.readln("Ingrese su sueldo: "));
        IO.println(sueldo);
        switch (sueldo) {
            case Double s when s < 1000 -> IO.println("Sueldo bajo");
            case Double s when s >= 1000 && s < 3000 -> IO.println("Sueldo medio");
            case Double s when s >= 3000 && s < 5000 -> IO.println("Sueldo alto");
            case Double s when s >= 5000 -> IO.println("Sueldo muy alto");
            default -> IO.println("Sueldo inválido");
        }
    }
}