/*
Una tienda de ropa ofrece un 15% de descuento a las compras superiores a $500.
Crea un arreglo `compras` que almacene los montos de las compras de los clientes.
Escribe una función `aplicarDescuento` que aplique el descuento a las compras que superen los $500.
*/

public class Ejercicio7 {

    public static void aplicarDescuento(double[] compras) {
        for (int i = 0; i < compras.length; i++) {
            if (compras[i] > 500) {
                System.out.println("----------------------------");
                System.out.println("Monto de la compra: $" + compras[i]);
                System.out.println("Monto con descuento: $" + (compras[i] * 0.85));
                System.out.println("----------------------------");
            }
        }
    }

    public static void main(String[] args) {
        double[] compras = {600, 120, 450, 875, 320};

        aplicarDescuento(compras);

    }
}
