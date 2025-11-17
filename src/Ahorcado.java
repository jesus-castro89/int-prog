import java.util.Arrays;
import java.util.Random;

public class Ahorcado {

    void main() {
        IO.println("¡Bienvenido al juego del Ahorcado!");
        // Lista de palabras para el juego
        String[] palabras = {"PROGRAMACIÓN", "JAVA",
                "COMPUTADORA", "DESARROLLO", "ALGORITMO"};
        // Objeto Random para seleccionar una palabra aleatoria
        Random aleatorio = new Random();
        // Selección de un índice aleatorio para la palabra secreta
        int palabraIndex = aleatorio.nextInt(palabras.length);
        // Recuperación de la palabra secreta
        String palabraSecreta = palabras[palabraIndex];
        // Array para almacenar las letras por adivinar y adivinadas
        char[] palabraAdivinada = new char[palabras[palabraIndex].length()];
        Arrays.fill(palabraAdivinada, '_');
        int intentosRestantes = 6;
        boolean palabraAdivinadaCompletamente = false;
        while (intentosRestantes > 0 && !palabraAdivinadaCompletamente) {
            IO.print("Palabra: ");
            for (char c : palabraAdivinada) {
                IO.print(c + " ");
            }
            IO.println("");
            IO.println("Intentos restantes: " + intentosRestantes);
            char letra;
            do {
                letra = IO.readln("Introduce una letra: ").toUpperCase().charAt(0);
            } while (!Character.isLetter(letra));
            boolean acierto = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                switch (letra) {
                    case 'A' -> {
                        if (palabraSecreta.charAt(i) == 'A') {
                            palabraAdivinada[i] = palabras[palabraIndex].charAt(i);
                            acierto = true;
                        }
                        if (palabraSecreta.charAt(i) == 'Á') {
                            palabraAdivinada[i] = 'Á';
                            acierto = true;
                        }
                    }
                    case 'E' -> {
                        if (palabraSecreta.charAt(i) == 'E') {
                            palabraAdivinada[i] = palabras[palabraIndex].charAt(i);
                            acierto = true;
                        }
                        if (palabraSecreta.charAt(i) == 'É') {
                            palabraAdivinada[i] = 'É';
                            acierto = true;
                        }
                    }
                    case 'I' -> {
                        if (palabraSecreta.charAt(i) == 'I') {
                            palabraAdivinada[i] = palabras[palabraIndex].charAt(i);
                            acierto = true;
                        }
                        if (palabraSecreta.charAt(i) == 'Í') {
                            palabraAdivinada[i] = 'Í';
                            acierto = true;
                        }
                    }
                    case 'O' -> {
                        if (palabraSecreta.charAt(i) == 'O') {
                            palabraAdivinada[i] = palabras[palabraIndex].charAt(i);
                            acierto = true;
                        }
                        if (palabraSecreta.charAt(i) == 'Ó') {
                            palabraAdivinada[i] = 'Ó';
                            acierto = true;
                        }
                    }
                    case 'U' -> {
                        if (palabraSecreta.charAt(i) == 'U') {
                            palabraAdivinada[i] = palabras[palabraIndex].charAt(i);
                            acierto = true;
                        }
                        if (palabraSecreta.charAt(i) == 'Ú') {
                            palabraAdivinada[i] = 'Ú';
                            acierto = true;
                        }
                        if (palabraSecreta.charAt(i) == 'Ü') {
                            palabraAdivinada[i] = 'Ü';
                            acierto = true;
                        }
                    }
                    default -> {
                        if (palabraSecreta.charAt(i) == letra) {
                            palabraAdivinada[i] = palabras[palabraIndex].charAt(i);
                            acierto = true;
                        }
                    }
                }
            }
            if (!acierto) {
                intentosRestantes--;
                IO.println("¡Letra incorrecta!");
            } else {
                IO.println("¡Letra correcta!");
            }
            palabraAdivinadaCompletamente = true;
            for (char c : palabraAdivinada) {
                if (c == '_') {
                    palabraAdivinadaCompletamente = false;
                    break;
                }
            }
        }
        if (palabraAdivinadaCompletamente) {
            IO.println("¡Felicidades! Has adivinado la palabra: " + palabras[palabraIndex]);
        } else {
            IO.println("¡Has perdido! La palabra era: " + palabras[palabraIndex]);
        }
    }
}
