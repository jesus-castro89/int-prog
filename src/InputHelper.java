import javax.swing.*;

public class InputHelper {

    public static String getStringInput(String message, String title) {
        String input;
        do {
            input = showInputDialog(title, message);
            if (input == null || input.trim().isEmpty()) {
                showErrorDialog(title, message);
            }
        } while (input == null || input.trim().isEmpty());
        return input;
    }

    public static int getIntInput(String message, String title) {
        String input;
        do {
            input = showInputDialog(title, message);
        } while (!input.matches("-?\\d+"));
        return Integer.parseInt(input);
    }

    public static String getSelectedOption(String message, String title, String[] options) {
        String input;
        do {
            input = (String) JOptionPane.showInputDialog(null,
                    message, title, JOptionPane.QUESTION_MESSAGE,
                    null, options, options[0]);
        } while (input == null);
        return input;
    }

    public static boolean getConfirmation(String message, String title) {
        int result = JOptionPane.showConfirmDialog(null,
                message, title, JOptionPane.YES_NO_OPTION);
        return result == JOptionPane.YES_OPTION;
    }

    public static double getDoubleInput(String message, String title) {
        String input;
        do {
            input = showInputDialog(title, message);
        } while (!input.matches("-?\\d+(\\.\\d+)?"));
        return Double.parseDouble(input);
    }

    public static String showInputDialog(String message, String title) {
        return JOptionPane.showInputDialog(null,
                message, title, JOptionPane.QUESTION_MESSAGE);
    }

    public static void showErrorDialog(String message, String title) {
        JOptionPane.showMessageDialog(null,
                message, title, JOptionPane.ERROR_MESSAGE);
    }

    public static void showInfoDialog(String message, String title) {
        JOptionPane.showMessageDialog(null,
                message, title, JOptionPane.INFORMATION_MESSAGE);
    }

    public static void showWarningDialog(String message, String title) {
        JOptionPane.showMessageDialog(null,
                message, title, JOptionPane.WARNING_MESSAGE);
    }
}
