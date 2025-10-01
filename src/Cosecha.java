public class Cosecha {

    void main() {

        // Texto del primer menú
        final String frutas = """
                Seleccione el tipo de fruta:
                1. Manzanas
                2. Naranjas
                3. Plátanos
                """;
        // Texto del segundo menú
        final String calidades = """
                Seleccione la calidad de la cosecha:
                1. Alta calidad
                2. Media calidad
                3. Baja calidad
                """;

        // Declaración de variables
        // La calidad de la cosecha
        int calidadSeleccionada;
        // El peso de la cosecha
        double pesoCosecha;
        // Total de la cosecha
        double totalCosecha;
        // La fruta seleccionada
        int frutaSeleccionada = Integer.parseInt(IO.readln(frutas));

        // Flujo del Programa
        if (frutaSeleccionada < 1 || frutaSeleccionada > 3) {

            IO.println("Se ha seleccionado una opción invalida");
        } else {

            calidadSeleccionada = Integer.parseInt(IO.readln(calidades));
            if (calidadSeleccionada < 1 || calidadSeleccionada > 3) {

                IO.println("Se ha seleccionado una opción invalida");
            }else{

            }
        }
    }
}
