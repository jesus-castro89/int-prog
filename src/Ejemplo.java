import javax.swing.*;

public class Ejemplo {

    void main() {
        Input.initWindows();
        int edad = Input.getIntInput("Ingresa tu edad:");
        Input.showMessage("Tu edad es: " + edad,
                "Edad",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
