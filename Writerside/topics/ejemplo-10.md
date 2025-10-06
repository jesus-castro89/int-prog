# Ejemplo 10: Adivinando el número

## Descripción

Nos toca crear un pequeño juego en el que el usuario debe adivinar un número secreto generado por el programador. El
programa proporcionará pistas indicando si el número ingresado es mayor o menor que el número secreto, y continuará
solicitando números hasta que el usuario adivine correctamente.

## Solución

### Usando `while`

![numero_while.png](numero_while.png){style="block"}

### Usando `do...while`

![numero_do_while.png](numero_do_while.png){style="block"}

## Explicación del código

1. **Declaración e inicialización de variables**: Se declara la variable `numeroSecreto` para almacenar el número que el
   usuario debe adivinar y la variable `intento` para almacenar el número ingresado por el usuario.
2. **Mensaje inicial**: Se imprime un mensaje para informar al usuario sobre el juego.
3. **Bucle `while` o `do...while`**: Se utiliza un bucle para continuar solicitando números hasta que el usuario adivine
   correctamente el número secreto.
4. **Proporcionar pistas**: Dentro del bucle, se verifica si el intento es menor o mayor que el número secreto y se
   proporciona una pista al usuario.
5. **Entrada del usuario**: Se utiliza `IO.readln` para leer la entrada del usuario y `Integer.parseInt` para
   convertirla a un entero.
6. **Felicitar al usuario**: Una vez que el usuario adivina el número, se imprime un mensaje de felicitación.