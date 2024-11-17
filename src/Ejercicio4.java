/*
Una empresa ofrece descuentos a sus clientes dependiendo de la cantidad de compras que han realizado.
Si han comprado más de 10 veces, reciben un 10% de descuento.

Crea un arreglo `clientes` y otro `compras` que almacene la cantidad de compras de cada cliente.
Escribe una función `calcularDescuentos` que recorra el arreglo y aplique el descuento a los clientes que califiquen.

*/

public class Ejercicio4 {

    public static void calcularDescuentos(String[] clientes, int[] compras) {
        for (int i = 0; i < clientes.length; i++) {
            if (compras[i] < 10) {
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("El cliente " + clientes[i] + " puede acceder a un descuento del 10%");
                System.out.println("--------------------------------------------------------------------------------");
            }
        }
    }

    public static void main(String[] args) {
        String[] clientes = {"Ana", "Juan", "Maria", "Luis", "Lisa"};
        int[] compras = {17, 5, 10, 8, 12};

        calcularDescuentos(clientes, compras);
    }
}
