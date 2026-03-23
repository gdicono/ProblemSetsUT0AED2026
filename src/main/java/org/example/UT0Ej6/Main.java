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
    private static void multiplicarArreglos(Scanner valor)
    {
        System.out.println("Prueba multiplicar con arreglos");
    }

}
