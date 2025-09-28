public class Test {

    void main() {
        IO.println("Hello, World!");
        IO.println("Ingrese su nombre:");
        String name = IO.readln();
        int edad = Integer.parseInt(IO.readln("Ingrese su edad:"));
        IO.println("Hola %s, tienes %d años.".formatted(name, edad));
    }
}
