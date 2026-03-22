package org.example.UT0Ej3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner n1 = new Scanner(System.in); // Se define el scanner con el nombre n1
        Contador contador = new Contador();

        System.out.println("Elegir tipo:"); //Imprime en pantalla "Elegir tipo"
        System.out.println("1 - While");
        System.out.println("2 - Do While");
        System.out.println("3 - For");
        System.out.println("4 - Static e Instancia");

        int opcion = n1.nextInt();
        switch (opcion)
        {
            case 1:
                contador.whileContador();
                break;
            case 2:
                contador.doWhileContador();
                break;
            case 3:
                contador.forContador();
                break;
            case 4:
                Contador.staticInstancia();
                break;
            default:
                System.out.println("Opcion incorrecta, seleccione un número dentro del menú");
                break;
        }

    }
}

