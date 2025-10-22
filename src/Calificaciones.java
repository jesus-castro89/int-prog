public class Calificaciones {

    void main(){
        int[][] calificaciones;

        int numeroEstudiantes = Integer.parseInt(
                IO.readln("Ingrese el número de estudiantes: "));

        calificaciones = new int[numeroEstudiantes][];

        for(int i = 0; i < numeroEstudiantes; i++){

            int numeroCalificaciones = Integer.parseInt(
                    IO.readln("Ingrese el número de " +
                            "calificaciones para el estudiante " +
                            (i + 1) + ": "));

            calificaciones[i] = new int[numeroCalificaciones];

            for(int j = 0; j < numeroCalificaciones; j++){

                calificaciones[i][j] = Integer.parseInt(
                        IO.readln("Ingrese la calificación " +
                                (j + 1) + " del estudiante " +
                                (i + 1) + ": "));
            }
        }
    }
}
