# La estructura condicional "if"

Una estructura condicional "if" es una construcción fundamental en la programación que permite ejecutar un bloque de
código solo si se cumple una condición específica. En Java, la sintaxis básica de una estructura "if" es la siguiente:

![if_1.png](if_1.png){style="block"}

La condición dentro de los paréntesis se evalúa como verdadera o falsa. Si la condición es verdadera, el bloque de
código dentro de las llaves se ejecuta. Si la condición es falsa, el bloque de código se omite y el programa continúa
con la siguiente instrucción después del bloque "if".

## Ejemplo básico

### Descripción del problema

Supongamos que queremos verificar si un número es positivo. Si el número es mayor que cero, imprimiremos un mensaje
indicando que el número es positivo.

### Pseudocódigo

```
IsPositive

Declración de variables
    Entero: number

1. INICIO
2. ESCRIBIR "Ingrese un número:"
3. LEER number
4. SI number > 0
    ENTONCES
        ESCRIBIR "El número es positivo."
5. FIN
```

### Código en Java

Ahora veamos cómo se implementa este pseudocódigo en Java:

![if_2.png](if_2.png){style="block"}

### Explicación del código

1. **Declaración de variables**: Se declara una variable entera (`int` en Java) llamada `number` para almacenar el
   número ingresado por el usuario.
2. **Entrada del usuario**: Se utiliza `Scanner` para leer la entrada del usuario desde la consola.
3. **Estructura condicional "if"**: La condición `number > 0` se evalúa. Si es verdadera, se ejecuta el bloque de código
   dentro de las llaves, imprimiendo "El número es positivo." en la consola.
4. **Fin del programa**: Si la condición es falsa (es decir, si el número es cero o negativo), el programa simplemente
   continúa sin imprimir nada.

## Conclusión

La estructura condicional "if" es una herramienta poderosa que permite a los programadores controlar el flujo de
ejecución de su código basado en condiciones específicas. Es fundamental para la toma de decisiones en programas y se
utiliza ampliamente en diversas aplicaciones de programación.