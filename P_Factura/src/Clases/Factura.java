package Clases;

public class Factura {

    private static String RUC;
    private static String nomTienda;

    private static String numContacto;
    private int numFactura;
    private String autSRI;
    //private String fecha;
    private String direcTienda;
    private double subTotal;
    private double total;

    public Factura(int numF, String autSRI, double subTotal, double total){

        this.RUC = "1500958069001";
        this.nomTienda = "ECONOMY";
        this.numContacto = "0983307662";
        this.numFactura = numF;
        this.autSRI = autSRI;
        //this.fecha = fecha;
        this.direcTienda = "Av. 15 de noviembre";
        this. subTotal = subTotal;
        this.total = total;

    }

}
