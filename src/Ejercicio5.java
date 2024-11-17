/*
Una empresa desea conocer el promedio de satisfacción de sus clientes basado en encuestas de calificación de 1 a 5.

Crea un arreglo `calificaciones` con las puntuaciones de satisfacción de los clientes.
Escribe una función `calcularPromedioSatisfaccion` que recorra el arreglo y calcule el promedio de satisfacción.
*/

import java.text.DecimalFormat;

public class Ejercicio5 {
    public static double calcularPromedioSatisfaccion(double[] calificaciones) {
        double sumaCalificaciones = 0;

        for (int i = 0; i < calificaciones.length; i++) {
            sumaCalificaciones += calificaciones[i];
        }

        return (sumaCalificaciones / calificaciones.length);
    }

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        double[] calificaciones = {7, 5.5, 3.2, 8.5, 10, 4.0};

        System.out.println("El promedio de satisfacción de los clientes es de: " + df.format(calcularPromedioSatisfaccion(calificaciones)) + " / 10");
    }
}
