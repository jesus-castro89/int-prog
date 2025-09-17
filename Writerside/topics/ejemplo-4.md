# Ejemplo 4: Cálculo de IMC en Java

## Descripción

El Índice de Masa Corporal (IMC) es una medida utilizada para evaluar si una persona tiene un peso saludable en relación
con su altura. El IMC se calcula utilizando la fórmula:

```tex
IMC = \frac{peso (kg)}{altura (m)^2}
```

Escribe un programa en Java que solicite al usuario su peso en kilogramos y su altura en metros, y luego calcule y
muestre su IMC.

## Desarrollo

![ejemplo-4.png](ejemplo-4.png){style="block"}

## ¿Cómo funciona el código?

1. **Importación de la clase Scanner**: Se importa la clase `Scanner` del paquete `java.util` para permitir la lectura
   de datos desde la entrada estándar (teclado).
2. **Creación de la clase y el método principal**: Se define la clase `CalculoIMC` y el método `main`, que es el punto
   de
   entrada del programa.
3. **Creación del objeto Scanner**: Se crea un objeto `Scanner` llamado `scanner` para leer la entrada del usuario.
4. **Solicitud de datos al usuario**: Se solicita al usuario que ingrese su peso y altura, y se almacenan en las
   variables `peso` y `altura`.
5. **Cálculo del IMC**: Se calcula el IMC utilizando la fórmula proporcionada y se almacena en la variable `imc`.
6. **Mostrar el resultado**: Se muestra el IMC calculado con dos decimales utilizando `System.out.printf`.
7. **Cierre del scanner**: Se cierra el objeto `scanner` para liberar los recursos.