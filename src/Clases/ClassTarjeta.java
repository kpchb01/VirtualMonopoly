/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author viviana
 */
public class ClassTarjeta {
    private String nombre;
    private String descrpcion;

    public ClassTarjeta() {
    }

    
    public ClassTarjeta(String nombre) {
        this.nombre = nombre;
 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescrpcion() {
        return descrpcion;
    }

    public void setDescrpcion(String descrpcion) {
        this.descrpcion = descrpcion;
    }
    
    
    
}
