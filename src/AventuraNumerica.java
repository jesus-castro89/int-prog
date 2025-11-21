import javax.swing.*;
import java.awt.*;
import java.io.File;

public class AventuraNumerica {

    // Variables globales
    static int playerEnergy;
    static String[] challenges;
    static String playerName;

    // Función Principal

    /**
     * Función principal que inicia el juego de aventura numérica.
     */
    void main() {
        InputHelper.initWindows();
        initializeGame();
        showIntro();
        playLevel();
    }

    public static void initializeGame() {
        playerEnergy = 100;
        challenges = new String[]{"Desafío 1", "Desafío 2", "Desafío 3"};
        JOptionPane.showMessageDialog(null,
                "¡Prepárate para una aventura llena de desafíos numéricos!",
                "Aventura Numérica: El Tesoro del Dragón",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static void showIntro() {
        playerName = JOptionPane.showInputDialog(null,
                "¡Bienvenido a la Aventura Numérica!\n" +
                        "Por favor, ingresa tu nombre:",
                "Aventura Numérica",
                JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null,
                "Hola " + playerName + "! En esta aventura, enfrentarás desafíos numéricos para encontrar el tesoro del dragón.\n" +
                        "Tienes " + playerEnergy + " puntos de energía para comenzar.",
                "Introducción",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static void playLevel() {
        JOptionPane.showMessageDialog(null,
                "Nivel 1: En Desarrollo.",
                "Nivel 1",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static void checkAnswer() {
        // Función vacía para verificar respuestas
    }

    public static void updateStats() {
        // Función vacía para actualizar estadísticas
    }

    public static void showResults() {
        // Función vacía para mostrar resultados finales
    }
}
