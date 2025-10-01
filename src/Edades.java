public class Edades {

    void main() {
        int edad = Integer.parseInt(IO.readln("Ingrese su edad"));
        if (edad >= 0 && edad <= 12) {
            IO.print("El edad es mayor o igual a 12");
        } else if (edad <= 19) {
            IO.print("El edad es menor o igual a 19");
        } else if (edad <= 64) {
            IO.print("El edad es mayor o igual a 64");
        } else if (edad >= 65) {
            IO.print("El edad es menor o igual a 65");
        } else if (edad < 0) {
            IO.print("El edad es menor o igual a 0");
        }
    }
}
