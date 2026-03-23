package org.example.UT0Ej3;

public class Contador {
    final int MAX_CONT = 10; // El final se usa para indicar que algo no puede modificarse. Se crea una constante llamada MAX_CONT con valor 10.
    int incremento = 1; // Define de cuánto en cuánto aumenta el contador. De uno en uno
    int contador = 0; // Guarda el valor actual del contador, inicia en 0
    static int totalObjetos  = 0; // Atributo static

    // Constructor
    public Contador() {
        totalObjetos++; // Cada vez que se crea un objeto, aumenta el valor
    }

    // Contador con WHILE
    public void whileContador() //Método que realiza el conteo usando while
    {
        contador = 0; // Se reinicia el contador para empezar desde 0.

        while (contador <= MAX_CONT) // Mientras contador sea menor o igual a MAX_CONT
        {
            System.out.println("While: " + contador); // Imprime el valor actual del contador
            contador += incremento;  //Incrementa el contador de 1 en 1
        }
    }
    // Contador con DO WHILE
    public  void doWhileContador() {
        contador = 0;
        do // Ejecuta primero el código
        {
            System.out.println("DoWhile: " + contador); // Primero imprime y despues incrementa.
            contador += incremento; //Incrementa el contador de 1 en 1
        }
        while (contador <= MAX_CONT); // Después se verifica la condición. Si contador sigue siendo menor o igual a 10, repite.
    }
    // Contador con FOR
    public void forContador ()
    {
        contador = 0; // Se reinicia el contador para empezar desde 0.
        for (contador = 0; contador <= MAX_CONT; contador += incremento) //Inicia el contador, se presenta la condición para seguir y el aumento del contador
        {
            System.out.println("For: " + contador); // Imprime el valor actual del contador
        }
    }
    public static void staticInstancia()
    {
        Contador contador1 = new Contador(); // Se crea el primer objeto de la clase Contador
        Contador contador2 = new Contador(); // Se crea el segundo objeto de la clase Contador

        contador1.incremento = 2;
        contador2.incremento = 3;

        System.out.println("Valor de incremento en contador1: " + contador1.incremento);
        System.out.println("Valor de incremento en contador2: " + contador2.incremento);
        System.out.println("Total de objetos creados: " + Contador.totalObjetos);
    }

}
