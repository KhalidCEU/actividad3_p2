## Actividad 2 - Métodos recursivos

Este ejercicio tiene como fin hacer uso de **metodos recursivos** en Java mediante funciones
matematicas.

El **método main** con las llamadas a los métodos estaticos y los parametros de test, se encuentra en el fichero [Principal.java](/src/aplicacion/Principal.java), y las funciones matématicas, en el fichero [Mates.java](/src/dominio/Mates.java).

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
// P('s) = Parametro(s)

Suma hasta n: 55                // P: 10
Factorial: 120                  // P: 5
Potencia: 16                    // P's: 2, 4
Suma elementos lista: 55        // P: {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
Media elementos lista: 5.0      // P: {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
Desviación elementos lista: 3.872983346207417   // P: {9, 3, 8, 8, 9, 8, 9, 18}

... // resto de output
```