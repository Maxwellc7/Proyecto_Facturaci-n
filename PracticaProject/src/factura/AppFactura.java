package factura;

import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException;

public class AppFactura {


    //funcion para preguntar la cantidad de productos y determinar si los valore singresados son aceptados y no salte un error
    public static int cantidadProductos(){
        int numProd=0;
        int[] opciones = {1, 2, 3, 4, 5};
        boolean seguir;
        Scanner sc = new Scanner(System.in);

        seguir = true;
        while (seguir == true){
            try {
                System.out.println("¿Cuantos productos va a comprar? El limite maximo por factura es 5 items.");//genera nuevo factura
                numProd = sc.nextInt();
                numProd-=1;
                numProd = opciones[numProd];
                seguir = false;
            } catch (InputMismatchException ex){
                sc.nextLine();
                System.out.println("La opción ingresada no es aceptada letras");// si tiene caracterres salta el error
            } catch (IndexOutOfBoundsException exception){
                sc.nextLine();
                System.out.println("La opción ingresada no es aceptada rango");// si no esta en el rango definido salta error
            }
        }
        return numProd;
    }
    //Funcion para determinar si continua facturando y determinar si los valore singresados son aceptados y no salte un error
    public static int continuarOPararFactura(){
        int[] opciones = {0, 1, 2};
        boolean seguir;
        int conf1 = 0;
        Scanner sc = new Scanner(System.in);

        seguir = true;
        while (seguir == true){
            try {
                System.out.println("¿Desea agregar otra factura?");//genera nuevo factura
                System.out.println("0 para nueva factura con diferentes datos del cliente");
                System.out.println("1 para nueva factura con los mismos datos del cleinte");
                System.out.println("2 cerrar facturero");
                System.out.println(" Ingrese su opción: ");
                conf1 = sc.nextInt();
                conf1 = opciones[conf1];
                seguir = false;
            } catch (InputMismatchException ex){
                sc.nextLine();
                System.out.println("La opción ingresada no es aceptada letras");// si tiene caracterres salta el error
            } catch (IndexOutOfBoundsException exception){
                sc.nextLine();
                System.out.println("La opción ingresada no es aceptada rango");// si no esta en el rango definido salta error
            }
        }
        return conf1;
    }


    public static void main(String[] args) {

        int conf2=0; // variable para capturar la opcion de sii continuar la factura

        double precioTotal=0;

        System.out.println("_________________________________________________________" );
        System.out.println("Bienvenido a DigitalMK,ingrese la siguiente informacion: ");
        System.out.println("_________________________________________________________\n" );

        Factura factu=new Factura(); // creacion del objeto de la clase Factura
        factu.llenarDatosFactura(); // Metodo de la clase Factura para capturar los datos del establecimiento en el encabezado
        Scanner sc=new Scanner(System.in);
        sc.useLocale(Locale.US);

        Cliente cliente = new Cliente(); // Creacion del objeto de la clase Cliente
        one: // etiqueta para el inicio del ingreso de datos y productos
        do{

            System.out.println("\n----------------------------------------------------------------" );

            // Condición para determinar si  se usan los mismos datos del cliente o se ingresan los datos de un nuevo cliente
            if(conf2==0){
                cliente.ingresarDatos();
            }

            System.out.println("----------------------------------------------------------------\n" );
            System.out.println("Ahora ,realize su compra :D:");
            int numProd=0;

            //llama a la función cantidadProductos
            numProd=cantidadProductos();

            //Creación de todos los objetos disponibles
            Producto prod1=new Producto();
            Producto prod2=new Producto();
            Producto prod3=new Producto();
            Producto prod4=new Producto();
            Producto prod5=new Producto();


            // Estructura que permite definir cuantos prodductos se van a crear;
            switch(numProd){
                case (1):

                    // se llaman a los metodos
                    prod1.llenarProductos();
                    prod1.calcularIva();
                    prod1.valorProductos();

                    System.out.println("Su factura se imprimira,ahora:\n");
                    factu.imprimirEncabezado();
                    cliente.imprimirDatosCliente();
                    prod1.imprimirProduc();
                    System.out.println("--------------------------------------------------------------------------------------------" );
                    precioTotal=prod1.precioFinal;
                    precioTotal=Math.round(precioTotal*100.0)/100.0;
                    System.out.println("TOTAL                                                                            "+precioTotal);
                    System.out.println("================================================================================================" );
                    System.out.println("================================================================================================" );

                    break;
                case (2):
                    // se llaman a los metodos
                    prod1.llenarProductos();
                    prod1.calcularIva();
                    prod1.valorProductos();
                    prod2.llenarProductos();
                    prod2.calcularIva();
                    prod2.valorProductos();

                    System.out.println("Su factura se imprimira,ahora:\n");
                    factu.imprimirEncabezado();
                    cliente.imprimirDatosCliente();
                    prod1.imprimirProduc();
                    prod2.imprimirProduc();
                    System.out.println("--------------------------------------------------------------------------------------------" );
                    precioTotal=prod1.precioFinal+prod2.precioFinal;
                    precioTotal=Math.round(precioTotal*100.0)/100.0;
                    System.out.println("TOTAL                                                                            "+precioTotal);
                    System.out.println("================================================================================================" );
                    System.out.println("================================================================================================" );

                    break;
                case (3):
                    // se llaman a los metodos
                    prod1.llenarProductos();
                    prod1.calcularIva();
                    prod1.valorProductos();
                    prod2.llenarProductos();
                    prod2.calcularIva();
                    prod2.valorProductos();
                    prod3.llenarProductos();
                    prod3.calcularIva();
                    prod3.valorProductos();

                    System.out.println("Su factura se imprimira,ahora:\n");
                    factu.imprimirEncabezado();
                    cliente.imprimirDatosCliente();
                    prod1.imprimirProduc();
                    prod2.imprimirProduc();
                    prod3.imprimirProduc();
                    System.out.println("--------------------------------------------------------------------------------------------" );
                    precioTotal=prod1.precioFinal+prod2.precioFinal+prod3.precioFinal;
                    precioTotal=Math.round(precioTotal*100.0)/100.0;
                    System.out.println("TOTAL                                                                            "+precioTotal);
                    System.out.println("================================================================================================" );
                    System.out.println("================================================================================================" );
                    break;
                case (4):
                    // se llaman a los metodos
                    prod1.llenarProductos();
                    prod1.calcularIva();
                    prod1.valorProductos();
                    prod2.llenarProductos();
                    prod2.calcularIva();
                    prod2.valorProductos();
                    prod3.llenarProductos();
                    prod3.calcularIva();
                    prod3.valorProductos();
                    prod4.llenarProductos();
                    prod4.calcularIva();
                    prod4.valorProductos();

                    System.out.println("Su factura se imprimira,ahora:\n");
                    factu.imprimirEncabezado();
                    cliente.imprimirDatosCliente();
                    prod1.imprimirProduc();
                    prod2.imprimirProduc();
                    prod3.imprimirProduc();
                    prod4.imprimirProduc();
                    System.out.println("--------------------------------------------------------------------------------------------" );
                    precioTotal=prod1.precioFinal+prod2.precioFinal+prod3.precioFinal+prod4.precioFinal;
                    precioTotal=Math.round(precioTotal*100.0)/100.0;
                    System.out.println("TOTAL                                                                            "+precioTotal);
                    System.out.println("================================================================================================" );
                    System.out.println("================================================================================================" );
                    break;
                case (5):
                    // se llaman a los metodos
                    prod1.llenarProductos();
                    prod1.calcularIva();
                    prod1.valorProductos();
                    prod2.llenarProductos();
                    prod2.calcularIva();
                    prod2.valorProductos();
                    prod3.llenarProductos();
                    prod3.calcularIva();
                    prod3.valorProductos();
                    prod4.llenarProductos();
                    prod4.calcularIva();
                    prod4.valorProductos();
                    prod5.llenarProductos();
                    prod5.calcularIva();
                    prod5.valorProductos();

                    System.out.println("Su factura se imprimira,ahora:\n");
                    factu.imprimirEncabezado();
                    cliente.imprimirDatosCliente();
                    prod1.imprimirProduc();
                    prod2.imprimirProduc();
                    prod3.imprimirProduc();
                    prod4.imprimirProduc();
                    prod5.imprimirProduc();
                    System.out.println("--------------------------------------------------------------------------------------------" );
                    precioTotal=prod1.precioFinal+prod2.precioFinal+prod3.precioFinal+prod4.precioFinal+prod5.precioFinal;
                    precioTotal=Math.round(precioTotal*100.0)/100.0;
                    System.out.println("TOTAL                                                                            "+precioTotal);
                    System.out.println("================================================================================================" );
                    System.out.println("================================================================================================" );
                    break;
                default:
                    System.out.println("El valor ingresado no es valido,ingrese correctamente");
            }

            // la varible captura la opción tras confirmar que la opción es valida
            conf2 = continuarOPararFactura();

            // Determina si se debe crear una nueva factura y si la variable conf2 = 2 se cierra la facturación
            if(conf2 == 0 || conf2 == 1){
                factu.numFactura++;
                continue one;
            }

        }while(conf2!=2);

    }
}
