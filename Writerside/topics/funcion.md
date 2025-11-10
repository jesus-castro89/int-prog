# ¿Qué son las funciones en Java?

Las funciones en Java, también conocidas como métodos, son bloques de código que realizan una tarea específica y pueden
ser reutilizados en diferentes partes de un programa. Los métodos permiten organizar el código de manera modular,
facilitando su mantenimiento y comprensión.

## Definición de una función

Para definir una función en Java, se utiliza la siguiente sintaxis básica:

![funciones_1.png](funciones_1.png){style="block"}

Sin embargo, en Java, las funciones deben estar dentro de una clase. Aquí hay un ejemplo simple de una función que suma
dos números:

![funciones_2.png](funciones_2.png){style="block"}

En este ejemplo, `sumar` es el nombre de la función, `int` es el tipo de valor que devuelve (un entero), y `a` y `b` son
los parámetros de entrada.

## Funciones `static`

Para efectos de nuestra asignatura, todas las funciones que creemos serán `static`, lo que significa que pueden ser
llamadas sin crear una instancia de la clase. Aquí hay un ejemplo:

![funciones_3.png](funciones_3.png)

Con la palabra clave `static`, podemos llamar a la función `sumar` directamente desde el método `main`.

## Llamada a una función

Para llamar a una función, simplemente usamos su nombre seguido de paréntesis, pasando los argumentos necesarios. Por
ejemplo en el caso de la función `sumar`: Puedes notar que en el método `main`, llamamos a la función `sumar` con los
valores `5` y `10`, y almacenamos el resultado en la variable `resultado`.

## Conclusión

Las funciones en Java son una herramienta poderosa para organizar y reutilizar código. Al definir funciones, podemos
hacer que nuestros programas sean más claros y fáciles de mantener. En los próximos ejercicios, aplicaremos este
concepto para resolver problemas específicos.