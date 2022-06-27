package factura;

import java.util.Scanner;
public class Cliente {

    String id;

    String nombre;
    String direccion;
    String numCel;
    String email;




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

}

