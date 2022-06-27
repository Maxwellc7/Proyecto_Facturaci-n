package factura;

import java.util.Scanner;

public class Producto {

    String nombre;
    double valorUni;
    int cantidad;

    //String conf;
    double iva;

    double precioFinal;

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

    public double iva(){return iva;}
    public  Producto setIva(double iva){
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

    public double calcularIva(double valorUni){
        String conf;
        System.out.println("¿El producto tiene IVA?");
        Scanner sc=new Scanner(System.in);

        double iva2=0;

        conf=sc.nextLine();
        if(conf=="SI"){

            iva2=valorUni*0.12;
            valorUni=iva2+valorUni;
            return iva2;
        }
        else{
            return iva2=0;
        }
    }

    public Double valorProductos(int cantidad,double valorUni, double iva,double precioFinal) {
        precioFinal = (valorUni * cantidad) + iva;
        return precioFinal;
    }
}
