
package Clases;

import Util.Lista;
import Vistas.formJuego;
import java.awt.Color;
import javax.swing.JPanel;


public class ClassJugador {
    
    private Integer posicion;
    private Color color;
    private String nombre;
    private Integer tiro = 0;

    public ClassJugador() {
    }

    public ClassJugador(Integer posicion, Color color, String nombre) {
        this.posicion = posicion;
        this.color = color;
        this.nombre = nombre;
    }
  
    public Integer getPosicion() {
        return posicion;
    }

    public void setPosicion(Integer posicion) {
        this.posicion = this.posicion + posicion;
        if(this.posicion>40)this.posicion=this.posicion-40;
      
    }
    
    public void avanzar (Lista casillas){
      ClassDados dados = new ClassDados();
      
      if(this.getPosicion()>-1){
            JPanel panel = (JPanel) casillas.get(this.getPosicion());
            panel.setBackground(new java.awt.Color(220,245,245));
        }

        int valorDado1 = (int)(Math.random()*6)+1;
        int valorDado2 = (int)(Math.random()*6)+1;
        int sumaDados = dados.SumaDados(valorDado1, valorDado2);
        this.setPosicion(sumaDados);
        formJuego.resultadoDado1.setIcon(dados.pngDado(valorDado1));
        formJuego.resultadoDado2.setIcon(dados.pngDado(valorDado2));
        JPanel panel = (JPanel) casillas.get(this.getPosicion());
        panel.setBackground(this.getColor());
       
    }
    
    public int tirarDado (){
        ClassDados dados = new ClassDados();
        int valorDado1 = (int)(Math.random()*6)+1;
        int valorDado2 = (int)(Math.random()+6)+1;
        int sumaDados = dados.SumaDados(valorDado1, valorDado2);
        this.setPosicion(sumaDados);
        this.tiro=sumaDados;
        return sumaDados;
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

    public Integer getTiro() {
        return tiro;
    }

    public void setTiro(Integer tiro) {
        this.tiro = tiro;
    }
    
    
    
}
