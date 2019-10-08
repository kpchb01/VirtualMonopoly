
package Clases;

import java.awt.Color;

public class ClassCasilla {
    private Integer posicion;
    private Color color;
    private String nombre;
    private String precioCompra;
    private String renta;

    public ClassCasilla() {
    }

    public ClassCasilla(Integer posicion, Color color, String nombre) {
        this.posicion = posicion;
        this.color = color;
        this.nombre = nombre;
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
    
    
}
