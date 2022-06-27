package Clases;
import java.util.Scanner;

public class Producto {
    public static void hola(){
        System.out.println("Hola ");
    }
    public static void llenar(int detener, int cantidadProductos){
        String descripcion[] = new String[cantidadProductos];
        double valor[] = new double[cantidadProductos];
        int cantidad[] = new  int[cantidadProductos];
        double iva[] = new double[cantidadProductos];
        int i=0;
        Scanner sc=new Scanner(System.in);
        if(detener==1){
            /*for(int i=0;i<cantidadProductos;i++){

                System.out.println("Ingrese la descripcion: ");
                descripcion[i] = sc.next();
                System.out.println("Ingres el precio: ");
                valor[i] = sc.nextDouble();
                System.out.println("Ingrese la cantidad: ");
                cantidad[i] = sc.nextInt();

                if(descripcion[i].contains("*")){
                    iva[i] = 1.12 * valor[i];
                }
                else{
                    iva[i] = 0;
                }
                sc.nextLine();
            }*/
            System.out.println("Ingrese la descripcion: ");
            descripcion[i] = sc.next();
            System.out.println("Ingres el precio: ");
            valor[i] = sc.nextDouble();
            System.out.println("Ingrese la cantidad: ");
            cantidad[i] = sc.nextInt();

            if(descripcion[i].contains("*")){
                iva[i] = 1.12 * valor[i];
            }
            else{
                iva[i] = 0;
            }
            sc.nextLine();
            i++;
        }else{
            System.out.println("Cerrar");
        }

    }



    public static void mostrar(int cantidadProductos){
        String descripcion[] = new String[cantidadProductos];
        double valor[] = new double[cantidadProductos];
        int cantidad[] = new  int[cantidadProductos];
        double iva[] = new double[cantidadProductos];
        double total[] = new double[cantidadProductos];

        int i;

        System.out.println("Descripción\tPrecio\tCantidad\tTotal");
        for(i=0;i<=cantidadProductos;i++){
            total[i]=cantidad[i]*valor[i];
            System.out.println(descripcion[i]+"\t\t"+valor[i]+"\t\t"+cantidad[i]+"\t\t"+total[i]);

        }
    }

/**/

}
