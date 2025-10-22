# Ejercicio 7: Uso de Arreglos

## Instrucciones

1. Crea un programa en Java que satisfaga cada una de las condiciones planteadas.
2. Utiliza estructuras de control como `for` según sea necesario.
3. Asegúrate de que el programa sea claro y fácil de entender.
4. Comenta tu código para explicar cada parte.

## 1. Control de ventas diarias

Una tienda desea registrar las ventas de la semana (7 días).
El programa debe permitir:

* Registrar el monto vendido por día.
* Calcular el total de ventas semanales.
* Determinar el día con la venta más alta y el más bajo.
* Mostrar el promedio de ventas.

### Ejemplo de ejecución esperada #1:

```
Ingrese las ventas del día 1: 2500
Ingrese las ventas del día 2: 3100
...
Total semanal: $19800.00
Promedio diario: $2828.57
Mayor venta: Día 2 ($3100.00)
Menor venta: Día 5 ($2100.00)
```

## 2. Registro de calificaciones de estudiantes

Imagina que eres el encargado de calificaciones de un curso y debes ingresar las calificaciones de los estudiantes de un
examen para luego calcular el promedio de la clase, la nota más alta, la más baja y cuántos aprobaron. Usaremos un
arreglo para guardar todas las notas.

### Ejemplo de ejecución esperada #2:

```
Ingrese el número de estudiantes: 5
Ingrese la calificación del estudiante 1: 75
Ingrese la calificación del estudiante 2: 88
...
Promedio de la clase: 82.60
Calificación más alta:  90
Calificación más baja:  65
Número de estudiantes aprobados: 4
```

## 3. Gestión de ocupación en un hotel

Un hotel tiene 4 pisos y 5 habitaciones por piso.
Cada habitación puede estar:

* Ocupada (1) o
* Libre (0).

El programa debe:

* Registrar el estado inicial del hotel (1 o 0 por habitación).
* Calcular cuántas habitaciones están ocupadas por piso.
* Mostrar el porcentaje total de ocupación del hotel.
* Permitir consultar si una habitación específica está disponible.

### Ejemplo de ejecución esperada #3:

```
Ingrese estado de las habitaciones (1 = ocupada, 0 = libre):
Piso 1, Habitación 1: 0
...
Piso 4, Habitación 5: 1

Ocupación total: 13 de 20 habitaciones (65%)
Piso 2 tiene 4 habitaciones ocupadas.
...

Ingrese el piso de la habitación a consultar: 3
Ingrese el número de habitación a consultar: 4
La habitación 4 del piso 3 está ocupada.
```

## Entregable

En un solo documento PDF, incluir:

1. Portada con los siguientes datos:
    * Nombre del curso.
    * Nombre del profesor.
    * Nombre de los integrantes del equipo.
    * Fecha de entrega.
2. Código fuente de los programas en Java.
3. Capturas de pantalla mostrando la ejecución de cada programa con diferentes entradas.
4. Breve explicación de cómo funciona cada programa y las decisiones tomadas en la implementación.

> **Nota**: Asegúrate de probar cada programa con diferentes entradas para verificar que funcionan correctamente en
> todos los casos.
> {style="note"}

> **Alumno que no aparezca en la portada no tendrá derecho a calificación.**
> {style="warning"}

> **Actividades entregadas fuera de la fecha de entrega, serán evaluadas con una calificación máxima de 70.**
> {style="warning"}

## Criterios de Evaluación

| Criterio                                                                | Puntuación |
|-------------------------------------------------------------------------|------------|
| Correcta implementación de los arreglos                                 | 40%        |
| Claridad y organización del código                                      | 20%        |
| Uso adecuado de la entrada y salida (Debe incluir capturas de pantalla) | 20%        |
| Presentación del documento                                              | 10%        |
| Explicación de los programas                                            | 10%        |
| **Total**                                                               | **100%**   |