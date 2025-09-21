# Las preguntas lógicas en la escritura

Dentro de un programa, las preguntas lógicas son fundamentales para controlar el flujo de ejecución y tomar decisiones
basadas en condiciones específicas. Estas preguntas se evalúan utilizando operadores lógicos y estructuras
condicionales.

## Operadores lógicos

Los operadores lógicos son símbolos que permiten combinar o modificar condiciones booleanas (verdadero o falso). Los
operadores lógicos más comunes en Java son:

* `&&` (AND lógico): Devuelve verdadero si ambas condiciones son verdaderas.
* `||` (OR lógico): Devuelve verdadero si al menos una de las condiciones es verdadera.
* `!` (NOT lógico): Invierte el valor de una condición (verdadero se convierte en falso y viceversa).

Para entender mejor cómo funcionan estos operadores, consideremos los siguientes ejemplos:

```java
boolean a = true;
boolean b = false;

boolean resultadoAND = a && b; // resultadoAND es false
boolean resultadoOR = a || b;  // resultadoOR es true
boolean resultadoNOT = !a;      // resultadoNOT es false
```

Podemos entender de igual manera ambos operadores con tablas de verdad:

| `A`   | `!A`  |
|-------|-------|
| true  | false |
| false | true  |

| `A`   | `B`   | `A && B` | `A || B` |
|-------|-------|----------|----------|
| true | true | true | true |
| true | false | false | true |
| false | true | false | true |
| false | false | false | false |

## Mezclando operadores lógicos

Los operadores lógicos se pueden combinar para formar expresiones más complejas. Es importante tener en cuenta la
precedencia de los operadores, donde `!` tiene la mayor precedencia, seguido por `&&`, y luego `||`. Para evitar
confusiones, es recomendable usar paréntesis para agrupaciones explícitas.

```java
boolean a = true;
boolean b = false;
boolean c = true;

boolean resultado = (a && b) || c; // resultado es true
```

## Mezclando operadores lógicos con operadores relacionales

Los operadores relacionales se utilizan para comparar valores y devolver un resultado booleano. Los operadores
relacionales más comunes en Java son:

* `==` (igual a): Devuelve verdadero si ambos valores son iguales.
* `!=` (diferente de): Devuelve verdadero si ambos valores son diferentes.
* `>` (mayor que): Devuelve verdadero si el valor de la izquierda es mayor que el de la derecha.
* `<` (menor que): Devuelve verdadero si el valor de la izquierda es menor que el de la derecha.
* `>=` (mayor o igual que): Devuelve verdadero si el valor de la izquierda es mayor o igual que el de la derecha.
* `<=` (menor o igual que): Devuelve verdadero si el valor de la izquierda es menor o igual que el de la derecha.

Estos operadores se pueden combinar con operadores lógicos para formar expresiones condicionales más complejas. Por
ejemplo:

```java
int x = 10;
int y = 20;
boolean resultado = (x < y) && (y > 15); // resultado es true
```

## Conclusión

Las preguntas lógicas son esenciales en la programación para controlar el flujo de ejecución y tomar decisiones basadas
en condiciones específicas. Al comprender y utilizar operadores lógicos y relacionales, los programadores pueden
crear programas más dinámicos y adaptativos.