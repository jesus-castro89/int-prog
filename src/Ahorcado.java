import java.util.Arrays;

public class Ahorcado {

    void main() {
        IO.println("¡Bienvenido al juego del Ahorcado!");
        String[] palabras = {"PROGRAMACIÓN", "JAVA", "COMPUTADORA", "DESARROLLO", "ALGORITMO"};
        int palabraIndex = (int) (Math.random() * palabras.length);
        String palabraSecreta = palabras[palabraIndex];
        palabraSecreta = palabraSecreta.replace("Á", "A");
        palabraSecreta = palabraSecreta.replace("É", "E");
        palabraSecreta = palabraSecreta.replace("Í", "I");
        palabraSecreta = palabraSecreta.replace("Ó", "O");
        palabraSecreta = palabraSecreta.replace("Ú", "U");
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
                if (palabraSecreta.charAt(i) == letra) {
                    palabraAdivinada[i] = palabras[palabraIndex].charAt(i);
                    acierto = true;
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
