public class AreaPerimetroHexagono {

    void main(){// Inicio del algoritmo
        // Declaración de constantes
        final double APOTEMA = 6.0;

        // Declaración de variables
        double lado;
        double area;
        double perimetro;

        // Entrada de datos
        lado = Double.parseDouble(IO.readln(
                "Ingresa la longitud del lado del hexágono:"));

        // Cálculo del perímetro
        perimetro = 6 * lado;
        // Cálculo del área
        area = (perimetro * APOTEMA) / 2;

        // Mostrar resultados
        IO.println("El perímetro del hexágono es: " + perimetro);
        IO.println("El área del hexágono es: " + area);

        IO.println(Math.PI);
        IO.println(Math.pow(5, 3));
    }// Fin del algoritmo
}
