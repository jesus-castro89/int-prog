# Ejemplo 5: Fabricas el Cometa

## Descripción

Fábricas “El cometa” produce artículos con claves (1, 2, 3, 4, 5 y 6).
Se requiere un algoritmo para calcular los precios de venta, para esto hay que considerar lo siguiente:

* Costo de producción = **materia prima** + **mano de obra** + **gastos de fabricación**.
* Precio de venta = **costo de producción** + **45 % de costo de producción**.

El costo de la mano de obra se obtiene de la siguiente forma:

* Para los productos con clave 3 o 4 se carga 75 % del costo de la materia prima;
* Para los que tienen clave 1 y 5 se carga 80 % del costo de la materia prima.
* Para los que tienen clave 2 o 6, 85 % del costo de la materia prima.

Para calcular el gasto de fabricación se considera que:

* Si las claves son 2 o 5, representa 30 % sobre el costo de la materia prima;
* si las claves son 3 o 6, representa 35 % sobre el costo de la materia prima;
* Si las claves son 1 o 4, representa 28 % sobre el costo de la materia prima.

La materia prima tiene el mismo costo para cualquier clave.

## Solución

Partiendo de lo visto sobre algoritmos, podemos plantear la solución al problema de la siguiente manera:

## Pseudocódigo

```
PrecioVentaCometa

Definición de Variables:
    Real: materiaPrima, manoObra, gastosFabricacion, 
          costoProduccion, precioVenta
    Entero: claveProducto

1. INICIO
2. ESCRIBIR "Ingrese la clave del producto (1-6):"
3. LEER claveProducto
4. SI claveProducto < 1 || claveProducto > 6
    ENTONCES
        ESCRIBIR "Clave del producto inválida."
    EN OTRO CASO
        INICIO
            ESCRIBIR "Ingrese el costo de la materia prima:"
            LEER materiaPrima
            SI claveProducto = 3 O claveProducto = 4
                ENTONCES
                    HACER manoObra = materiaPrima * 0.75
                EN OTRO CASO
                    SI claveProducto = 1 O claveProducto = 5
                        ENTONCES
                            HACER manoObra = materiaPrima * 0.80
                        EN OTRO CASO
                            HACER manoObra = materiaPrima * 0.85
            SI claveProducto = 2 O claveProducto = 5
                ENTONCES
                    HACER gastosFabricacion = materiaPrima * 0.30
                EN OTRO CASO
                    SI claveProducto = 3 O claveProducto = 6
                        ENTONCES
                            HACER gastosFabricacion = materiaPrima * 0.35
                        EN OTRO CASO
                            HACER gastosFabricacion = materiaPrima * 0.28
            HACER costoProduccion = materiaPrima + manoObra + gastosFabricacion
            HACER precioVenta = costoProduccion * 1.45
            ESCRIBIR "El costo de producción del producto es: ", costoProduccion
            ESCRIBIR "El costo de la mano de obra es: ", manoObra
            ESCRIBIR "El costo de los gastos de fabricación es: ", gastosFabricacion
            ESCRIBIR "El precio de venta del producto es: ", precioVenta
        FIN
5. FIN
```