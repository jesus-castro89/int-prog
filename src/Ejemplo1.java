public class Ejemplo1 {

    void main() {
        IO.println("Registro de Asistentes al Evento");
        int totalAsistentes = Integer.parseInt(IO.readln(
                "Ingrese el número total de asistentes: "));
        int sumaEdades = 0;
        int edad;
        String nombre;

        for (int i = 1; i <= totalAsistentes; i++) {

            nombre = IO.readln("Ingrese el nombre del asistente " + i + ": ");
            edad = Integer.parseInt(IO.readln("Ingrese la edad de " + nombre + ": "));
            while (edad <= 0) {

                IO.println("Edad inválida. Por favor, ingrese una edad positiva.");
                edad = Integer.parseInt(IO.readln("Ingrese la edad de " + nombre + ": "));
            }
            sumaEdades += edad;
        }
        double edadPromedio = (double) sumaEdades / totalAsistentes;
        IO.println("Total de asistentes: " + totalAsistentes);
        IO.println("Edad promedio: " + edadPromedio);
    }
}