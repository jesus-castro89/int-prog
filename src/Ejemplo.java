import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Ejemplo {

    void main() {
        try {
            Font miFuente = Font.createFont(Font.TRUETYPE_FONT,
                    new File("fonts/snow.ttf")).deriveFont(24f);

            UIManager.put("OptionPane.messageFont", miFuente);
            UIManager.put("OptionPane.background",
                    Color.GREEN);
            UIManager.put("OptionPane.messageAreaBackground",
                    Color.YELLOW);
            UIManager.put("OptionPane.messageForeground",
                    Color.BLUE);
            UIManager.put("OptionPane.buttonFont",
                    new Font("Algerian", Font.PLAIN, 20));
        } catch (FontFormatException | IOException e) {
            throw new RuntimeException(e);
        }


        String n;
        do {
            n = JOptionPane.showInputDialog(null,
                    "¿Cómo te llamas?",
                    "Entrada de datos",
                    JOptionPane.QUESTION_MESSAGE);

            if(!n.matches(("^[a-zA-ZñÑáéíóúüÁÉÍÓÚÜ]*$"))){
                JOptionPane.showMessageDialog(null,
                        "Por favor ingresa un nombre válido (solo letras).",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } while (!n.matches(("^[a-zA-ZñÑáéíóúüÁÉÍÓÚÜ]*$")));

        JOptionPane.showMessageDialog(null,
                "Hola " + n + ", bienvenido al mundo de Java!",
                "Saludo",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
