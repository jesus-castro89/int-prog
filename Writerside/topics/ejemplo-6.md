# Ejemplo 6: Producción de Leche

## Descripción

Un productor de leche lleva el registro de lo que produce en litros, pero cuando entrega le pagan en galones. Realice un
algoritmo, que ayude al productor a saber cuánto recibirá por la entrega de su producción de un día (1 galón = 3.785
litros).

## Desarrollo

De lo previo podemos desprender el siguiente pseudocódigo:

```
CalculoPagoLeche

Definición de Variables:
    Real: litrosProducidos, precioPorGalon, galonesProducidos, pagoTotal

Definición de Constantes:
    Real: LITROS_POR_GALON = 3.785

1. INICIO
2. ESCRIBIR "Ingrese la cantidad de litros producidos en el día:"
3. LEER litrosProducidos
4. ESCRIBIR "Ingrese el precio por galón:"
5. LEER precioPorGalon
6. HACER galonesProducidos = litrosProducidos / LITROS_POR_GALON
7. HACER pagoTotal = galonesProducidos * precioPorGalon
8. ESCRIBIR "El pago total por la producción de leche es: ", pagoTotal
9. FIN
```

## ¿Cómo se ve el código en Java?

![calculo_pago_leche.png](calculo_pago_leche.png){style="block"}

## ¿Cómo funciona el código?

1. **Importación de la clase Scanner**: Se importa la clase `Scanner` del paquete `java.util` para permitir la lectura
   de
   datos desde la entrada estándar (teclado).
2. **Creación de la clase y el método principal**: Se define la clase `CalculoPagoLeche` y el método `main`, que es el
   punto de
   entrada del programa.
3. **Creación del objeto Scanner**: Se crea un objeto `Scanner` llamado `scanner` para leer la entrada del usuario.
4. **Definición de variables y constantes**: Se definen las variables necesarias para almacenar los datos y una
   constante para la conversión
   de litros a galones.
5. **Solicitud de datos al usuario**: Se solicita al usuario que ingrese la cantidad de litros producidos y el precio
   por galón, y se almacenan en las variables `litrosProducidos` y `precioPorGalon`.
6. **Cálculo de galones producidos**: Se calcula la cantidad de galones producidos dividiendo los litros producidos por
   la constante `LITROS_POR_GALON`.
7. **Cálculo del pago total**: Se calcula el pago total multiplicando los galones producidos por el precio por galón.
8. **Mostrar el resultado**: Se muestra el pago total calculado con dos decimales utilizando `System.out.printf`.
9. **Cierre del scanner**: Se cierra el objeto `scanner` para liberar los recursos.