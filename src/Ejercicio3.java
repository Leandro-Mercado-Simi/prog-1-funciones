/*
Crea un arreglo `clientes` que almacene los nombres de los clientes
y un arreglo `facturasPendientes` con el monto de sus facturas pendientes.

Escribe una función `enviarFacturas` que imprima los nombres de los clientes con facturas mayores a $500.
*/

public class Ejercicio3 {

    public static void enviarFacturas(String[] clientes, double[] facturas) {

        for (int i = 0; i < clientes.length; i++) {
            if (facturas[i] > 500) {
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("Factura a nombre de: " + clientes[i]);
                System.out.println("El monto a pagar es de: $" + facturas[i]);
                System.out.println("--------------------------------------------------------------------------------");
            }
        }

    }

    public static void main(String[] args) {
        String[] clientes = {"Ana", "Juan", "Maria", "Luis", "Lisa"};
        double[] facturas = {550, 700, 250, 450, 385};

        enviarFacturas(clientes, facturas);
    }
}
