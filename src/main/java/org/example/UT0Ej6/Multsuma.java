package org.example.UT0Ej6;

public class Multsuma {
    public static double multsuma(double a, double b, double c)
    {
        return a * b + c;
    }
    public static int multsuma(int a, int b, int c)
    {
        return a * b + c;
    }
    public static int[] multArreglo (int [] arreglo1, int [] arreglo2)
    {
        int [] resultado = new int[arreglo1.length];
        for (int i = 0; i < arreglo1.length; i++) {
            resultado[i] = arreglo1[i] * arreglo2[i];
        }
        return resultado;
    }
}
