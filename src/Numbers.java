public class Numbers {

    void main() {
        double number = Double.parseDouble(
                IO.readln("Dame un número:"));
        if (number % 2 == 0) {
            IO.println("El número es par");
        } else if (number % 3 == 0) {
            IO.println("El número es múltiplo de 3");
        } else if (number % 5 == 0) {
            IO.println("El número es múltiplo de 5");
        } else {
            IO.println("El número no es ni par ni múltiplo de 3 o 5");
        }
    }
}
