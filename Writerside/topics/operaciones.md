# Expresiones: Aritméticas, Lógicas y Relacionales en Java

En Java, las expresiones son combinaciones de variables, operadores y valores que se evalúan para producir un resultado.
Las expresiones pueden ser de varios tipos, incluyendo aritméticas, lógicas y relacionales. A continuación, se describen
cada uno de estos tipos de expresiones con ejemplos.

## Expresiones Aritméticas

Las expresiones aritméticas se utilizan para realizar operaciones matemáticas básicas como suma, resta, multiplicación,
división y módulo. Los operadores aritméticos en Java son:

| Operador | Descripción    | Ejemplo | Resultado |
|----------|----------------|---------|-----------|
| `+`      | Suma           | `5 + 3` | `8`       |
| `-`      | Resta          | `5 - 3` | `2`       |
| `*`      | Multiplicación | `5 * 3` | `15`      |
| `/`      | División       | `5 / 2` | `2`       |
| `%`      | Módulo (resto) | `5 % 2` | `1`       |

**Ejemplo de Expresión Aritmética en Java:**

```java
int a = 5;
int b = 3;
int suma = a + b; // suma es 8
int resta = a - b; // resta es 2
int multiplicacion = a * b; // multiplicacion es 15
int division = a / b; // division es 1 (división entera)
int modulo = a % b; // modulo es 2
``` 

## Expresiones Relacionales

Las expresiones relacionales se utilizan para comparar dos valores. Los operadores relacionales en Java son:

| Operador | Descripción       | Ejemplo  | Resultado |
|----------|-------------------|----------|-----------|
| `==`     | Igual a           | `5 == 3` | `false`   |
| `!=`     | No igual a        | `5 != 3` | `true`    |
| `>`      | Mayor que         | `5 > 3`  | `true`    |
| `<`      | Menor que         | `5 < 3`  | `false`   |
| `>=`     | Mayor o igual que | `5 >= 3` | `true`    |
| `<=`     | Menor o igual que | `5 <= 3` | `false`   |

**Ejemplo de Expresión Relacional en Java:**

```java
int a = 5;
int b = 3;
boolean esIgual = (a == b); // esIgual es false
boolean esMayor = (a > b); // esMayor es true
boolean esMenor = (a < b); // esMenor es false
boolean esMayorOIgual = (a >= b); // esMayorOIgual es true
boolean esMenorOIgual = (a <= b); // esMenorOIgual es false
boolean esNoIgual = (a != b); // esNoIgual es true
```

## Expresiones Lógicas

Las expresiones lógicas se utilizan para combinar múltiples condiciones. Los operadores lógicos en Java son:

* `&&` (AND): Devuelve `true` si ambas condiciones son verdaderas.
* `||` (OR): Devuelve `true` si al menos una de las condiciones es verdadera.
* `!` (NOT): Invierte el valor de una condición (de `true` a `false` y viceversa).

**Ejemplo de Expresión Lógica en Java:**

```java
int a = 5;
int b = 3;
boolean condicion1 = (a > b) && (a < 10); // condicion1 es true
boolean condicion2 = (a < b) || (b < 10); // condicion2 es true
boolean condicion3 = !(a == b); // condicion3 es true
```

## Combinación de Expresiones

Las expresiones aritméticas, relacionales y lógicas pueden combinarse para formar expresiones más complejas.

**Ejemplo de Combinación de Expresiones en Java:**

```java
int a = 5;
int b = 3;
boolean resultado = ((a + b) > 7) && (a != b); // resultado es true
```

## Resumen

En resumen, las expresiones en Java son fundamentales para realizar cálculos, comparaciones y tomar decisiones en el
flujo de un programa. Comprender cómo utilizar expresiones aritméticas, relacionales y lógicas es esencial para
desarrollar programas efectivos y eficientes en Java.