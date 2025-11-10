# Variables de instancia (Atributos)

Los atributos son variables que pertenecen a una clase y representan las características o propiedades de los objetos
creados a partir de esa clase. Cada objeto tiene su propia copia de estos atributos, lo que permite almacenar
información específica para cada instancia.

## Definición de Atributos

Los atributos se definen dentro de una clase, generalmente al inicio, y pueden tener diferentes niveles de acceso
(público, privado, protegido), dependiendo de cómo se desee controlar el acceso a ellos desde fuera de la clase.

Para efectos de nuestro curso, definiremos los atributos sin especificar un modificador de acceso, lo que los hace
accesibles dentro del mismo paquete.

```java
class Persona {
    // Atributos de instancia
    String nombre;
    int edad;
}
```

## Tipos de Atributos

1. **Atributos de Instancia**: Son los atributos que pertenecen a cada instancia (objeto) de la clase. Cada objeto
   tiene su propia copia de estos atributos.
   ```java
   class Coche {
       String color; // Atributo de instancia
       String modelo; // Atributo de instancia
   }
   ```
2. **Atributos de Clase (Estáticos)**: Son atributos que pertenecen a la clase en sí, y no a las instancias. Todos
   los objetos de la clase comparten el mismo valor de este atributo.
   ```java
    class Coche {
         static int numeroDeRuedas = 4; // Atributo de clase
    }
   ```

## Ejemplo de Uso de Atributos

### Clase Persona con Atributos

```java
public class Persona {
    // Atributos de instancia
    String nombre;
    int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}
```

### Creación de Objetos y Uso de Atributos

```java
public class Main {
    void main() {
        // Crear un objeto de la clase Persona
        Persona persona1 = new Persona("Juan", 25);
        Persona persona2 = new Persona("Ana", 30);

        // Mostrar información de las personas
        persona1.mostrarInfo(); // Salida: Nombre: Juan, Edad: 25
        persona2.mostrarInfo(); // Salida: Nombre: Ana, Edad: 30
    }
}
```

## Conclusión

Los atributos son fundamentales en la programación orientada a objetos, ya que permiten definir las características
de los objetos. Al utilizar atributos de instancia, cada objeto puede mantener su propio estado, lo que es esencial para
crear programas flexibles y reutilizables. En los próximos temas, exploraremos cómo interactuar con estos atributos a
través de métodos y constructores.