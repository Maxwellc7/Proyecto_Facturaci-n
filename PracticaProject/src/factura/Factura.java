package factura;

public class Factura {

    String ruc;
    static String nomTienda;
    int numFactura;
    String autSRI;
    String fecha;
    String direccion;

    Producto nombre;
    Producto precioFinal;

    double precioApagar;

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



    public boolean verificar1(){
        if (this.numFactura ==0){
            return true;
        }
        else{
            return false;
        }
    }
}
