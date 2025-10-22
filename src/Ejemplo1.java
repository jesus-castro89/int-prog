public class Ejemplo1 {

    void main() {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int sumaDiagonal = 0;
        // Variables declaradas fuera del ciclo
        // pueden ser usadas dentro y fuera del ciclo.
        int fila, columna;
        for (fila = 0;
             fila < matriz.length; fila++) {
            for (columna = 0;
                 columna < matriz[fila].length; columna++) {
                if (fila == columna) {
                    sumaDiagonal += matriz[fila][columna];
                }
            }
        }
    }
}