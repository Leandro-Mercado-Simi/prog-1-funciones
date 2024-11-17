/*
Crea un arreglo `facturas` con los montos de las facturas de los clientes.

Escribe una función `calcularImpuesto` que aplique un 21% de impuesto a cada factura.

*/

public class Ejercicio6 {

    public static void calcularImpuesto(double[] facturas) {

        for (int i = 0; i < facturas.length; i++) {
            System.out.println("----------------------------");
            System.out.println("Monto de la factura: " + facturas[i]);
            System.out.println("Monto de la factura apĺicando 21%: " + (facturas[i] * 1.21));
            System.out.println("----------------------------");
        }

    }

    public static void main(String[] args) {
        double[] facturas = {600, 120, 450, 875, 320};

        calcularImpuesto(facturas);
    }
}
