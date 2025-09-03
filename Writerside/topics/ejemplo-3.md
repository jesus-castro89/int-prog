# Ejemplo 3: Casos de Envio

Una compañía de paquetería internacional tiene servicio en algunos países de América del Norte, América Central, América
del Sur, Europa y Asia. El costo por el servicio de paquetería se basa en el peso del paquete y la zona a
la que va dirigido.

| Zona | Ubicación         | Costo/gramo |
|------|-------------------|-------------|
| 1    | América del Norte | $11.00      |
| 2    | América Central   | $10.00      |
| 3    | América del Sur   | $12.00      |
| 4    | Europa            | $24.00      |
| 5    | Asia              | $27.00      |

Parte de su política implica que los paquetes con un peso superior a 5 kg no son transportados, esto por cuestiones de
logística y de seguridad. Realice un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el
rechazo de la entrega.

```
CostoPaquetes

Definición de Variables:
    Real: costoTotal
    Entero: zona, peso

Definición de Constantes
    Real: Z1=11.00, Z2=10.00, Z3=12.00, Z4=24.00, Z5=27.00
    
1. Inicio
2. Escribir "Seleccione la zona a dónde se dirige su paquete:
             1. América del Norte
             2. América Central
             3. América del Sur
             4. Europa
             5. Asia"
3. Leer zona
4. Si zona < 1 || zona > 5
    Entonces
        Escribir "La zona seleccionada es invalida"
    En otro Caso
        Escribir "Ingrese el peso del paquete en gramos"
        Leer peso
        Si peso > 0 Y peso <= 50000
            Entonces
                Inicio
                    En caso de zona
                        Caso 1:
                            costoTotal = peso * z1
                        Caso 2:
                            costoTotal = peso * z2
                        Caso 3:
                            costoTotal = peso * z3
                        Caso 4:
                            costoTotal = peso * z4
                        Caso 5:
                            costoTotal = peso * z5
                    Escribir "El costo de tu envio es de ", costoTotal
                Fin
            En otro caso
                Escribir "El paquete excede el peso limite para envio"
5. Fin
```