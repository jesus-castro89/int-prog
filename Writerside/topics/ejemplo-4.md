# ejemplo-4

El banco “Pueblo desconocido” ha decidido aumentar el límite de crédito de
las tarjetas de crédito de sus clientes, para esto considera que si su cliente
tiene tarjeta tipo 1, el aumento será de 25 %; si tiene tipo 2, será de 35 %;
si tiene tipo 3, de 40 %, y para cualquier otro tipo, de 50 %. Ahora bien, si la
persona cuenta con más de una tarjeta, sólo se considera la de tipo mayor
o la que el cliente indique. 

```
AumentoCredito

Definición de Variables:
    Logico: variasTarjetas
    Entero: tipoTarjeta
    Real: lineaCredito

1. Inicio
2. Escribir "¿Cuenta con más de una tarjeta?"
3. Leet variasTarjetas
4. Si variasTarjetas
    Entonces
        Inicio
            Escribir "Ingrese el tipo de tarjeta que desea usar para el aumento"
            Leer tipoTarjeta
            Escribir "Ingrese el limite de credito de dicha tarjeta"
            Leer lineaCredito
        Fin
    En otro caso
        Inicio
            Escribir "Ingrese su tipo de tarjeta"
            Leer tipoTarjeta
            Escribir "Ingrese su limite de credito"
            Leer lineaCredito
        Fin