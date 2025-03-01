## Actividad 3 - Expresiones lambda & Streams

Este ejercicio tiene como fin hacer uso de **expresiones lambda** y **streams** en Java.

El **ejercicio 12** se encuentra [aquí](/docs/ej12.md).

El **método main** con las llamadas a los métodos estaticos y los parametros de test, se encuentra en el fichero [Principal.java](/src/aplicacion/Principal.java), y los metodos, en los ficheros [Streams.java](/src/dominio/Streams.java) y [Lambda.java](/src/dominio/Lambda.java) (ejercicios **13 a 16**).

El **ejercicio 17**, al necesitar diferentes clases, se encuentra en los ficheros [Persona.java](/src/dominio/Persona.java) y [Personas.java](/src/dominio/Personas.java)

### Uso

Primero compile el programa con el comando :

```
make
```

Lance el programa :

```
./a.out
```

### Output


```
// P's = Parametros

 -- Lambdas --
Integral e^(x^2): 1.6530887841617505        // P's: 0, 1, 0.1
Integral: 1.6530887841617505                // P's: 0, 1, 0.1, x -> Math.exp(x*x)
Suma hasta n: 55                            // P's: 10, x -> x + 1

...

 -- Streams --

... // resto de output
```