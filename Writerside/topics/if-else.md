# La estructura condicional "if-else" y "else if"

Una estructura condicional "if-else" es una construcción fundamental en la programación que permite ejecutar diferentes
bloques de código basados en condiciones específicas. En Java, la sintaxis básica de una estructura "if-else" es la
siguiente:

![if_else_1.png](if_else_1.png){style="block"}

La condición dentro de los paréntesis se evalúa como verdadera o falsa. Si la condición es verdadera, el bloque de
código dentro de las primeras llaves se ejecuta. Si la condición es falsa, el bloque de código dentro de las segundas
llaves (después de `else`) se ejecuta.

Además, se puede utilizar `else if` para evaluar múltiples condiciones secuencialmente. La sintaxis para `else if` es la
siguiente:

![if_else_2.png](if_else_2.png){style="block"}

## Ejemplo básico

### Descripción del problema

Supongamos que queremos verificar si un número es positivo, negativo o cero. Dependiendo del valor del número,
imprimiremos un mensaje correspondiente.

### Pseudocódigo

```
CheckNumber

Declaración de variables
    Entero: number  

1. INICIO
2. ESCRIBIR "Ingrese un número:"
3. LEER number
4. SI number > 0
    ENTONCES
        ESCRIBIR "El número es positivo."
    EN OTRO CASO
        SI number < 0
            ENTONCES
                ESCRIBIR "El número es negativo."
            EN OTRO CASO
                ESCRIBIR "El número es cero."
5. FIN
```

### Código en Java

Ahora veamos cómo se implementa este pseudocódigo en Java:

![if_else_3.png](if_else_3.png){style="block"}

### Explicación del código

1. **Declaración de variables**: Se declara una variable entera (`int` en Java) llamada `number` para almacenar el
   número ingresado por el usuario.
2. **Entrada del usuario**: Se utiliza `Scanner` para leer la entrada del usuario desde la consola.
3. **Estructura condicional "if-else"**:
    - La primera condición `number > 0` se evalúa. Si es verdadera, se ejecuta el bloque de código dentro de las
      primeras
      llaves, imprimiendo "El número es positivo." en la consola.
    - Si la primera condición es falsa, se evalúa la segunda condición `number < 0` dentro del bloque `else if`. Si esta
      condición es verdadera, se imprime "El número es negativo.".
    - Si ambas condiciones son falsas (es decir, si el número es cero), se ejecuta el bloque dentro de `else`,
      imprimiendo
      "El número es cero.".
4. **Fin del programa**: El programa termina después de evaluar las condiciones y ejecutar el bloque correspondiente.

## Conclusión

La estructura condicional "if-else" y "else if" es una herramienta poderosa que permite a los programadores controlar
el flujo de ejecución de su código basado en múltiples condiciones específicas. Es fundamental para la toma de
decisiones en programas y se utiliza ampliamente en diversas aplicaciones de programación.