# Ejercicio 5: Mientras y Hasta que

## Descripción

Este ejercicio te desafía a utilizar las estructuras de control `while` (mientras) y `do...while` (hasta que) en Java.
Estas estructuras permiten ejecutar un bloque de código repetidamente mientras se cumpla una condición específica.

## Problemas

1. **Sumando cantidades**: Crea un programa que solicite al usuario ingresar números mientras el lo desee. El programa
   debe sumar todos los números ingresados y mostrar el resultado final cuando el usuario decida detenerse. Ten en
   cuenta que el usuario puede ingresar cualquier cantidad de números, incluyendo cero y números negativos.
2. **El factorial de un número**: Crea un programa que solicite al usuario ingresar un número entero positivo y calcule
   su factorial utilizando un bucle `do...while`. El programa debe manejar el caso en que el usuario ingrese un número
   negativo mostrando un mensaje de error.
3. **Control de asistencia**: Crea un programa que permita registrar la asistencia de estudiantes en una clase. El
   programa debe solicitar al usuario ingresar el nombre del estudiante y si asistió o no (S/N). El proceso debe
   repetirse hasta que el usuario decida finalizar la entrada de datos. Al final, el programa debe mostrar un resumen
   con el total de estudiantes y cuántos asistieron.
    * Para este ejercicio deberás usar la función `String.equalsIgnoreCase` para comparar cadenas sin importar
      mayúsculas o minúsculas.
    * Debes usar la función `String.trim` para eliminar espacios en blanco al inicio y al final de la cadena.
    * De la siguiente manera:
      ![e5_1.png](e5_1.png){style="block"}
4. **La gasolinera**: Crea un programa que simule el proceso de llenado de un tanque de gasolina que no puede exceder
   los 50 litros. El programa debe solicitar al usuario ingresar la cantidad de litros a llenar en cada iteración y
   sumar esta cantidad al total del tanque. Si el usuario intenta llenar más de 50 litros, el programa debe mostrar un
   mensaje de error y no permitir que se exceda el límite. El proceso debe repetirse hasta que el tanque esté lleno o
   el usuario decida detenerse.
    * Debes usar la función `Math.min` para asegurarte de que el tanque no exceda los 50 litros.
    * De la siguiente manera:
      ![e5_2.png](e5_2.png){style="block"}
    * Puedes usar la función `Math.max` para asegurarte de que la cantidad ingresada no sea negativa.
    * Ambas funciones permiten manejar límites de manera sencilla y efectiva.
5. **Gastos Semanales**: Crea un programa que permita al usuario ingresar sus gastos mientras así lo desee. El programa
   debe sumar todos los gastos ingresados y mostrar el total al finalizar. Si el usuario ingresa un gasto negativo,
   el programa debe mostrar un mensaje de error y no incluir ese gasto en la suma total.

## Recomendaciones

- Asegúrate de manejar adecuadamente la entrada del usuario, incluyendo la conversión de cadenas a números y la
  validación de datos.
- Utiliza comentarios en tu código para explicar la lógica y los pasos que estás siguiendo.
- Prueba tu programa con diferentes escenarios para asegurarte de que funciona correctamente en todos los casos.
- Recuerda que puedes usar tanto `while` como `do...while` según lo que consideres más adecuado para cada problema.
- No dudes en buscar ayuda o consultar recursos adicionales si te encuentras con dificultades.

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

| Criterio                                   | Puntuación |
|--------------------------------------------|------------|
| Correcta implementación de las condiciones | 40%        |
| Claridad y organización del código         | 20%        |
| Uso adecuado de la entrada y salida        | 20%        |
| Presentación del documento                 | 10%        |
| Explicación de los programas               | 10%        |
| **Total**                                  | **100%**   |