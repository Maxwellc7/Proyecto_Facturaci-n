package factura;

import java.util.Locale;
import java.util.Scanner;

public class AppFactura {

    public static void main(String[] args) {

        double precioTotal = 0;//falta implementacion de un metodo para calcular el precio

        System.out.println("==============================================================" );
        System.out.println("Bienvenido a DigitalMK,ingrese la siguiente informacion: ");

        Factura factu=new Factura();//Creacion factura
        Scanner sc=new Scanner(System.in);
        sc.useLocale(Locale.US);

        one: //Ingreso de datos del cliente
        Cliente cliente=new Cliente();//Creacion cliente
        System.out.print("Introduzca el nombre del cliente: ");
        cliente.nombre=sc.nextLine();
        System.out.print("Introduzca la cedula de identidad o ruc del cliente:");
        cliente.id=sc.nextLine();
        System.out.print("Introduzca la direccion de domocilio del cliente:");
        cliente.direccion=sc.nextLine();
        System.out.print("Introduzca el numero de contacto del cliente:");
        cliente.numCel=sc.nextLine();
        System.out.print("Introduzca el email del cliente:");
        cliente.email=sc.nextLine();

        System.out.println("Realice su compra");

        two: //Bucle para ingresar productos
        do {//Creacion de un maximo de 5 productos, definiendo la cantidad, nombre, precio

            int salir = 0;
            int contador = 0;
            Producto prod=new Producto();

            System.out.println("Ingrese el nombre del producto: ");
            prod.nombre=sc.nextLine();

            System.out.println("Ingrese el precio del producto:");
            prod.valorUni=sc.nextDouble();

            System.out.println("Ingrese cuantos productos llevara de esta especie: ");
            prod.cantidad=sc.nextInt();

            precioTotal += prod.valorUni * prod.cantidad;

            contador++;
            System.out.println("Ingrese 0 si desea agregar un producto, caso contrario 1 para salir");
            salir = sc.nextInt();//preguntar si no se crea ningun objeto mas, en caso de exceder el limite salir del do-while

        }while(contador != 4 || salir != 0);

        System.out.println("Gracias por su compra,se le presentara su factura");
        System.out.println("==============================================================");
        System.out.println("Precio Final ="+precioTotal);//falta calculo del precio podriamos ingresar una funcion en la clase producto
        // para realizar el mismo

        int confirmacion = 0;//accion para ver si continuamos con una nueva factura
        System.out.println("Ingrese 0 si desea continuear con una nueva factura con los mismos datos, 1 si desea una " +
                "factura con datos diferentes, caso contrario para salir ingrese 2");

        switch (confirmacion){
            case 0: {
                Factura factu2 = new Factura()
                continue two;//envia a creacion de productos
            }
            case 1: {
                Cliente cliente2=new Cliente()
                continue one;//envia a ingreso de datos
            }
            default: {
                break;//sale del programa
            }
        }

    }
}

}