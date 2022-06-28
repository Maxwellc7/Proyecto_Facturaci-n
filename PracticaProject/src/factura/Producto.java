package factura;

import java.util.Scanner;
import java.util.Locale;

public class Producto {

    //Variables
    String nombre;
    double valorUni;
    int cantidad;
    double iva;
    double precioFinal;

    //Getters and Setters
    public String nombre() {
        return nombre;
    }

    public Producto setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public double valorUni() {
        return valorUni;
    }

    public Producto setValorUni(double valorUni) {
        this.valorUni = valorUni;
        return this;
    }

    public int cantidad() {
        return cantidad;
    }

    public Producto setCantidad(int cantidad) {
        this.cantidad = cantidad;
        return this;
    }

    public double iva() {
        return iva;
    }

    public Producto setIva(double iva) {
        this.iva = iva;
        return this;
    }

    public double precioFinal() {
        return precioFinal;
    }

    public Producto setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
        return this;
    }

    //Funciones

    public void llenarProductos(){
        Scanner sc=new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("\nSi el producto posee IVA agregar el caracter '*' al principio del nombre ");
        System.out.println("Ingrese el nombre del producto: ");
        nombre=sc.nextLine();
        System.out.println("Ingrese el precio del producto:");
        valorUni=sc.nextDouble();
        System.out.println("Ingrese la cantidad de productos identicos a llevar: ");
        cantidad=sc.nextInt();
    }

    public double calcularIva(){
        if(nombre().contains("*")){
            iva = 0.12 * cantidad * valorUni;
            iva=Math.round(iva*100.0)/100.0;
            return iva;
        }
        else{
            iva = 0;
            return 0;
        }

    }

    public Double valorProductos() {
        precioFinal = (valorUni * cantidad) + iva;
        precioFinal=Math.round(precioFinal*100.0)/100.0;
        return precioFinal;
    }

    public void imprimirProduc(){
        System.out.println(nombre+"\t\t\t\t"+cantidad+"\t\t\t\t\t"+valorUni+"\t\t\t\t"+iva+"\t\t\t"+precioFinal);
    }

}
