/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Util.Lista;
import Vistas.formJuego;

/**
 *
 * @author viviana
 */
public class ClassTarjeta {
    private String nombre;
    ClassJugador memo;
       
   
    ClassJugador punto = new ClassJugador();
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
    
    //METODOS COMUNAL

    public static void honorariosMedicos(ClassJugador jugador){
       jugador.setPuntos(jugador.getPuntos()-50);
        formJuego.actualizarDinero();
    }
    
    public static void vencimientoVacacional(ClassJugador jugador){
       jugador.setPuntos(jugador.getPuntos()+100);
        formJuego.actualizarDinero();     
    }
    
    public static void colegiatura(ClassJugador jugador){
        jugador.setPuntos(jugador.getPuntos()-70);
        formJuego.actualizarDinero();
    }
    
    public static void cuentaHospital(ClassJugador jugador){
       jugador.setPuntos(jugador.getPuntos()-100);
        formJuego.actualizarDinero();    
    }
    
    public static void concurso(ClassJugador jugador){
       jugador.setPuntos(jugador.getPuntos()+10);
        formJuego.actualizarDinero();
    }
    //METODOS SUERTE

    public static void avanzarMuelle(){
        
    }
    
    public static void cumplimientoPrestamo(ClassJugador jugador){
       jugador.setPuntos(jugador.getPuntos()+150);
        formJuego.actualizarDinero();
    }
    
    public static void salirCarcel(){
        formJuego.jTextCarcel.setText("1");
    }
    
     public static void avanzarSalida(ClassJugador jugador){
        
    }
    
    public static void multaVelocidad(ClassJugador jugador){
       jugador.setPuntos(jugador.getPuntos()-15);
        formJuego.actualizarDinero();
    }
    
}
