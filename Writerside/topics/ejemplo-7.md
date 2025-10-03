# Ejemplo 7: Condiciones y precios en un restaurante

En un restaurante, el precio de una comida puede variar según varios factores, como el día de la semana, la hora del día
y si hay alguna promoción especial. A continuación, se presentan algunas condiciones y sus respectivos precios:

- **Día de la semana**:
    - Lunes a viernes: Precio estándar
    - Sábado y domingo: Precio con recargo del 10%
- **Hora del día**:
    - Almuerzo (12:00 PM - 3:00 PM): Precio con descuento del 5%
    - Cena (6:00 PM - 10:00 PM): Precio estándar
- **Promociones especiales**:
    - Si hay una promoción especial, se aplica un descuento adicional del 15% sobre el precio final.  

## Algoritmo para calcular el precio final

```
CostoPedido

Declaración de Varaibles:
    Real: PrecioBase, PrecioFinal
    Entero: DiaSemana, HoraDia
    Booleano: PromocionEspecial

1. INICIO
2. ESCRIBIR "Ingrese el precio base del pedido:"
3. LEER PrecioBase
4. ESCRIBIR "Ingrese el día de la semana (1-7, donde 1=Lunes, 7=Domingo):"
5. LEER DiaSemana
6. ESCRIBIR "Ingrese la hora del día (en formato 24 horas, por ejemplo, 13 para 1 PM):"
7. LEER HoraDia
8. ESCRIBIR "¿Hay una promoción especial? (1=Sí, 0=No):"
9. LEER PromocionEspecial
10. PrecioFinal = PrecioBase
11. SI DiaSemana >= 6 ENTONCES
        ENTONCES
            PrecioFinal = PrecioFinal * 1.10  // Aplicar recargo del 10%
12. SI HoraDia >= 12 Y HoraDia < 15 ENTONCES
        ENTONCES
            PrecioFinal = PrecioFinal * 0.95  // Aplicar descuento del 5%
13. SI PromocionEspecial = 1 ENTONCES
        ENTONCES
            PrecioFinal = PrecioFinal * 0.85  // Aplicar descuento del 15%
14. ESCRIBIR "El precio final del pedido es: ", PrecioFinal
15. FIN
```