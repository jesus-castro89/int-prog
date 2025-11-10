# PR-T5: “Aventura Numérica: El Tesoro del Dragón”

## Descripción General

El proyecto consiste en desarrollar un **minijuego de consola en Java**, donde el jugador debe avanzar por distintas
salas de una cueva custodiada por un dragón. En cada sala encontrará desafíos numéricos (sumas, restas, adivinanzas o
comparaciones), y su desempeño determinará si puede continuar o si pierde puntos de energía.

El objetivo final es **llegar al Tesoro del Dragón con vida (energía positiva)**.
El juego deberá estar modularizado en funciones y usar arreglos para almacenar los datos del jugador, los enemigos y los
retos de cada nivel.

## Requisitos del Proyecto

1. El juego deberá permitir al jugador:
    * Ingresar su nombre y comenzar la partida.
    * Iniciar con una cantidad de energía (por ejemplo, 100 puntos).
    * Enfrentar una serie de retos almacenados en arreglos.
    * Ganar o perder energía según sus respuestas.
    * Terminar la partida al llegar al final o si su energía llega a 0.
2. Los retos pueden ser operaciones matemáticas simples o trivias.
3. El juego debe mostrar mensajes de progreso y un resumen final (energía restante y puntuación total).
4. Todo el programa se ejecutará en ventanas emergentes con la clase `JOptionPane`.

## Estructura del Código

El código del proyecto estará organizado en las siguientes funciones principales:

![p1_skelleton.png](p1_skelleton.png){style="block"}

### Cronograma de entregas

| Semana   | Entrega               | Descripción                                                       | Evidencia                                             |
|----------|-----------------------|-------------------------------------------------------------------|-------------------------------------------------------|
| Semana 1 | Diseño del juego      | Definición de arreglos y estructura base del código.              | Programa con menú inicial y presentación del jugador. |
| Semana 2 | Implementación básica | Funciones `showIntro()` y `playLevel()` funcionando parcialmente. | El juego muestra los niveles y los retos iniciales.   |
| Semana 3 | Lógica completa.      | Validaciones, energía y puntuación implementadas.                 | El jugador puede ganar o perder según sus respuestas  |
| Semana 4 | Pruebas y ajustes     | Corrección de errores y mejoras en la experiencia del usuario.    | Juego funcional y sin errores.                        |

## Criterios de Evaluación

| Criterio                                | Descripción                                                     | Puntos   |
|-----------------------------------------|-----------------------------------------------------------------|----------|
| Funcionalidad                           | El juego cumple con todos los requisitos especificados.         | 20%      |
| Uso adecuado de arreglos y validaciones | Los datos se manejan correctamente con arreglos y validaciones. | 20%      |
| Uso de funciones y arreglos             | El código está modularizado y utiliza arreglos adecuadamente.   | 30%      |
| Experiencia del usuario                 | Mensajes claros y buena interacción con el jugador.             | 20%      |
| Calidad del código                      | Código limpio, bien comentado y organizado.                     | 10%      |
| **Total**                               |                                                                 | **100%** |