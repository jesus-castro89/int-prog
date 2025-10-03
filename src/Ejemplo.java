public class Ejemplo {

    void main(){

        double number= Double.parseDouble(IO.readln("Dame un número:"));
        if(number==0){
            IO.println("El número no puede ser cero");
        }else{
            IO.println(number);
        }
    }
}
