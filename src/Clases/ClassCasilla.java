
package Clases;

import java.awt.Color;

public class ClassCasilla {
    private ClassJugador Dueno;
    private Integer posicion;
    private Color color;
    private String nombre;
    private int precioCompra;
    private int renta;
    private int rentaGrupo;
    private int renta1casa;
    private int renta2casas;
    private int renta3casas;
    private int renta4casas;
    private int rentaConHotel;
    private int costoCasa;
    private int costoHotel;
   

    public ClassCasilla() {
    }

    public ClassCasilla(ClassJugador Dueno, Integer posicion, Color color, String nombre, int precioCompra, int renta, int rentaGrupo, int renta1casa, int renta2casas, int renta3casas, int renta4casas, int rentaConHotel, int costoCasa, int costoHotel) {
        this.Dueno = Dueno;
        this.posicion = posicion;
        this.color = color;
        this.nombre = nombre;
        this.precioCompra = precioCompra;
        this.renta = renta;
        this.rentaGrupo = rentaGrupo;
        this.renta1casa = renta1casa;
        this.renta2casas = renta2casas;
        this.renta3casas = renta3casas;
        this.renta4casas = renta4casas;
        this.rentaConHotel = rentaConHotel;
        this.costoCasa = costoCasa;
        this.costoHotel = costoHotel;
    }

    

    

    public Integer getPosicion() {
        return posicion;
    }

    public void setPosicion(Integer posicion) {
        this.posicion = posicion;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }

    public int getRenta() {
        return renta;
    }

    public void setRenta(int renta) {
        this.renta = renta;
    }

 

    public int getRentaGrupo() {
        return rentaGrupo;
    }

    public void setRentaGrupo(int rentaGrupo) {
        this.rentaGrupo = rentaGrupo;
    }

    public int getRenta1casa() {
        return renta1casa;
    }

    public void setRenta1casa(int renta1casa) {
        this.renta1casa = renta1casa;
    }

    public int getRenta2casas() {
        return renta2casas;
    }

    public void setRenta2casas(int renta2casas) {
        this.renta2casas = renta2casas;
    }

    public int getRenta3casas() {
        return renta3casas;
    }

    public void setRenta3casas(int renta3casas) {
        this.renta3casas = renta3casas;
    }

    public int getRenta4casas() {
        return renta4casas;
    }

    public void setRenta4casas(int renta4casas) {
        this.renta4casas = renta4casas;
    }

    public int getRentaConHotel() {
        return rentaConHotel;
    }

    public void setRentaConHotel(int rentaConHotel) {
        this.rentaConHotel = rentaConHotel;
    }

    public int getCostoCasa() {
        return costoCasa;
    }

    public void setCostoCasa(int costoCasa) {
        this.costoCasa = costoCasa;
    }

    public int getCostoHotel() {
        return costoHotel;
    }

    public void setCostoHotel(int costoHotel) {
        this.costoHotel = costoHotel;
    }

    public ClassJugador getDueno() {
        return Dueno;
    }

    public void setDueno(ClassJugador Dueno) {
        this.Dueno = Dueno;
    }
    
    
}
