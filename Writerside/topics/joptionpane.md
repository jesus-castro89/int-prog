# La clase JOptionPane en Java

La clase `JOptionPane` es parte del paquete `javax.swing` y se utiliza para crear cuadros de diálogo estándar en
aplicaciones Java con interfaz gráfica. Esta clase facilita la interacción con el usuario mediante ventanas emergentes
que pueden mostrar mensajes, solicitar entradas o confirmar acciones.

## Características principales de JOptionPane

- **Cuadros de diálogo de mensaje**: Permite mostrar mensajes informativos, de advertencia, error o preguntas al
  usuario.
- **Cuadros de diálogo de entrada**: Permite solicitar al usuario que ingrese datos, como texto o números.
- **Cuadros de diálogo de confirmación**: Permite al usuario confirmar o cancelar una acción.
- **Personalización**: Se pueden personalizar los botones, iconos y opciones de los cuadros de diálogo.
- **Simplicidad**: Proporciona una forma sencilla de crear cuadros de diálogo sin necesidad de diseñar interfaces
  complejas.

## Tipos de cuadros de diálogo

La clase `JOptionPane` ofrece varios métodos estáticos para crear diferentes tipos de cuadros de diálogo que veremos a
continuación.

### Cuadro de diálogo de mensaje

```java
import javax.swing.JOptionPane;

public class MessageDialogExample {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,
                "Este es un mensaje informativo.",
                "Mensaje",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
```

En este caso el cuadro requiere cuatro parámetros:

1. El primer parámetro es el componente padre del cuadro de diálogo. Si se pasa `null`, el cuadro se centrará en la
   pantalla.
2. El segundo parámetro es el mensaje que se mostrará en el cuadro de diálogo.
3. El tercer parámetro es el título del cuadro de diálogo.
4. El cuarto parámetro es el tipo de mensaje de los cuales existen cinco tipos:
    - `JOptionPane.INFORMATION_MESSAGE`: Muestra un icono de información.
    - `JOptionPane.WARNING_MESSAGE`: Muestra un icono de advertencia.
    - `JOptionPane.ERROR_MESSAGE`: Muestra un icono de error.
    - `JOptionPane.QUESTION_MESSAGE`: Muestra un icono de pregunta.
    - `JOptionPane.PLAIN_MESSAGE`: No muestra ningún icono.

### Cuadro de diálogo de entrada

```java
import javax.swing.JOptionPane;

public class InputDialogExample {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog(null,
                "Ingrese su nombre:",
                "Entrada de Datos",
                JOptionPane.QUESTION_MESSAGE);
        System.out.println("Hola, " + nombre + "!");
    }
}
```

En este caso, el cuadro requiere cuatro parámetros similares al cuadro de diálogo de mensaje, pero en este caso el
usuario puede ingresar datos.

> El método `showInputDialog` devuelve una cadena con el valor ingresado por el usuario. Así que es importante manejar
> posibles valores nulos si el usuario cancela el cuadro de diálogo. O en caso de que se espere un número, se debe
> convertir la cadena a un tipo numérico.
> {style="note"}