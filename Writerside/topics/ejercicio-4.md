# Ejercicio 4: Condiciones y casos en Java

## Descripción

Crear la implementación en Java de los siguientes ejercicios que involucren estructuras condicionales y de selección
múltiple:

## Instrucciones

1. Crea un programa en Java que satisfaga cada una de las condiciones planteadas.
2. Utiliza estructuras de control como `if`, `else if`, `else` y `switch` según sea necesario.
3. Asegúrate de que el programa sea claro y fácil de entender.
4. Comenta tu código para explicar cada parte.

### Clasificación de edades

Escribe un programa que solicite al usuario su edad y clasifique a la persona en una de las siguientes categorías:

* Niño: 0-12 años
* Adolescente: 13-19 años
* Adulto: 20-64 años
* Anciano: 65 años o más

En caso de que la edad ingresada sea negativa, el programa debe mostrar un mensaje de error indicando que la edad no
puede ser negativa.

### Sistema presidencial

El presidente de la república ha decidido estimular a todos los estudiantes de una universidad mediante la asignación de
becas mensuales, para esto se tomarán en consideración los siguientes criterios:

Para alumnos mayores de 18 años:

* Si el promedio es mayor o igual a 9.0, la beca será de $2000.
* Si el promedio es mayor o igual a 8.0 pero menor que 9.0, la beca será de $1000.
* Si el promedio es mayor o igual a 7.0 pero menor que 8.0, la beca será de $500.
* Si el promedio es menor que 7.0, no se otorgará beca y se redactará una carta de compromiso.

Para alumnos menores de 18 años:

* Si el promedio es mayor o igual a 9.0, la beca será de $3000.
* Si el promedio es mayor o igual a 8.0 pero menor que 9.0, la beca será de $2000.
* Si el promedio es mayor o igual a 7.0 pero menor que 8.0, la beca será de $1000.
* Si el promedio es menor que 7.0, no se otorgará beca y se redactará una carta de compromiso.

El programa debe solicitar al usuario su edad y su promedio, y luego mostrar el monto de la beca que le corresponde o
indicar que debe redactar una carta de compromiso si no cumple con los requisitos para recibir una beca.

### Cosechas de frutas

Una empresa agrícola desea clasificar las cosechas de frutas según su tipo y calidad. Las frutas pueden ser manzanas,
naranjas o plátanos, y la calidad puede ser alta, media o baja.

El programa debe solicitar al usuario el tipo de fruta, su calidad y el peso de la cosecha en kilogramos. Luego, debe
mostrar un mensaje indicando la clasificación de la cosecha y el precio total según las siguientes reglas:

* Manzanas:
    * Alta calidad: $3 por kg
    * Media calidad: $2 por kg
    * Baja calidad: $1 por kg
* Naranjas:
    * Alta calidad: $4 por kg
    * Media calidad: $3 por kg
    * Baja calidad: $2 por kg
* Plátanos:
    * Alta calidad: $2 por kg
    * Media calidad: $1.5 por kg
    * Baja calidad: $1 por kg

Si el tipo de fruta o la calidad ingresada no es válida, el programa debe mostrar un mensaje de error indicando que la
entrada no es correcta.

Por último, el programa debe calcular y mostrar el precio total de la cosecha multiplicando el peso por el precio por kg
según la clasificación determinada. De la siguiente manera:

```
Tipo de fruta: Manzana
Calidad: Alta
Peso: 10 kg
Precio por kg: $3
Precio total: $30
```

### La fabrica de papel

Una fábrica de papel necesita un programa que ayude a clasificar los tipos de papel que produce según su grosor y
tamaño. El programa debe solicitar al usuario el grosor del papel en micrómetros y el tamaño del papel (A4, A3, A2, A1,
A0).

El programa debe clasificar el papel en las siguientes categorías:

* Grosor:
    * Delgada: menos de 70 micrómetros
    * Media: entre 70 y 150 micrómetros
    * Gruesa: más de 150 micrómetros
* Tamaño:
    * A4: 210 x 297 mm
    * A3: 297 x 420 mm
    * A2: 420 x 594 mm
    * A1: 594 x 841 mm
    * A0: 841 x 1189 mm

El programa debe mostrar un mensaje indicando la clasificación del papel según su grosor y tamaño. Si el grosor o el
tamaño ingresado no es válido, el programa debe mostrar un mensaje de error indicando que la entrada no es correcta.
Por último, el programa debe calcular y mostrar el área del papel en metros cuadrados según el tamaño ingresado. De la
siguiente manera:

```
Grosor: Media
Tamaño: A3
Área: 0.1254 m²
```

## La fabrica de pantalones

Realice un algoritmo para resolver el siguiente problema: una fábrica de pantalones desea calcular cuál es el precio
final de venta y cuánto ganará por los N pantalones que produzca con el corte de
alguno de sus modelos, para esto se cuenta con la siguiente información:

* Tiene dos modelos A y B, tallas 30, 32 y 36 para ambos modelos..
* Para el modelo A se utiliza 1.50 m de tela, y para el B 1.80 m.
* Al modelo A se le carga 80 % del costo de la tela, por mano de obra. Al modelo B se le carga 95 % del costo de la
  tela, por el mismo concepto
* A las tallas 32 y 36 se les carga 4 % del costo generado por mano de obra y tela, sin importar el modelo.
* Cuando se realiza el corte para fabricar una prenda sólo se hace de un solo modelo y una sola talla.
* A la suma de estos costos se les carga 30%, que representa la ganancia extra de la tienda.
* El costo de la tela es de $12.50 por metro.

El programa debe solicitar al usuario el modelo (A o B), la talla (30, 32 o 36) y la cantidad de pantalones a producir.
Luego, debe calcular y mostrar el precio final de venta por pantalón y la ganancia total por la producción de N
pantalones. Si el modelo o la talla ingresada no es válida, el programa debe mostrar un mensaje de error indicando que
la entrada no es correcta.

Por último, el programa debe mostrar un resumen de la producción, incluyendo el modelo, la talla, la cantidad de
pantalones, el precio final por pantalón y la ganancia total. De la siguiente manera:

```
Modelo: A
Talla: 32
Cantidad: 50
Precio final por pantalón: $45.50
Ganancia total: $2275.00
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

| Criterio                                   | Puntuación |
|--------------------------------------------|------------|
| Correcta implementación de las condiciones | 40%        |
| Claridad y organización del código         | 20%        |
| Uso adecuado de la entrada y salida        | 20%        |
| Presentación del documento                 | 10%        |
| Explicación de los programas               | 10%        |
| **Total**                                  | **100%**   |