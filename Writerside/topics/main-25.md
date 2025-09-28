# El main en Java 25

El método `main` en Java es el punto de entrada de cualquier aplicación Java. Es el primer método que se ejecuta cuando
se inicia un programa. En Java 25, el método `main` sigue siendo una parte fundamental del lenguaje, pero ha habido
algunas mejoras y cambios en la forma en que se puede definir y utilizar.

## Definición del método main

Para java 25, la definición estándar del método `main` es la siguiente:

```java
void main(String[] args) {
    // Código a ejecutar
}
```

Aquí, `String[] args` es un array de cadenas que puede contener argumentos pasados al programa desde la línea de
comandos.

Cómo puedes notar, en Java 25, el modificador de acceso `public` y el modificador `static` han sido eliminados. Esto se
debe a que Java 25 introduce un nuevo modelo de ejecución que no requiere que el método `main` sea estático o público.

## Ejemplo de un programa Java 25 con main

```java
class MiPrograma {
    void main(String[] args) {
        System.out.println("Hola, Mundo!");
    }
}   
```

Aunque el argumento `String[] args` puede omitirse si no se van a utilizar argumentos de línea de comandos:

```java
class MiPrograma {
    void main() {
        System.out.println("Hola, Mundo!");
    }
}
```