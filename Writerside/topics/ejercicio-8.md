# Ejercicio 8: El juego del ahorcado

El juego del ahorcado es un clásico juego de adivinanza de palabras. En este ejercicio, crearás una versión simple del
juego del ahorcado en Java. El programa seleccionará una palabra al azar de una lista predefinida y el jugador tendrá
que adivinar la palabra letra por letra.

## Instrucciones

1. Crea una lista de palabras que el programa pueda seleccionar al azar.
2. Selecciona una palabra al azar de la lista.
3. Muestra al jugador una serie de guiones bajos que representen las letras de la palabra seleccionada.
4. Permite al jugador adivinar una letra a la vez.
5. Si la letra adivinada está en la palabra, revela todas las posiciones de esa letra en la palabra.
6. Si la letra adivinada no está en la palabra, resta un intento del total de intentos permitidos (por ejemplo, 6).
7. Muestra al jugador el progreso actual de la palabra, las letras adivinadas y el número de intentos restantes.
8. El juego termina cuando el jugador adivina la palabra completa o se queda sin intentos.

## Requisitos

- Utiliza la biblioteca `random` para seleccionar una palabra al azar.
- Asegúrate de manejar entradas inválidas (por ejemplo, si el jugador ingresa más de una letra o un carácter no
  alfabético).
- Proporciona mensajes claros al jugador sobre el estado del juego.

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
| Implementación correcta del juego del ahorcado según las instrucciones. | 40%        |
| Manejo adecuado de entradas inválidas.                                  | 20%        |
| Claridad y organización del código.                                     | 20%        |
| Presentación del documento PDF (portada, capturas, explicaciones).      | 10%        |
| Explicación de los programas                                            | 10%        |
| **Total**                                                               | **100%**   |