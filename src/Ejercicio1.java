/*
Crea un arreglo `ventas` que almacene las ventas diarias de una tienda durante 30 días.
Escribe una función `calcularIngresosMensuales` que recorra el arreglo y sume las ventas.
Imprime el total de ingresos mensuales
*/

import java.util.Scanner;

public class Ejercicio1 {
    public static double calcularIngresosMensuales(double[] ventas) {
        double totalIngresos = 0;

        for (int i = 0; i < ventas.length; i++) {
            totalIngresos += ventas[i];
        }

        return totalIngresos;
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double[] ventas = new double[30];


        for (int i = 0; i < ventas.length; i++) {
            System.out.print("Ingrese el monto de la venta del día: ");
            ventas[i] = s.nextDouble();
        }

        System.out.println("El monto total de ingresos mensuales es: $" + calcularIngresosMensuales(ventas));


    }
}
