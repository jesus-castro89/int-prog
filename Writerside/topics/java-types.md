# Tipos de Datos en Java

Java es un lenguaje de programación fuertemente tipado, lo que significa que todas las variables deben ser declaradas
con un tipo de dato específico. Los tipos de datos en Java se dividen en dos categorías: primitivos y no primitivos.

## Tipos de Datos Primitivos

Los tipos de datos primitivos son los más básicos y no son objetos. Hay ocho tipos de datos primitivos en Java:

| Tipo de Dato | Descripción                              |
|--------------|------------------------------------------|
| byte         | 8-bit entero con signo                   |
| short        | 16-bit entero con signo                  |
| int          | 32-bit entero con signo                  |
| long         | 64-bit entero con signo                  |
| float        | 32-bit número de punto flotante IEEE 754 |
| double       | 64-bit número de punto flotante IEEE 754 |
| boolean      | true o false                             |
| char         | 16-bit carácter Unicode                  |
| void         | No tiene valor (Usado por las funciones) |

## Tipos de Datos No Primitivos (Clases)

Los tipos de datos no primitivos son objetos. Hay dos tipos de datos no primitivos en Java:

| Tipo de Dato | Descripción                            |
|--------------|----------------------------------------|
| String       | Secuencia de caracteres                |
| Array        | Colección de elementos del mismo tipo  |
| Class        | Clase creada creada por el programador |

## Casting o Conversión de Tipos

El casting es la conversión de un tipo de dato a otro. Hay dos tipos de casting en Java: implícito y explícito.

Existen dos tipos de casting en Java:

- **Casting Implícito**: Se realiza automáticamente por el compilador.
- **Casting Explícito**: Se realiza manualmente por el programador.

### Ejemplo de Casting Implícito

```java
int x = 10;
double y = x; // Casting implícito
```

### Ejemplo de Casting Explícito

```java
double x = 10.5;
int y = (int) x; // Casting explícito
```

## Los Wrappers

Los wrappers son clases que encapsulan tipos de datos primitivos. Los wrappers proporcionan métodos útiles para
manipular los tipos de datos primitivos.

| Tipo de Dato Primitivo | Wrapper Clase |
|------------------------|---------------|
| byte                   | Byte          |
| short                  | Short         |
| int                    | Integer       |
| long                   | Long          |
| float                  | Float         |
| double                 | Double        |
| boolean                | Boolean       |
| char                   | Character     |

### Ejemplo de Wrappers

```java
int x = 10;
Integer y = Integer.valueOf(x); // Wrapper
```