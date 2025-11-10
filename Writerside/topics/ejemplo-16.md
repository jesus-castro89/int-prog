# Ejemplo 16: Clase auxiliar para entradas con JOptionPane

En este ejemplo, crearemos una clase auxiliar llamada `InputHelper` que facilitará la obtención de entradas del usuario
utilizando `JOptionPane`. Esta clase proporcionará métodos estáticos para solicitar diferentes tipos de entradas, como
cadenas de texto, números enteros y números decimales, manejando las excepciones y validaciones necesarias.

## Código de la clase InputHelper

```java
import javax.swing.JOptionPane;

public class InputHelper {

    // Método para obtener una cadena de texto
    public static String getStringInput(String message, String title) {
        return JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);
    }

    // Método para obtener un número entero
    public static int getIntInput(String message, String title) {
        String input;
        do{
            input = JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);
        }while (!input.matches("-?\\d+"));
        return Integer.parseInt(input);
    }

    // Método para obtener un número decimal
    public static double getDoubleInput(String message, String title) {
        String input;
        do{
            input = JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);
        }while (!input.matches("-?\\d+(\\.\\d+)?"));
        return Double.parseDouble(input);
    }
}
```