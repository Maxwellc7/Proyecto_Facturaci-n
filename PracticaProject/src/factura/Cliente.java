package factura;

import java.util.Scanner;
import java.util.Locale;

public class Cliente {

    //variables
    private String id;
    private  String nombre;
    private String direccion;
    private String numCel;
    private String email;


    //Constructor por parametros

    public Cliente(){
    }

    //Getters and Setters

    public String id() {
        return id;
    }

    public Cliente setId(String id) {
        this.id = id;
        return this;
    }

    public String nombre() {
        return nombre;
    }

    public Cliente setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String direccion() {
        return direccion;
    }

    public Cliente setDireccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public String numCel() {
        return numCel;
    }

    public Cliente setNumCel(String numCel) {
        this.numCel = numCel;
        return this;
    }

    public String email() {
        return email;
    }

    public Cliente setEmail(String email) {
        this.email = email;
        return this;
    }

    //Funciones
    public void ingresarDatos(){
        Scanner sc=new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.print("-Ingrese el RUC/CI del cliente:");
        id=sc.nextLine();
        System.out.print("-Ingrese el nombre del cliente:");
        nombre=sc.nextLine();
        System.out.print("-Ingrese la direccion del cliente:");
        direccion=sc.nextLine();
        System.out.print("-Ingrese el numero de celular del cliente:");
        numCel=sc.nextLine();
        System.out.print("-Ingrese el email del cliente:");
        email=sc.nextLine();

    }

    public void imprimirDatosCliente(){
        System.out.println("NOMBRE DEL CLIENTE:"+nombre+"\nCI/RUC:"+id+"\nDIRECCION:"+direccion+"\nNUMERO DE CONTACTO:"
                +numCel+"\nCORREO ELECTRONICO:"+email);
        System.out.println("--------------------------------------------------------------------------------------------" );
        System.out.println("NOMBRE\t\t\t\tCANTIDAD\t\t\tPRECIO UNITARIO\t\t\tIVA\t\t\tPRECIO FINAL");
    }

}

