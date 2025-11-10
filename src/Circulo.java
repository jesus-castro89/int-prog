public class Circulo {

    void main(){
        double radio = Lector.leerNumero("Introduce el radio del círculo:");
        double area = Math.PI * Math.pow(radio, 2);
        IO.println("El área del círculo es: " + area);
    }
}
