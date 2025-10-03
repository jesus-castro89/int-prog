public class CostoPedido {

    void main() {
        // Declaración de variables
        double precioBase, precioFinal;
        int diaSemana, horaDia;
        boolean promocion;

        // Solicitamos el precio base al usuario
        precioBase = Double.parseDouble(
                IO.readln("Ingrese el precio base del pedido: "));
        // Solicitamos el día de la semana (1:Lunes, ..., 7: Domingo)
        diaSemana = Integer.parseInt(
                IO.readln("Ingrese el día de la semana (1-7): "));
        // Solicitamos la hora del día (0-23)
        horaDia = Integer.parseInt(
                IO.readln("Ingrese la hora del día (0-23): "));
        // Solicitamos si hay promoción activa
        promocion = Boolean.parseBoolean(
                IO.readln("¿Hay promoción activa? (true/false): "));

        // Asignamos el precio final inicialmente al precio base
        precioFinal = precioBase;

        // Si es fin de semana (sábado o domingo), aumenta 10%
        if (diaSemana >= 6) {
            precioFinal *= 1.10; // Aumenta 10% el fin de semana
        }

        // Si es horario de almuerzo (12 a 14 horas), aplica 5% de descuento
        if (horaDia >= 12 && horaDia <= 14) {
            precioFinal *= 0.95; // Descuento del 5% en horario de almuerzo
        }

        // Si hay promoción activa, aplica 15% de descuento
        if (promocion) {
            precioFinal *= 0.85; // Descuento del 15% si hay promoción
        }

        // Mostramos el precio final del pedido
        IO.println("El precio final del pedido es: " + precioFinal);
    }
}