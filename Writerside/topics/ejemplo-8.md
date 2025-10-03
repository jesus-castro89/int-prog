# Ejemplo 8: Condiciones continuas con Java

## Descripción #1

En este ejemplo, se muestra cómo utilizar condiciones continuas en un programa Java para controlar el flujo de ejecución
basado en valores numéricos.

## Código

```java
public class CondicionesContinuas {
    void main() {
        int numero = Integer.parseInt(IO.readln("Ingresa un número: "));

        if (numero < 5) {
            IO.println("El número es menor que 5");
        } else if (numero <= 10) {
            IO.println("El número está entre 5 y 10");
        } else {
            IO.println("El número es mayor que 10");
        }
    }
}
```

## Explicación

1. Se define una clase llamada `CondicionesContinuas`.
2. Se define el método `main` que es el punto de entrada del programa.
3. Se lee un número entero desde la entrada estándar utilizando `IO.readln` y se convierte a un entero con
   `Integer.parseInt`.
4. Se utiliza una estructura de control `if-else if-else` para evaluar el valor del número ingresado:
    - Si el número es menor que 5, se imprime "El número es menor que 5".
    - Si el número está entre 5 y 10 (inclusive), se imprime "El número está entre 5 y 10".
    - Si el número es mayor que 10, se imprime "El número es mayor que 10".
5. El programa termina después de evaluar las condiciones y mostrar el mensaje correspondiente.

## Descripción #2

Supongamos el lanzamiento de un dado y los siguientes supuestos:

* Si el número es 1 o 5, el jugador pierde.
* Si el número es 2 o 4, el jugador gana.
* Si el número es 3 o 6, el jugador empata.

Para resolver este problema, podemos utilizar una estructura de control `if-else if-else` para evaluar el valor del dado
y determinar el resultado del juego. Aunque también podríamos usar una estructura `switch`, en este caso es más adecuado
utilizar `if-else if-else` debido a la naturaleza de las condiciones.

Veamos ambos enfoques:

### Usando `if-else if-else`

```java
public class JuegoDado {
    void main() {
        int dado = Integer.parseInt(IO.readln("Ingresa el número del dado (1-6): "));
        if (dado == 1 || dado == 5) {
            IO.println("El jugador pierde.");
        } else if (dado == 2 || dado == 4) {
            IO.println("El jugador gana.");
        } else if (dado == 3 || dado == 6) {
            IO.println("El jugador empata.");
        } else {
            IO.println("Número inválido. Debe ser entre 1 y 6.");
        }
    }
}
```

### Usando `switch`

```java
public class JuegoDado {
    void main() {
        int dado = Integer.parseInt(IO.readln("Ingresa el número del dado (1-6): "));
        switch (dado) {
            case 1, 5 -> IO.println("El jugador pierde.");
            case 2, 4 -> IO.println("El jugador gana.");
            case 3, 6 -> IO.println("El jugador empata.");
            default -> IO.println("Número inválido. Debe ser entre 1 y 6.");
        }
    }
}
```

Ahora veamos como era antes de Java 14:

```java
public class JuegoDado {
    void main() {
        int dado = Integer.parseInt(IO.readln("Ingresa el número del dado (1-6): "));
        switch (dado) {
            case 1:
            case 5:
                IO.println("El jugador pierde.");
                break;
            case 2:
            case 4:
                IO.println("El jugador gana.");
                break;
            case 3:
            case 6:
                IO.println("El jugador empata.");
                break;
            default:
                IO.println("Número inválido. Debe ser entre 1 y 6.");
                break;
        }
    }
}
```

