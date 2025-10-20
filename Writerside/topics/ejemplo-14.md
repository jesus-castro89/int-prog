# Ejemplo 14: Registro de Calificaciones de Estudiantes

## Descripción

Imagina que eres el encargado de calificaciones de un curso y debes ingresar las calificaciones de los estudiantes de un
examen para luego calcular el promedio de la clase, la nota más alta, la más baja y cuántos aprobaron. Usaremos un
arreglo para guardar todas las notas.

> **Un arreglo es como una fila de casilleros numerados**<br />
> Cada casillero (index) guarda una calificación. Los casilleros comienzan en 0: el primer casillero es index 0, el
> segundo index 1, etc. Si hay 5 estudiantes tenemos casilleros 0..4.
> {style="note"}

## Pseudo-código

```
RegistroCalificaciones

Definición de Variables:
    ARREGLO: notas DE TIPO ENTERO
    ENTERO: n, i, suma, max, min, aprobados
    REAL: promedio
    
1. INICIO
2. ESCRIBIR "Ingrese el número de estudiantes:"
3. LEER n
4. HACER notas = NUEVO ARREGLO DE TAMAÑO n
5. PARA i DESDE 0 HASTA n-1 HACER
    ESCRIBIR "Ingrese la calificación del estudiante ", (i + 1), ":"
    LEER notas[i]
6. HACER suma = 0
7. HACER max = notas[0]
8. HACER min = notas[0]
9. HACER aprobados = 0
10. PARA i DESDE 0 HASTA n-1 HACER
        HACER suma = suma + notas[i]
        SI notas[i] > max
            ENTONCES
                HACER max = notas[i]
        SI notas[i] < min
            ENTONCES
                HACER min = notas[i]
        SI notas[i] >= 60
            ENTONCES
                HACER aprobados = aprobados + 1
11. HACER promedio = suma / n
12. ESCRIBIR "Promedio de la clase: ", promedio
13. ESCRIBIR "Calificación más alta: ", max
14. ESCRIBIR "Calificación más baja: ", min
15. ESCRIBIR "Número de estudiantes aprobados: ", aprobados
16. FIN
```

> Nota: Asumimos escala de 0 a 100 y 60 como nota aprobatoria (puedes adaptarlo).
> {style="note"}

## Código en Java

![e14-code.png](e14-code.png){style="block"}

## Explicación paso a paso del código

1. En primera instancia debemos recordar que un arreglo es una estructura de datos que nos permite almacenar múltiples
   valores del mismo tipo en una sola variable. En este caso, utilizamos un arreglo para almacenar las calificaciones de
   los estudiantes.
2. Debemos declarar las variables necesarias para almacenar el número de estudiantes, las calificaciones,
   la calificación máxima, la calificación mínima, la suma de las calificaciones y el promedio.
3. Utilizamos un bucle `do...while` para solicitar al usuario que ingrese el número de estudiantes, asegurándonos de que
   sea un número entero positivo.
    * Ten en cuenta que validamos la entrada del usuario para asegurarnos de que sea en primer lugar un número entero
      positivo. Ya que de lo contrario no tendría sentido continuar con el programa.
4. Inicializamos el arreglo de calificaciones con el tamaño especificado por el usuario.
5. Utilizamos un bucle `for` para solicitar las calificaciones de cada estudiante.
    * Dentro de este bucle, utilizamos otro bucle `do...while` para asegurarnos de que cada calificación ingresada sea
      válida (entre 0 y 100).
6. A medida que ingresamos cada calificación, la almacenamos en el arreglo y actualizamos la suma, la calificación
   máxima, la calificación mínima y el conteo de aprobados.
    * Para ello, comparamos cada calificación ingresada con la calificación máxima y mínima actuales, y actualizamos
      estas variables según sea necesario.
    * Así mismo contamos cuántas calificaciones son aprobatorias (60 o más).
7. Después de ingresar todas las calificaciones, calculamos el promedio dividiendo la suma de las calificaciones por el
   número de estudiantes.
8. Finalmente, mostramos el promedio, la calificación más alta, la más baja y el número de estudiantes que aprobaron.

## Puntos importantes

* **Los índices de los arreglos comienzan en 0.**
    * Si quieres el “primer estudiante” lo mostramos como i+1 para ser más
      humano.
* **Declaración vs. Inicialización:**
    * `double[] grades; //declara la variable`
    * `grades = new double[n]; //crea el arreglo.`
* **Tipo y tamaño fijo:**
    * El tamaño n no cambia una vez creado el arreglo (para cambiarlo necesitarían otras estructuras que
      verán después).
* **Acceso por índice:**
    * grades[2] obtiene la tercera nota.
* **Errores comunes:**
    * El índice más grande es n-1 (no n).
    * Intentar acceder a un índice fuera del rango causa un error en tiempo de ejecución.
* **Validación de entrada:**
    * Siempre válida la entrada del usuario para evitar errores y asegurar que los datos sean correctos.
* **Uso de bucles anidados:**
    * Puedes usar bucles dentro de otros bucles para manejar tareas más complejas, como la validación de entrada.
* **Comentarios en el código:**
    * Usa comentarios para explicar la lógica y los pasos que estás siguiendo en tu código.

> **Metáfora**: el arreglo es una hilera de casilleros numerados. Guardas una nota en cada casillero y luego revisas
> todos los casilleros para sacar conclusiones (promedio, máximo, etc.).
> {style="note"}