public class DiaSemana {

    void main() {
        String mensaje = """
                Ingresa un número del 1 al 7 para conocer el día de la semana:
                """;
        int dia = Integer.parseInt(IO.readln(mensaje));

        // Usando la sintaxis tradicional
        switch (dia) {
            case 1:
                IO.println("Lunes");
                break;
            case 2:
                IO.println("Martes");
                break;
            case 3:
                IO.println("Miércoles");
                break;
            case 4:
                IO.println("Jueves");
                break;
            case 5:
                IO.println("Viernes");
                break;
            case 6:
                IO.println("Sábado");
                break;
            case 7:
                IO.println("Domingo");
                break;
            default:
                IO.println("Día inválido");
                break;
        }

        // Usando la nueva sintaxis (Java 14+)
        switch (dia) {
            case 1 -> IO.println("Lunes");
            case 2 -> IO.println("Martes");
            case 3 -> IO.println("Miércoles");
            case 4 -> IO.println("Jueves");
            case 5 -> IO.println("Viernes");
            case 6 -> IO.println("Sábado");
            case 7 -> IO.println("Domingo");
            default -> IO.println("Día inválido");
        }

        // Oh bien, usando el switch como el valor de una variable
        IO.println(
                switch (dia) {
                    case 1 -> "Lunes";
                    case 2 -> "Martes";
                    case 3 -> "Miércoles";
                    case 4 -> "Jueves";
                    case 5 -> "Viernes";
                    case 6 -> "Sábado";
                    case 7 -> "Domingo";
                    default -> "Día inválido";
                }
        );
    }
}