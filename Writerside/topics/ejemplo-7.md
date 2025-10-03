# Ejemplo 7: Condiciones y precios en un restaurante

En un restaurante, el precio de una comida puede variar según varios factores, como el día de la semana, la hora del día
y si hay alguna promoción especial. A continuación, se presentan algunas condiciones y sus respectivos precios:

- **Día de la semana**:
    - Lunes a viernes: Precio estándar
    - Sábado y domingo: Precio con recargo del 10%
- **Hora del día**:
    - Almuerzo (12:00 PM - 3:00 PM): Precio con descuento del 5%
    - Cena (6:00 PM - 10:00 PM): Precio estándar
- **Promociones especiales**:
    - Si hay una promoción especial, se aplica un descuento adicional del 15% sobre el precio final.

## Algoritmo para calcular el precio final

```
CostoPedido

Declaración de Varaibles:
    Real: PrecioBase, PrecioFinal
    Entero: DiaSemana, HoraDia
    Booleano: PromocionEspecial

1. INICIO
2. ESCRIBIR "Ingrese el precio base del pedido:"
3. LEER PrecioBase
4. ESCRIBIR "Ingrese el día de la semana (1-7, donde 1=Lunes, 7=Domingo):"
5. LEER DiaSemana
6. ESCRIBIR "Ingrese la hora del día (en formato 24 horas, por ejemplo, 13 para 1 PM):"
7. LEER HoraDia
8. ESCRIBIR "¿Hay una promoción especial? (1=Sí, 0=No):"
9. LEER PromocionEspecial
10. PrecioFinal = PrecioBase
11. SI DiaSemana >= 6 ENTONCES
        ENTONCES
            PrecioFinal = PrecioFinal * 1.10  // Aplicar recargo del 10%
12. SI HoraDia >= 12 Y HoraDia < 15 ENTONCES
        ENTONCES
            PrecioFinal = PrecioFinal * 0.95  // Aplicar descuento del 5%
13. SI PromocionEspecial = 1 ENTONCES
        ENTONCES
            PrecioFinal = PrecioFinal * 0.85  // Aplicar descuento del 15%
14. ESCRIBIR "El precio final del pedido es: ", PrecioFinal
15. FIN
```

## Código en Java

```java
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
```

## Explicación del código

1. **Declaración de variables**: Se declaran las variables necesarias para almacenar el precio base, el precio final, el
   día de la semana, la hora del día y si hay una promoción especial.
2. **Definición de mensajes**: Se definen constantes para los mensajes que se mostrarán al usuario.
3. **Entrada de datos**: Se solicitan al usuario los datos necesarios (precio base, día de la semana, hora del día y si
   hay promoción) y se leen desde la entrada estándar.
4. **Cálculo del precio final**:
    - Se inicializa `precioFinal` con el valor de `precioBase`.
    - Se verifica si el día de la semana es sábado (6) o domingo (7) para aplicar un recargo del 10%.
    - Se verifica si la hora del día está entre 12 y 14 para aplicar un descuento del 5%.
    - Se verifica si hay una promoción especial para aplicar un descuento adicional del 15%.
5. **Validaciones**: Se incluyen validaciones para asegurarse de que el día de la semana, la hora del día y el valor de
   promoción sean válidos. Si no lo son, se muestra un mensaje de error y se termina el programa.
6. **Salida de datos**: Finalmente, se muestra el precio final del pedido con dos decimales.