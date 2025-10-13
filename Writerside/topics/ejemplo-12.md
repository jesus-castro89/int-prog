# Ejemplo 12: Empleando For

## Descripción

Supongamos que eres el encargado de organizar un evento y necesitas llevar un registro de los asistentes.
Cada asistente debe proporcionar su nombre y edad, y al final del evento, quieres mostrar un resumen con el total de
asistentes y la edad promedio.

Este flujo refleja dos necesidades típicas:

* Repetir la solicitud de datos para un número conocido de asistentes → usar `for`.
* Validar datos (edad > 0, entrada numérica) → usar `while` para repetir la solicitud hasta que la entrada sea válida.

## Requisitos del ejercicio (lo que debe hacer el programa)

1. Solicitar al usuario ingresar el número total de asistentes.
2. Para cada asistente, solicitar su nombre y edad.
3. Validar que la edad sea un número positivo.
4. Calcular la edad promedio de los asistentes.
5. Al final, mostrar el total de asistentes y la edad promedio.

## Estructura sugerida del programa

1. Solicitar el número total de asistentes.
2. Usar un ciclo `for` para iterar desde 1 hasta el número de asistentes.
3. Dentro del ciclo, solicitar el nombre y la edad de cada asistente.
4. Validar la edad usando un ciclo `while` para asegurarse de que sea un número positivo.
5. Acumular la edad total para calcular el promedio.
6. Al finalizar el ciclo, calcular y mostrar la edad promedio y el total de asistentes.

```java
public class RegistroAsistentes {
    
    void main(){
        IO.println("Registro de Asistentes al Evento");
        int totalAsistentes = IO.readInt("Ingrese el número total de asistentes: ");
        int sumaEdades = 0;
        int edad;
        String nombre;
        
        for (int i = 1; i <= totalAsistentes; i++) {
            
            nombre = IO.readString("Ingrese el nombre del asistente " + i + ": ");
            edad = IO.readInt("Ingrese la edad de " + nombre + ": ");
            while (edad <= 0) {
                
                IO.println("Edad inválida. Por favor, ingrese una edad positiva.");
                edad = IO.readInt("Ingrese la edad de " + nombre + ": ");
            }
            sumaEdades += edad;
        }
        double edadPromedio = (double) sumaEdades / totalAsistentes;
        IO.println("Total de asistentes: " + totalAsistentes);
        IO.println("Edad promedio: " + edadPromedio);
    }
}
```