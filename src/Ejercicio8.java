/*
Crea un arreglo `empleados` con los nombres de los empleados y otro arreglo `horasTrabajadas` con las horas trabajadas en la semana.

Escribe una función `calcularPagoSemanal` que calcule el pago semanal (a razón de $15 por hora trabajada).
*/

public class Ejercicio8 {
    public static void calcularPagoSemanal(String[] empleados, int[] horas) {
        double precioHora = 15;
        for (int i = 0; i < empleados.length; i++) {
            System.out.println("---------------------------------------------");
            System.out.println("Empleado: " + empleados[i]);
            System.out.println("Pago semanal : $" + (horas[i] * precioHora));
            System.out.println("---------------------------------------------");
        }
    }

    public static void main(String[] args) {
        String[] empleados = {"Ana", "Juan", "Maria", "Luis", "Lisa"};
        int[] horasTrabajadas = {40, 45, 37, 38, 40};

        calcularPagoSemanal(empleados, horasTrabajadas);
    }
}
