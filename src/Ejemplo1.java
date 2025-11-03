public class Ejemplo1 {

    void main() {
        String texto = "Mi Texto De Prueba";
        IO.println("Texto original:");
        IO.println(texto);
        IO.println("Texto en mayúsculas:");
        IO.println(texto.toUpperCase());
        IO.println("Texto en minúsculas:");
        IO.println(texto.toLowerCase());
        IO.println("Texto Original nuevamente:");
        IO.println(texto);
        // Convertir el texto en un arreglo de caracteres
        String textoOculto = texto
                .replaceAll("[a-zA-Z]", "?");
        IO.println("Texto oculto:");
        IO.println(textoOculto);
        String letra = IO.readln(
                "Introduce una letra a buscar en el texto: ")
                .trim()
                .substring(0, 1); // Solo tomar el primer carácter
        // Búscar la letra como subtexto en el texto original
        int pos = texto.indexOf(letra);
        if (pos >= 0) {
            IO.println("La letra existe en el texto");
            // Buscar todas las posiciones de la letra en el texto
            for (int i = 0; i < texto.length(); i++) {
                if (texto.substring(i, i + 1).equals(letra)) {
                    IO.println("Letra encontrada en la posición: " + i);
                    textoOculto = textoOculto.substring(0, i)
                            + letra
                            + textoOculto.substring(i + 1);
                    IO.println("Texto oculto actualizado:");
                    IO.println(textoOculto);
                }
            }
        } else {
            IO.println("La letra no existe en el texto.");
        }
    }
}