# Los constructores

En Java, un constructor es un bloque especial de código que se utiliza para inicializar objetos de una clase. Se llama
automáticamente cuando se crea una instancia (objeto) de la clase. Los constructores tienen el mismo nombre que la clase
y no tienen un tipo de retorno, ni siquiera `void`, pero esto no los convierte en funciones en el sentido tradicional,
ya que su propósito principal es la inicialización de objetos.

## Definición de un Constructor

Para definir un constructor en Java, se utiliza la siguiente sintaxis básica:

![constructor_1.png](constructor_1.png){style="block"}

## Ejemplo de un Constructor

![constructor_2.png](constructor_2.png){style="block"}

En este ejemplo, el constructor `Persona` toma dos parámetros (`nombre` y `edad`) y los utiliza para inicializar los
atributos de la instancia.

## Creación de Objetos usando el Constructor

![constructor_3.png](constructor_3.png)

En este ejemplo, cuando se crean los objetos `persona1` y `persona2`, el constructor `Persona` se llama automáticamente
para inicializar sus atributos.

> Nota: Aunque los constructores no son funciones en el sentido tradicional, cumplen una función similar al permitir la
> inicialización de objetos de manera estructurada.
> {style="note"}

> Nota: Si no se define un constructor en una clase, Java proporciona automáticamente un constructor por defecto sin
> parámetros que no realiza ninguna inicialización especial.
> {style="note"}

> Nota: Recuerda que todas las clases deberán estar en un archivo con el mismo nombre que la clase pública y con la
> extensión `.java`. Por ejemplo, la clase `Persona` debe estar en un archivo llamado `Persona.java`.
> {style="warning"} 

## Conclusión

Los constructores son fundamentales en Java para la creación e inicialización de objetos. Permiten establecer el estado
inicial de un objeto de manera clara y concisa. Aunque no son funciones en el sentido tradicional, desempeñan un papel
crucial en la programación orientada a objetos que es un concepto central en Java.