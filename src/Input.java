import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.security.spec.ECField;

public class Input {

    void main() {

        showMessage("Bienvenido al sistema de entrada de datos",
                "Bienvenida",
                JOptionPane.INFORMATION_MESSAGE);
        int base = getIntInput("Ingresa la base del rectángulo:");
        int altura = getIntInput("Ingresa la altura del rectángulo:");
        int area = base * altura;
        showMessage("El área del rectángulo es: " + area,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static void initWindows() {
        // Configuración de la interfaz gráfica
        Font f = null;
        try {
            f = Font.createFont(Font.TRUETYPE_FONT,
                    new File("fonts/f1.ttf")).deriveFont(32.5f);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //new Font("Arial", Font.BOLD, 20);
        Color bgColor = new Color(250, 204, 41);
        UIManager.put("OptionPane.messageFont", f);
        UIManager.put("OptionPane.messageForeground", Color.BLUE);
        UIManager.put("OptionPane.buttonFont", f);
        UIManager.put("ComboBox.font", f);
        UIManager.put("TextField.font", f.deriveFont(Font.PLAIN));
        UIManager.put("TextField.foreground", bgColor);
    }

    public static void showMessage(String message, String title, int messageType) {
        JOptionPane.showMessageDialog(null,
                message,
                title,
                messageType);
    }

    public static int getIntInput(String message) {
        String input;
        do {
            input = JOptionPane.showInputDialog(null, message);
            if (!input.matches(("^-?\\d+$"))) {
                JOptionPane.showMessageDialog(null,
                        "Por favor ingresa un número válido (solo dígitos).",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } while (!input.matches(("^-?\\d+$")));
        return Integer.parseInt(input);
    }
}
