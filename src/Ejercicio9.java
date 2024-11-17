/*
Una empresa quiere calcular el precio final de sus productos después de aplicar un descuento general del 10%.

Crea un arreglo `preciosOriginales` que almacene el precio original de varios productos.
Escribe una función `calcularPrecioFinal` que aplique el descuento a cada producto y devuelva el precio final.
*/

public class Ejercicio9 {
    public static double calcularPrecioFinal(double monto) {
        return monto * 0.90;
    }

    public static void main(String[] args) {
        double[] preciosOriginales = {700, 500.5, 3200, 850, 1000, 450};

        for (int i = 0; i < preciosOriginales.length; i++) {
            System.out.println("------------------------");
            System.out.println("Precio original del producto: $" + preciosOriginales[i]);
            System.out.println("Precio final aplicando -10%: $" + calcularPrecioFinal(preciosOriginales[i]));
            System.out.println("------------------------");
        }
    }
}
