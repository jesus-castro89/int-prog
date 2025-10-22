public class Ejemplo {

    void main() {
        int[] numero = new int[5];
        // Variables declaradas fuera del ciclo
        // pueden ser usadas dentro y fuera del ciclo.
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < numero.length; i++) {
            // Si se declara dentro del ciclo,
            // cada iteración crea una nueva variable temporal
            // y fuera del ciclo no existe.
            int variableTemporal = 0;
            numero[i] = Integer.parseInt(
                    IO.readln("Ingrese un número entero: "));
        }
        // Si colocamos la declaración aquí,
        // la variable temporal ya no existe.
        // int otraVariable = variableTemporal + 5;
        // Nos da un error de compilación, ya que variableTemporal
        // no está definida en este ámbito.
        for (int num : numero) {
            a += num;
        }
    }
}
