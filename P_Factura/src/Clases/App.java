package Clases;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.LocalDate;



public class App {
    public static void main(String[] args) {
        LocalDate fecha = LocalDate.now();
        Scanner sc = new Scanner(System.in);
        int nuevaFactura = 1;
        int cantidadProdcutos=0; // crear mas espacaio de memoria para almacenar más productos
        int opt=1; // Si desea agregar mas productos
        boolean[] opciones = {false, true};

        boolean seguir;


        while(nuevaFactura == 1){
            //Producto productos [] = new Producto[cantidadProdcutos];
            //Producto.hola();
            System.out.println("\t\tFACTURA");
            System.out.println("Fecha: "+fecha);

            seguir=true;

            while (seguir==true){

                try {

                    System.out.println("0 para cerrar factura ");
                    System.out.println("1 para ingresar nuevo producto ");
                    System.out.print("Opcion: ");
                    opt = sc.nextInt();
                    seguir=opciones[opt];
                    cantidadProdcutos++;
                    System.out.println("Correcto");
                    Producto.llenar(opt, cantidadProdcutos);

                    break;
                } catch (InputMismatchException ex){
                    sc.nextLine();
                    System.out.println("Error");
                } catch (IndexOutOfBoundsException exception){
                    sc.nextLine();
                    System.out.println("Error");
                }

            }
            Producto.mostrar(cantidadProdcutos);
            //nuevaFactura = opt;


        }

    }
}
