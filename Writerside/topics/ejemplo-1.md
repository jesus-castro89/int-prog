# Ejemplo 1: La Fábrica de Chocolate

## Descripción

Realice un algoritmo para determinar cuánto se debe pagar por equis cantidad de barras de chocolate considerando que si
son 1000 o más el costo es de $5.25; de lo contrario, el precio es de $8.75.

## Solución

Partiendo de lo visto sobre algoritmos, podemos plantear la solución al problema de la siguiente manera:

## Pseudocódigo

```
Algoritmo CalcularCostoChocolate

Definición de Variables:
    Entero: cantidadBarras
    Real: costoTotal

1. INICIO
2. ESCRIBIR "Ingrese la cantidad de barras de chocolate:"
3. LEER cantidadBarras
4. SI cantidadBarras >= 1000 ENTONCES
    Entonces
        costoTotal = cantidadBarras * 5.25
    En otro caso
        costoTotal = cantidadBarras * 8.75
5. ESCRIBIR "El costo total es: $", costoTotal
6. FIN
```

## Diagrama de Flujo

```d2
vars: {
  d2-config: {
    layout-engine: dagre
    sketch: true
  }
}
A:"Inicio"{shape: oval}
B:"\"Ingrese la cantidad de barras de chocolate:\""{shape: document}
C:"cantidadBarras"{shape: parallelogram}
D:"cantidadBarras >= 1000"{shape: diamond}
E:"costoTotal = cantidadBarras * 5.25"{shape: rectangle}
F:"costoTotal = cantidadBarras * 8.75"{shape: rectangle}
P1:""{
    shape: circle
    width: 30
    height: 30
    }
G:"\"El costo total es de \$:\", costoTotal"{shape: document}
H:"Fin"{shape: oval}

A -> B -> C -> D
D -> E: Sí
D -> F: No  
E -> P1
F -> P1
P1 -> G -> H
```

## Explicación

1. **Definición de Variables**: Se definen dos variables, `cantidadBarras` para almacenar la cantidad de barras de
   chocolate y `costoTotal` para almacenar el costo total a pagar.
2. **Inicio**: El algoritmo comienza con la instrucción `INICIO`.
3. **Entrada de Datos**: Se solicita al usuario que ingrese la cantidad de barras
4. **Condicional**: Se verifica si la cantidad de barras es mayor o igual a 1000.
   - Si es verdadero, se calcula el costo total multiplicando la cantidad de barras por $5.25.
   - Si es falso, se calcula el costo total multiplicando la cantidad de barras por $8.75.
5. **Salida de Datos**: Se muestra el costo total al usuario.
6. **Fin**: El algoritmo termina con la instrucción `FIN`.