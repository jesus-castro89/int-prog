// Esta línea permite usar la clase Scanner en el programa
// Es decir, leer datos del usuario.

import java.util.Scanner;

// Debes declarar la clase con el mismo nombre del archivo
// Siguiendo la notación CamelCase
public class CostoProduccion {

    // Se debe de crear la función principal o inicial
    // Esto es el equivalente a 1. INICIO
    public static void main(String[] args) {
        // Declarar las variables
        double litros, galonLitro, precioGalon, total;
        // Declarar las constantes
        final double litroGalon = 3.785;
        // Declaramos el Scanner
        Scanner sc = new Scanner(System.in);
        // Esto equivale a 2. ESCRIBIR "Ingrese la cantidad de litros producidos"
        System.out.println("Ingrese la cantidad de litros producidos");
        // Esto equivale a 3. LEER litros;
        litros = sc.nextDouble();
        // Esto equivale a 4. ESCRIBIR "Ingrese el costo por galón"
        System.out.println("Ingrese el costo por galón");
        // Esto equivale a 5. Leer precioGalon
        precioGalon = sc.nextDouble();
        // Esto equivale a 6. HACER galonLitro = litros / litroGalon;
        galonLitro = litros / 3.785;  //<=> litros = litroGalon;
        // Esto equivale a 7. HACER total = galonLitro * precioGalon;
        total = galonLitro * precioGalon;
        // Esto equivale a 8. ESCRIBIR "El costo por la producción es de ", total
        System.out.printf("El costo por la producción es de %.2f%n", total);
        // Esto equivale a 9. FIN
        sc.close();
    }
}