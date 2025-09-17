# Ejercicio 1: Toma de Decisiones

## Descripción

Lee atentamente cada uno de los siguientes problemas y realiza el pseudocódigo y el diagrama de flujo correspondiente
para cada uno de ellos.

1. La política de la compañía telefónica “chimefón” es: “Chismea + x -”. Cuando se realiza una llamada, el cobro es por
   el tiempo que durará, de tal forma que los primeros cinco minutos cuestan **_$ 1.00 c/u_**, los siguientes tres,
   **_80¢ c/u_**, los siguientes dos minutos, **_70¢ c/u_**, y a partir del décimo minuto, 50¢ c/u. Además, se carga un
   impuesto de **3 %**cuando es domingo, y si es día hábil, en turno matutino, **15 %**, y en turno vespertino,
   **10 %**. Realice un algoritmo para determinar cuánto debe pagar por cada concepto una persona que realiza una
   llamada.
    * ```
        CostoLlamada

        Definir Constantes
        Real: c2=0.8, c3=0.7, c4=0.5
        
        Definir Variables
        Entero: minutos
        Real: total
        Lógico: esHabil, esDomingo, esMatutino
        
        1. INICIO
           2. ESCRIBIR "Ingrese la cantidad de minutos de la llamada"
           3. LEER minutos
           4. SI minutos <= 5
              ENTONCES
              HACER total = minutos
              EN OTRO CASO
              SI minutos <= 8
              ENTONCES
              total = 5 + ((minuto - 5) * c2)
              EN OTRO CASO
              SI minutos <= 10
              ENTONCES
              total = 7.4 + ((minutos - 8) * c3)
              EN OTRO CASO
              total = 8.8 + ((minutos - 10) * c4)
           5. ESCRIBIR "La llamada fue en día hábil?"
           6. LEER esHabil
           7. SI esHabil
              ENTONCES
              INICIO
              ESCRIBIR "La llamada fue en la mañana?"
              LEER esMatutino
              SI esMatutino
              ENTONCES
              total *= 1.15
              EN OTRO CASO
              total *= 1.10
              FIN
              EN OTRO CASO
              INICIO
              ESCRIBIR "La llamada fue en domingo?"
              LEER esDomingo
              SI esDomingo
              ENTONCES
              total *= 1.03
              FIN
           8. ESCRIBIR "El total de tu llamada es de: ", total
           9. FIN
      ```
2. Una compañía de viajes cuenta con tres tipos de autobuses (A, B y C), cada uno tiene un precio por kilómetro
   recorrido por persona, los costos respectivos son **_\$ 2.0_**, **_\$ 2.5_** y **_\$ 3.0_**. Se requiere determinar
   el costo total y por persona del viaje considerando que cuando se realiza el presupuesto debe haber un mínimo de 20
   personas, de lo contrario el cobro se realiza con base en este número límite.
3. El consultorio del Dr. Lorenzo T. Mata Lozano tiene como política cobrar la consulta con base en el número de cita,
   de la siguiente forma: Las **tres primeras citas** a _**\$ 200.00 c/u**_. Las siguientes **dos citas** a $150.00 c/u.
   Las **tres siguientes citas** a _**\$ 100.00 c/u**_. **Las restantes** a _**\$ 50.00 c/u**_, mientras dure el
   tratamiento. Se requiere un algoritmo para determinar: **Cuánto pagará el paciente por la cita** y **El monto de lo
   que ha pagado el paciente por el tratamiento**.
4. Una empresa de venta de autos usados paga a su personal de ventas un sueldo base más una comisión por cada auto
   vendido, la cual depende del precio del auto. Si el precio es menor a **_\$ 10,000_** la comisión es del **5 %**; si
   el precio es mayor o igual a **_\$ 10,000_**, pero menor a **_\$ 20,000_** la comisión es del **_8 %_**; y si el
   precio es mayor o igual a **_\$ 20,000_** la comisión es del **10 %**. Realice un algoritmo para determinar el sueldo
   total de un vendedor en un mes determinado,
   considerando que se sabe cuántos autos vendió y el precio de cada uno de ellos.
5. Una empresa de venta de computadoras ofrece a sus clientes un plan de pagos que depende del precio de la
   computadora. Si el precio es menor a **_\$ 5000_**, el cliente puede pagar en un plazo máximo de **6 meses**; si el
   precio es mayor o igual a **_\$ 5000_**, pero menor a **_\$ 10,000_**, el plazo máximo es de **12 meses**; y si el
   precio es mayor o igual a **_\$ 10,000_**, el plazo máximo es de **18 meses**. Realice un algoritmo para determinar
   el plazo máximo en que un cliente puede pagar su computadora, considerando que se sabe el precio de la misma.

## Entregable

En equipos de trabajo, realicen el pseudocódigo y el diagrama de flujo correspondiente para cada uno de los problemas
planteados. Incluyan una portada con los siguientes datos:

- Nombre del curso
- Nombre del ejercicio
- Nombre de los integrantes del equipo

Suban el documento en formato PDF a la plataforma de la asignatura antes de la fecha límite
(**_5 de septiembre de 2025_**).

> Actividades entregadas posteriores a la fecha límite serán consideradas con una calificación máxima de 70/100.
> {style="warning"}

> Integrante que no aparezca en la portada no será considerado en la evaluación del ejercicio.
> {style="warning"}

## Criterios de Evaluación

| Criterio             | Descripción                                                    | Peso     |
|----------------------|----------------------------------------------------------------|----------|
| Portada              | Incluye todos los datos requeridos en la portada.              | 10%      |
| Pseudocódigo         | Correcta elaboración del pseudocódigo para cada problema.      | 35%      | 
| Diagrama de Flujo    | Correcta elaboración del diagrama de flujo para cada problema. | 35%      |
| Nombres descriptivos | Uso de nombres descriptivos para variables y procesos.         | 10%      |
| Formato y Ortografía | Presentación clara y sin errores ortográficos.                 | 10%      |
| Total                |                                                                | **100%** |