package factura;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AppFactura {

    public static void main(String[] args) {

        boolean[] opciones = {false, true};
        boolean seguir = true;

        int num=50;
        int conf;
        int numClientes=100;
        int conf2=0;
        double precio=0;

        one:
            for(int i=0;i<numClientes;i++){ //bucle para generar facturas

                System.out.println("==============================================================" );
                System.out.println("Bienvenido a DigitalMK,ingrese la siguiente informacion: ");
                Factura factu=new Factura();

                Scanner sc=new Scanner(System.in);
                sc.useLocale(Locale.US);
                Cliente cliente=new Cliente();
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


                two: //Bucle para ingresar productos
                for(int j = 0; j < num; j++) {
                        Producto prod=new Producto();

                        // ISSAC: SALI A TROTAR XD VUELVO EN 1 HORA O MAS
                        /*NICOLE: xd,por cierto me di cuenta que mejor queda en recolectar los datos de cliente y producto en 
                        cada clase,perdón :c me llegó la iluminación para programar,los cambios estarán en mi rama incluidos estos de Issac*/
                        

                        System.out.println("Realice su compra");

                        System.out.println("Si el producto posee IVA agregar el caracter '*' ");
                        System.out.println("Ingrese el nombre del producto: ");
                        prod.nombre=sc.nextLine();

                        System.out.println("Ingrese el precio del producto: ");
                        prod.valorUni=sc.nextDouble();

                        System.out.println("Ingrese cuantos productos llevara de esta especie: ");
                        prod.cantidad=sc.nextInt();

                        /*
                        *
                        * */

                        if(prod.nombre().contains("*")){
                            prod.iva = 0.12 * prod.cantidad * prod.valorUni;
                        }
                        else{
                            prod.iva = 0;
                        }

                        //prod.calcularIva(prod.valorUni);
                        precio+=prod.valorProductos(prod.cantidad,prod.valorUni, prod.iva, prod.precioFinal);


                        //confirmacion para generar otra factura o un nuevo producto
                        //System.out.println("¿Desea agregar otro producto? Ingrese 0 para comprar otro producto,1 para concluir la compra");//genera nuevo producto

                    seguir = true;
                    while (seguir == true){

                        try {
                            System.out.println("¿Desea agregar otro producto? Ingrese 0 para comprar otro producto,1 para concluir la compra");//genera nuevo producto
                            conf= sc.nextInt();
                            if(conf==0){
                                seguir = false;
                                sc.nextLine();
                                continue two;
                            }
                            if(conf==1){//genera una nueva factura
                                System.out.println("Gracias por su compra,se le presentara su factura");
                                System.out.println("==============================================================");
                                System.out.println("Precio Final ="+precio);
                                seguir = false;
                                continue one;
                            }
                            seguir=opciones[conf];
                            break;
                        } catch (InputMismatchException ex){
                            sc.nextLine();
                            System.out.println("Error");// si tiene caracterres salta el error
                        } catch (IndexOutOfBoundsException exception){
                            sc.nextLine();
                            System.out.println("Error");// si no esta en el rango definido salta error
                        }

                    }


                    /*try {
                            System.out.println("¿Desea agregar otro producto? Ingrese 0 para comprar otro producto,1 para concluir la compra");//genera nuevo producto
                            conf= sc.nextInt();
                            if(conf==0){
                            continue two;
                            }
                            if(conf==1){//genera una nueva factura
                                System.out.println("Gracias por su compra,se le presentara su factura");
                                System.out.println("==============================================================");
                                System.out.println("Precio Final ="+precio);
                                continue one;
                            }

                        } catch (Exception ex){
                            sc.nextLine();
                            System.out.println("Error");// si tiene caracterres salta el error
                        } catch (Ex exception){
                            sc.nextLine();
                            System.out.println("Error");// si no esta en el rango definido salta error
                        }*/

                }
                System.out.println("¿Concluyó la venta de hoy?");

            }
    }

}

