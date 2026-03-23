package org.example.UT0Ej6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner valor = new Scanner(System.in);
        multSumaconInt (valor); // Prueba multsuma con int
        multSumacondouble(valor); // Prueba multsuma con double
        multiplicarArreglos (valor);
    }

    private static void multSumaconInt (Scanner valor) // Método para pedir al usuario los valores con int
    {
        System.out.println("Prueba multsuma con int");
        System.out.println("Ingrese a: ");
        int a =  valor.nextInt();
        System.out.println("Ingrese b: ");
        int b = valor.nextInt();
        System.out.println("Ingrese c: ");
        int c = valor.nextInt();

        int resultado = Multsuma.multsuma(a, b, c);
        System.out.println("El resultado es: " + resultado);
    }
    private static void multSumacondouble (Scanner valor) // Método para pedir al usuario los valores con double
    {
        System.out.println("Prueba multsuma con double");
        System.out.println("Ingrese a: ");
        double a =  valor.nextDouble();
        System.out.println("Ingrese b: ");
        double b = valor.nextDouble();
        System.out.println("Ingrese c: ");
        double c = valor.nextDouble();

        double resultado = Multsuma.multsuma(a, b, c);
        System.out.println("El resultado es: " + resultado);

    }
    private static void multiplicarArreglos(Scanner valor) //Por completar
    {
        System.out.println("Prueba multiplicar con arreglos");
        int [] arreglo1 = leerArreglo (valor,1);
        int [] arreglo2 = leerArreglo (valor,2);
        if (!Multsuma.validarMultiplicacion(arreglo1, arreglo2)) {
            System.out.println("Los arreglos no tienen el mismo tamaño");
            return;
        }
        int [] resultado = Multsuma.multArreglo(arreglo1,arreglo2);
        System.out.println("Resultado: ");
        for (int i = 0; i < resultado.length; i++) {
            System.out.println("Posición " + i + ": " + resultado[i]);
        }

    }

    private static int[] leerArreglo(Scanner valor, int numArreglo)
    {
        System.out.println("Ingrese el valor del arreglo" +  numArreglo);
        int largo = valor.nextInt();
        int [] arreglo = new int[largo];
        for (int i = 0; i < largo; i++) {
            System.out.println("Ingrese el valor de la posición" + i + ":");
            arreglo[i] = valor.nextInt();
        }
        return arreglo;
    }

}
