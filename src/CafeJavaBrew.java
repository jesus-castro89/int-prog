public class CafeJavaBrew {
    void main() {
        int numeroClientes = 0, opcion;
        double ventasTotales = 0, precio, cantidad = 0,
                totalPedido;
        String continuar="",
                menu = """
                        Bienvenido a Café JavaBrew ☕
                        Selecciona el tipo de café:
                        1. Americano ($25)
                        2. Capuchino ($30)
                        3. Latte ($35)
                        """,
                tipoCafe,
                pedidoMensaje = """
                        Pedido: %d taza(s) de %s
                        Total a pagar: $%.2f
                        """,
                ventasMensaje = """
                        Se han atendido %d cliente(s).
                        El total de ventas del día es: $%.2f
                        Gracias por usar Café JavaBrew ☕
                        """;
        // Ciclo principal: se ejecuta al menos una vez
        do {
            // Mostrar menú y solicitar opción
            opcion = Integer.parseInt(IO.readln(menu));
            // Determinar el precio según la opción
            switch (opcion) {
                case 1 -> {
                    tipoCafe = "Americano";
                    precio = 25;
                }
                case 2 -> {
                    tipoCafe = "Capuchino";
                    precio = 30;
                }
                case 3 -> {
                    tipoCafe = "Latte";
                    precio = 35;
                }
                default -> {
                    IO.println("Opción no valida.");
                    // vuelve al inicio del ciclo sin continuar
                    continue;
                }
            }
            // Solicitar cantidad
            do {
                if (cantidad < 0) {
                    IO.println("Cantidad no valida.");
                }
                cantidad = Integer.parseInt(
                        IO.readln("¿Cuántas tazas de " + tipoCafe + " deseas?")
                );
            } while (cantidad <= 0);
            // Calcular total del pedido
            totalPedido = precio * cantidad;
            ventasTotales += totalPedido;
            numeroClientes++;
            IO.println(pedidoMensaje.formatted(
                    cantidad, tipoCafe, totalPedido
            ));
            // Preguntar si hay otro cliente
            // Sin importar lo que escriba, borras espacios
            // y lo conviertes a minúsculas para facilitar la comparación
            continuar = IO.readln("¿Hay otro cliente? (S/N)").trim()
                    .toLowerCase();
        } while (continuar.equals("s"));
        // Mensaje final con el total de ventas y clientes atendidos
        IO.println(ventasMensaje.formatted(numeroClientes, ventasTotales));
    }
}