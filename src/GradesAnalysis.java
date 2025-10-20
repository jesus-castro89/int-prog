public class GradesAnalysis {

    void main() {
        /*
         * Declaramos las variables necesarias para almacenar
         * el número de estudiantes, las calificaciones,
         * la calificación máxima, la calificación mínima,
         * la suma de las calificaciones y el promedio.
         */
        int numberOfStudents, maxGrade = 0,
                minGrade = 0, sumGrades = 0,
                averageGrade, passingCount = 0;
        // Declaramos un String auxiliar para las lecturas.
        String input;
        // Declaramos el arreglo para almacenar las calificaciones, sin inicializarlo aún.
        int[] grades;
        // Mantendremos cautivo al usuario hasta que ingrese un número válido de estudiantes (mínimo 1).
        do {
            // Solicitamos el número de estudiantes.
            input = IO.readln("Ingrese el número de estudiantes (mínimo 1): ");
            // Validamos que la entrada sea un número entero positivo.
            if (input.matches("-?\\d+")) {
                numberOfStudents = Integer.parseInt(input);
            } else {
                // Si la entrada no es válida, mostramos un mensaje de error.
                IO.println("Entrada inválida. Por favor ingrese un número entero positivo.");
                numberOfStudents = 0;
            }
        } while (numberOfStudents < 1);
        // Inicializamos el arreglo de calificaciones.
        grades = new int[numberOfStudents];
        // Solicitamos las calificaciones de cada estudiante.
        for (int i = 0; i < numberOfStudents; i++) {
            // Mantendremos cautivo al usuario hasta que ingrese una calificación válida (entre 0 y 100).
            do {
                // Solicitamos la calificación del estudiante i.
                input = IO.readln("Ingrese la calificación del estudiante " + (i + 1) + " (0-100): ");
                // Validamos que la entrada sea un número entero entre 0 y 100.
                if (input.matches("-?\\d+")) {
                    grades[i] = Integer.parseInt(input);
                } else {
                    // Si la entrada no es válida, mostramos un mensaje de error.
                    IO.println("Entrada inválida. Por favor ingrese un número entero entre 0 y 100.");
                    grades[i] = -1;
                }
            } while (grades[i] < 0 || grades[i] > 100);
            // Acumulamos la calificación para el cálculo del promedio.
            sumGrades += grades[i];
            // Actualizamos la calificación máxima y mínima.
            if (i == 0) {
                // Para la primera calificación, inicializamos max y min.
                maxGrade = grades[i];
                minGrade = grades[i];
            } else {
                // Para las siguientes calificaciones, comparamos y actualizamos.
                if (grades[i] > maxGrade) {
                    // Si la calificación actual es mayor que la máxima registrada, la actualizamos.
                    maxGrade = grades[i];
                }
                if (grades[i] < minGrade) {
                    // Si la calificación actual es menor que la mínima registrada, la actualizamos.
                    minGrade = grades[i];
                }
            }
            // Contamos las calificaciones aprobatorias (60 o más).
            if (grades[i] >= 60) {
                passingCount++;
            }
            // Mostramos la calificación ingresada.
            IO.println("Calificación del estudiante " + (i + 1) + ": " + grades[i]);
        }
        // Calculamos el promedio de las calificaciones.
        averageGrade = sumGrades / numberOfStudents;
        // Mostramos los resultados.
        IO.println("""
                --- Resultados del Análisis de Calificaciones ---
                Promedio de calificaciones: %d
                Calificación máxima: %d
                Calificación mínima: %d
                Número de calificaciones aprobatorias (60 o más): %d
                """.formatted(averageGrade, maxGrade, minGrade, passingCount));
    }
}