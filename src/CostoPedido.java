public class CostoPedido {

    void main() {
        // Declaración de variables
        double precioBase, precioFinal;
        int diaSemana, horaDia, promocion;
        // Definición de los mensajes (Constantes)
        final String MSG_BASE = "Ingresa el precio base del pedido:";
        final String MSG_DIA = "Ingresa el día de la semana (1-7):";
        final String MSG_HORA = "Ingresa la hora del día (0-23):";
        final String MSG_PROMO = "Cuentas con una promoción? (1-Sí, 0-No):";
        final String MSG_RESULT = "El precio final del pedido es: %.2f";

        // Entrada de datos
        // Leer el precio base
        precioBase = Double.parseDouble(IO.readln(MSG_BASE));
        // Leer el día de la semana
        diaSemana = Integer.parseInt(IO.readln(MSG_DIA));
        // Leer la hora del día
        horaDia = Integer.parseInt(IO.readln(MSG_HORA));
        // Leer si cuenta con promoción
        promocion = Integer.parseInt(IO.readln(MSG_PROMO));

        // Cálculo del precio final
        precioFinal = precioBase;
        // Aplicar el 10% de recargo si es fin de semana
        if (diaSemana == 6 || diaSemana == 7) {

            precioFinal *= 1.10;
        } else if (diaSemana < 1 || diaSemana > 7) {

            IO.println("Día de la semana inválido. Debe ser entre 1 y 7.");
            System.exit(0);
        }
        // Aplicar un descuento del 5% si la hora es entre 12 y 14
        if (horaDia >= 12 && horaDia <= 14) {

            precioFinal *= 0.95;
        } else if (horaDia < 0 || horaDia > 23) {

            IO.println("Hora del día inválida. Debe ser entre 0 y 23.");
            System.exit(0);
        }
        // Aplicar un descuento adicional del 15% si cuenta con promoción
        if (promocion == 1) {

            precioFinal *= 0.85;
        } else if (promocion != 0) {

            IO.println("Valor de promoción inválido. Debe ser 1 (Sí) o 0 (No).");
            System.exit(0);
        }
        // Mostrar el precio final con dos decimales
        IO.println(MSG_RESULT.formatted(precioFinal));
    }
}