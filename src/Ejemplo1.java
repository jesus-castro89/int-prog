public class Ejemplo1 {

    void main(){

        String name;
        int age;
        name=IO.readln("¿Cómo te llamas?");
        age=Integer.parseInt(IO.readln("¿Cuántos años tienes?"));
        IO.println("Hola, "+name);
        IO.println("Tienes "+age+" años");
    }
}