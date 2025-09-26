# Los comentario en Java

Los comentarios son una parte esencial del código fuente en cualquier lenguaje de programación, incluido Java. Los
comentarios se utilizan para explicar y documentar el código, hacer que sea más legible y comprensible para otros
desarrolladores (o para uno mismo en el futuro). Además, los comentarios pueden ser útiles para desactivar temporalmente
partes del código durante el proceso de desarrollo y depuración.

En Java, existen dos tipos principales de comentarios:

## Comentarios de una sola línea

Los comentarios de una sola línea comienzan con dos barras diagonales (`//`). Todo lo que sigue a estas barras en la
misma línea se considera un comentario y no será ejecutado por el compilador. Este tipo de comentario es útil para
agregar notas breves o explicaciones sobre una línea específica de código.

```java
// Este es un comentario de una sola línea
int numero = 10; // Declaración de una variable entera
``` 

> Para efectos practicos, usaremos este tipo de comentario antes de cada línea de código, para explicar qué hace cada
> línea que no quede tan clara o autodescriptiva. {style="note"}

## Comentarios de múltiples líneas

Los comentarios de múltiples líneas comienzan con `/*` y terminan con `*/`. Todo lo que se encuentra entre estos
delimitadores se considera un comentario, incluso si abarca varias líneas. Este tipo de comentario es útil para agregar
explicaciones más detalladas o para desactivar bloques de código durante la depuración o pruebas.

```java
/*
 * Este es un comentario de múltiples líneas.
 * Puede abarcar varias líneas.
 * Es útil para explicaciones detalladas.
 */
int suma = 5 + 3; /* Esto también es un comentario de múltiples líneas */
```

> Los comentarios de múltiples líneas son ideales para documentar funciones, clases o secciones completas de código.
> {style="note"}

## Buenas prácticas para usar comentarios en Java

1. **Sé claro y conciso**: Los comentarios deben ser fáciles de entender y no demasiado largos. Evita comentarios
   redundantes que simplemente repitan lo que el código ya expresa.
2. **Mantén los comentarios actualizados**: Asegúrate de que los comentarios reflejen con precisión el código. Si el
   código cambia, actualiza los comentarios en consecuencia.
3. **Usa comentarios para explicar "por qué"**: En lugar de explicar "qué" hace el código (que debería ser evidente a
   partir del código mismo), usa comentarios para explicar por qué se tomó una decisión particular o el propósito de una
   sección de código.
4. **Evita el exceso de comentarios**: No es necesario comentar cada línea de código. Usa comentarios solo cuando sea
   necesario para mejorar la comprensión.
5. **Usa comentarios para secciones complejas**: Si una sección de código es particularmente compleja o no intuitiva, un
   comentario puede ayudar a aclarar su propósito y funcionamiento.