# Uso de condiciones y ciclos en Java

En Java, las estructuras de control como las condiciones y los ciclos son fundamentales para controlar el flujo de
ejecución de un programa. A continuación, se describen las principales estructuras de control: `if`, `switch`, `for`,
`while` y `do-while`.

Sin embargo, debemos tener en cuenta que el uso de las mismas no es excluyente, es decir, podemos combinar varias de
estas estructuras para lograr el comportamiento deseado en nuestro programa.

## Condiciones Anidadas

Las condiciones anidadas permiten evaluar múltiples condiciones dentro de una estructura de control. Por ejemplo, se
puede utilizar un `if` dentro de otro `if` para verificar condiciones adicionales.

```java
int numero = 10;
if(numero >0){
    if(numero %2==0){
        System.out.println("El número es positivo y par.");
    }else{
        System.out.println("El número es positivo e impar.");
    }
}else{
    System.out.println("El número es negativo o cero.");
}
```

## Ciclos Anidados

Los ciclos anidados permiten ejecutar un ciclo dentro de otro ciclo. Esto es útil para trabajar con estructuras de datos
multidimensionales, como matrices.

```java
for(int i = 1; i <=3;i++){
    for(int j = 1;j <=3;j++){
        System.out.println("i: "+i +", j: "+j);
    }
}
```

En este ejemplo, el ciclo externo itera sobre `i` y el ciclo interno itera sobre `j`, imprimiendo todas las
combinaciones de `i` y `j`.

## Combinación de Condiciones y Ciclos

Es común combinar condiciones y ciclos para controlar el flujo de ejecución de manera más compleja. Por ejemplo, se
puede utilizar un `if` dentro de un ciclo para ejecutar ciertas acciones solo cuando se cumple una condición específica.

```java
for(int i = 1; i <=10; i++){
    if(i %2==0){
        System.out.println(i +" es un número par.");
    }else{
        System.out.println(i +" es un número impar.");
    }
}
```

En este ejemplo, el ciclo `for` itera del 1 al 10, y dentro del ciclo se utiliza un `if` para determinar si el número es
par o impar.

## Resumen

- Las condiciones y ciclos son esenciales para controlar el flujo de ejecución en Java.
- Se pueden anidar condiciones y ciclos para evaluar múltiples condiciones o trabajar con estructuras de datos
  multidimensionales.
- Es común combinar condiciones y ciclos para lograr un comportamiento más complejo en los programas.