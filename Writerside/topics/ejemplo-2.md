# Ejemplo 2: La serie de Fibonacci

## Descripción

Realice un algoritmo para generar N elementos de la sucesión de Fibonacci (0, 1, 1, 2, 3, 5, 8, 13,…). El planteamiento
del algoritmo correspondiente se hace a partir del análisis de la sucesión, en la que se puede observar que un tercer
valor de la serie está dado por la suma de los dos valores previos, de aquí que se asignan los dos valores para sumar
(0, 1), que dan la base para obtener el siguiente elemento que se busca, además, implica que el ciclo se efectuará dos
veces menos.

## Solución

Partiendo de lo visto sobre algoritmos, podemos plantear la solución al problema de la siguiente manera:

## Pseudocódigo

### Usando el ciclo MIENTRAS

```
Algoritmo SerieFibonacci

Definición de Variables:
    Entero: anterior1, anterior2, actual, contador, numeroElementos

1. INICIO
2. HACER anterior1 = 0, anterior2 = 1
3. ESCRIBIR "Ingrese el número de elementos de la serie Fibonacci que desea generar:"
4. LEER numeroElementos
5. SI numeroElementos <= 0 ENTONCES
    ENTONCES
        ESCRIBIR "El número de elementos debe ser mayor que cero."
    EN OTRO CASO
        SI numeroElementos = 1
            ENTONCES
                ESCRIBIR anterior1
            EN OTRO CASO
                ESCRIBIR anterior1
                ESCRIBIR anterior2
                HACER contador = 2
                MIENTRAS contador < numeroElementos HACER
                    HACER actual = anterior1 + anterior2
                    ESCRIBIR actual
                    HACER anterior1 = anterior2
                    HACER anterior2 = actual
                    HACER contador = contador + 1
6. FIN
```

### Usando el ciclo PARA

```
Algoritmo SerieFibonacci

Definición de Variables:
    Entero: anterior1, anterior2, actual, i, numeroElementos
    
1. INICIO
2. HACER anterior1 = 0, anterior2 = 1
3. ESCRIBIR "Ingrese el número de elementos de la serie Fibonacci que desea generar
4. LEER numeroElementos
5. SI numeroElementos <= 0
    ENTONCES
        ESCRIBIR "El número de elementos debe ser mayor que cero."
    EN OTRO CASO
        SI numeroElementos = 1
            ENTONCES
                ESCRIBIR anterior1
            EN OTRO CASO
                ESCRIBIR anterior1
                ESCRIBIR anterior2
                PARA i = 2 HASTA numeroElementos - 1 HACER
                    HACER actual = anterior1 + anterior2
                    ESCRIBIR actual
                    HACER anterior1 = anterior2
                    HACER anterior2 = actual
6. FIN
```

> Como puedes notar en el apartado del para se omite el segmento "CON PASO 1" ya que el incremento de la variable `i` se
> asume que es de uno en uno. {style="note"}

### Usando el ciclo HACER HASTA QUE

```
Algoritmo SerieFibonacci

Definición de Variables:
    Entero: anterior1, anterior2, actual, contador, numeroElementos

1. INICIO
2. HACER anterior1 = 0, anterior2 = 1
3. ESCRIBIR "Ingrese el número de elementos de la serie Fibonacci que desea generar:"
4. LEER numeroElementos
5. SI numeroElementos <= 0 ENTONCES
    ENTONCES
        ESCRIBIR "El número de elementos debe ser mayor que cero."
    EN OTRO CASO
        SI numeroElementos = 1
            ENTONCES
                ESCRIBIR anterior1
            SI numeroElementos = 2
                ENTONCES
                    ESCRIBIR anterior1
                    ESCRIBIR anterior2
                EN OTRO CASO
                    ESCRIBIR anterior1
                    ESCRIBIR anterior2
                    HACER contador = 3
                    HACER
                        HACER actual = anterior1 + anterior2
                        ESCRIBIR actual
                        HACER anterior1 = anterior2
                        HACER anterior2 = actual
                        HACER contador = contador + 1
                    HASTA QUE contador >= numeroElementos
6. FIN
```

### Diagrama de flujo

```d2
vars: {
  d2-config: {
        layout-engine: dagre
    sketch: true
  }
}
A:"Inicio"{shape: oval}
B:anterior1 = 0, anterior2 = 1{shape: rectangle}
C:"\"Ingrese el número de elementos de la serie Fibonacci que desea generar:\""{shape: document}
D:numeroElementos{shape: parallelogram}
E:numeroElementos <= 0{shape: diamond}
F:"\"El número de elementos debe ser mayor que cero.\""{shape: document}
G:numeroElementos == 1{shape: diamond}
H:anterior1{shape: document}
I:anterior1{shape: document}
J:anterior2{shape: document}
K:contador = 2{shape: rectangle}
L:contador < numeroElementos{shape: diamond}
M:actual = anterior1 + anterior2{shape: rectangle}
N:actual{shape: document}
O:anterior1 = anterior2{shape: rectangle}
P:anterior2 = actual{shape: rectangle}
Q:contador = contador + 1{shape: rectangle}
R:""{
    shape: circle
    width: 30
    height: 30
    }
S:""{
    shape: circle
    width: 30
    height: 30
    }
T:"Fin"{shape: oval}


A -> B -> C -> D
D -> E
E -> F: Sí
E -> G: No
G -> H: Sí
G -> I: No
I -> J -> K -> L
L -> M: Sí
M -> N -> O -> P -> Q -> L
L -> R: No
R -> S
H -> R
F -> S
S -> T
```