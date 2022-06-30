package factura;

import java.util.Locale;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Factura {


    //Variables
    private String ruc;
    private String nomTienda;
    int numFactura=001; //Dato que segun ingresen compradores aumente
    private String autSRI;
    private String fecha;
    private String direccion;




    //Getters and Setters
    public String nomTienda() {
        return nomTienda;
    }

    public Factura setNomTienda(String nomTienda) {
        this.nomTienda = nomTienda;
        return this;
    }

    public String ruc() {
        return ruc;
    }

    public Factura setRuc(String ruc) {
        this.ruc = ruc;
        return this;
    }

    public int numFactura() {
        return numFactura;
    }

    public Factura setNumFactura(int numFactura) {
        this.numFactura = numFactura;
        return this;
    }

    public String autSRI() {
        return autSRI;
    }

    public Factura setAutSRI(String autSRI) {
        this.autSRI = autSRI;
        return this;
    }

    public String fecha() {
        LocalDate date = LocalDate.now();
        //LocalDate  = LocalDate.now();//For reference
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
        String fecha = date.format(formatter);
        return fecha;
    }

    public Factura setFecha(String fecha) {
        this.fecha = fecha;
        return this;
    }

    public String direccion() {
        return direccion;
    }

    public Factura setDireccion(String direccion) {
        this.direccion = direccion;
        return this;
    }


    //Funciones
    public void llenarDatosFactura() {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("\nIngrese los datos de la tienda adecuadamente");
        System.out.print("-Ingrese el RUC de la tienda: ");
        ruc = sc.nextLine();
        System.out.print("-Ingrese el nombre de la tienda: ");
        nomTienda = sc.nextLine();
        System.out.print("-Ingrese la autorización del SRI: ");
        autSRI=sc.nextLine();

        //Aqui usar funciones de Local.Date
        /*System.out.print("-Ingrese el nombre de la tienda: ");
        fecha=sc.nextLine();*/

        System.out.print("-Ingrese la direccion de la tienda: ");
        direccion=sc.nextLine();

    }

    public void imprimirEncabezado(){
        System.out.println("================================================================================================" );
        System.out.println("                                      FACTURA  #"+numFactura);
        System.out.println("================================================================================================" );
        System.out.println(nomTienda+"\n"+ruc+"\n"+autSRI+"\n"+direccion+"\n"+fecha());
        System.out.println("--------------------------------------------------------------------------------------------" );
    }
}
