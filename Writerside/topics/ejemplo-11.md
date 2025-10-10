# Ejemplo 11: La cafetería

## Descripción

Imagina que trabajas en una pequeña cafetería llamada JavaBrew.
Cada cliente que llega hace un pedido de café y tú, como encargado del sistema, necesitas calcular cuánto debe pagar.

Este flujo refleja dos necesidades típicas:

* Repetir el menú tantas veces como quiera el cliente → usar do...while.
* Validar datos (cantidad > 0, pago positivo, entrada numérica) → usar while para repetir la solicitud hasta que la
  entrada sea válida.

## Requisitos del ejercicio (lo que debe hacer el programa)

1. Mostrar un menú de opciones con tres tipos de café y sus precios.
2. Permitir que el usuario elija el tipo de café y la cantidad de tazas.
3. Calcular el costo total de ese pedido.
4. Preguntar si hay otro cliente en la fila.
5. Repetir el proceso mientras sigan llegando clientes.
6. Al final, mostrar el total de ventas del día.

## Estructura sugerida del programa

1. Mostrar el menú de opciones de café
    * Café americano → $25
    * Café capuchino → $30
    * Café latte → $35
2. Solicitar el tipo de café (1, 2 o 3).
3. Solicitar la cantidad de tazas.
4. Calcular el total de ese pedido y mostrarlo.
5. Acumular el total en una variable general (ventasTotales).
6. Preguntar si hay otro cliente (sí/no) usando un do...while.
7. Terminar cuando el usuario responda “no”.
8. Mostrar el total del día.

## Código de ejemplo

```java
import javax.swing.JOptionPane;

public class CafeJavaBrew {
    public static void main(String[] args) {

        double ventasTotales = 0;
        String continuar;

        // Ciclo principal: se ejecuta al menos una vez
        do {
            // Mostrar menú de cafés
            String menu = "Bienvenido a Café JavaBrew ☕\n"
                    + "Selecciona el tipo de café:\n"
                    + "1. Americano ($25)\n"
                    + "2. Capuchino ($30)\n"
                    + "3. Latte ($35)\n";

            int opcion = Integer.parseInt(
                    JOptionPane.showInputDialog(menu)
            );

            double precio = 0;
            String tipoCafe = "";

            // Determinar el precio según la opción
            if (opcion == 1) {
                tipoCafe = "Americano";
                precio = 25;
            } else if (opcion == 2) {
                tipoCafe = "Capuchino";
                precio = 30;
            } else if (opcion == 3) {
                tipoCafe = "Latte";
                precio = 35;
            } else {
                JOptionPane.showMessageDialog(null, "Opción no válida. Intenta nuevamente.");
                continue; // vuelve al inicio del ciclo sin continuar
            }

            // Solicitar cantidad
            int cantidad = Integer.parseInt(
                    JOptionPane.showInputDialog("¿Cuántas tazas de " + tipoCafe + " deseas?")
            );

            // Calcular total del pedido
            double totalPedido = precio * cantidad;
            ventasTotales += totalPedido;

            JOptionPane.showMessageDialog(null,
                    "Pedido: " + cantidad + " taza(s) de " + tipoCafe + "\n"
                            + "Total a pagar: $" + totalPedido
            );

            // Preguntar si hay otro cliente
            continuar = JOptionPane.showInputDialog("¿Hay otro cliente? (sí/no)");

        } while (continuar != null && continuar.equalsIgnoreCase("sí"));

        // Mostrar el total de ventas del día
        JOptionPane.showMessageDialog(null,
                "El total de ventas del día es: $" + ventasTotales + "\nGracias por usar Café JavaBrew ☕"
        );
    }
}
```

## Explicación del código

1. **Variables**: `ventasTotales` acumula las ventas del día. `continuar` controla si hay más clientes.
2. **Ciclo do...while**: Permite repetir el proceso mientras haya clientes.
3. **Menú y selección**: Se muestra un menú y se captura la opción del café.
4. **Validación de opción**: Si la opción no es válida, se muestra un mensaje y se reinicia el ciclo.
5. **Cantidad y cálculo**: Se solicita la cantidad, se calcula el total del pedido y se acumula en `ventasTotales`.
6. **Continuar**: Se pregunta si hay otro cliente. Si la respuesta es "sí", el ciclo se repite.
7. **Total del día**: Al finalizar, se muestra el total de ventas del día.

## Extensión opcional (para avanzar luego)

* Validar que la cantidad de tazas no sea negativa ni cero.
* Mostrar un resumen con el número de clientes atendidos.
* Agregar otro producto como pan o pastel y combinar pedidos.