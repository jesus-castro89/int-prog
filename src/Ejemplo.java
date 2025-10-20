public class Ejemplo {

    void main() {
        int[][] students;
        int numStudents = Integer.parseInt(
                IO.readln("Ingrese el número de estudiantes: "));
        students = new int[numStudents][];
        for(int i = 0; i < numStudents; i++) {
            int numGrades = Integer.parseInt(
                    IO.readln("Ingrese el número de " +
                            "calificaciones para el estudiante " +
                            (i + 1) + ": "));
            students[i] = new int[numGrades];
            for(int j = 0; j < numGrades; j++) {
                students[i][j] = Integer.parseInt(
                        IO.readln("Ingrese la calificación " +
                                (j + 1) + " para el estudiante " +
                                (i + 1) + ": "));
            }
        }
    }
}
