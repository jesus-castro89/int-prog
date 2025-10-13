# Ejemplo 13: Control de mantenimiento de vehículos

## Descripción

Imagina que trabajas en una agencia de autos que necesita realizar un mantenimiento periódico a su flota de vehículos.
Cada vehículo tiene un kilometraje diferente, y deseas verificar cuántos de ellos ya superaron los 10,000 km y, por
tanto, necesitan servicio.

Para esto, recorrerás una lista de vehículos uno por uno usando un ciclo for, revisando su kilometraje.

> Piensa en el ciclo for como un mecánico que revisa una fila de autos. El mecánico comienza con el primer vehículo (
> inicio). Luego verifica cada auto hasta llegar al último (condición). Y avanza de uno en uno por la fila (incremento).
> {style="note"}

## Requisitos del ejercicio (lo que debe hacer el programa)

1. Solicitar al usuario ingresar el número total de vehículos en la flota.
2. Para cada vehículo, solicitar su kilometraje actual.
3. Contar cuántos vehículos tienen más de 10,000 km.
4. Al final, mostrar el total de vehículos que necesitan mantenimiento.

## Estructura sugerida del programa

1. Solicitar el número total de vehículos.
2. Usar un ciclo `for` para iterar desde 1 hasta el número de vehículos.
3. Dentro del ciclo, solicitar el kilometraje de cada vehículo.
4. Usar una estructura condicional `if` para verificar si el kilometraje es mayor a 10,000 km.
5. Si es así, incrementar un contador de vehículos que necesitan mantenimiento.
6. Al finalizar el ciclo, mostrar el total de vehículos que necesitan mantenimiento.

```java
public class MantenimientoVehiculos {

    void main(){
        IO.println("Control de Mantenimiento de Vehículos");
        int totalVehiculos = IO.readInt("Ingrese el número total de vehículos en la flota: ");
        int kilometraje;
        int contadorMantenimiento = 0;

        for (int i = 1; i <= totalVehiculos; i++) {

            kilometraje = IO.readInt("Ingrese el kilometraje del vehículo " + i + ": ");
            if (kilometraje > 10000) {

                contadorMantenimiento++;
            }
        }
        IO.println("Total de vehículos que necesitan mantenimiento: " + contadorMantenimiento);
    }
}
```