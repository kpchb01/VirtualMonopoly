package Clases;

import javax.swing.ImageIcon;

public class ClassDados {
    private int dado1=0;
    private int dado2=0;
    private int sumaDados=0;
    
    public int SumaDados(int dado1, int dado2){
        sumaDados=dado1+dado2;
        return sumaDados;
    }
    
    public boolean Iguales(int dado1, int dado2){
        if(dado1==dado2)return true;
        else return false;
    }
    
    public int GeneraPrimer(){
      dado1 = (int)(Math.random()*6)+1;
      return dado1;
    }
    
    public int GeneraSecun(){
      dado2 = (int)(Math.random()*6)+1;
      return dado2;
    }
    
    public ImageIcon icoImagen;
    
    public ImageIcon gifDado1(){
        icoImagen = new ImageIcon("C:\\Users\\kpchb\\Desktop\\workSpace\\VirtualMonopoly\\VirtualMonopoly\\src\\IMG\\dados-01.gif");
        return icoImagen;
    }
    public ImageIcon gifDado2(){
        icoImagen = new ImageIcon("C:\\Users\\kpchb\\Desktop\\workSpace\\VirtualMonopoly\\VirtualMonopoly\\src\\IMG\\dados-02.gif");
        return icoImagen;
    }
    
    public ImageIcon pngDado(int Dado){
        switch(Dado){
            case 1: 
                icoImagen = new ImageIcon("C:\\Users\\kpchb\\Desktop\\workSpace\\VirtualMonopoly\\VirtualMonopoly\\src\\IMG\\d1.png");
                break;
            case 2:
                icoImagen = new ImageIcon("C:\\Users\\kpchb\\Desktop\\workSpace\\VirtualMonopoly\\VirtualMonopoly\\src\\IMG\\d2.png");
                break;
            case 3:
                icoImagen = new ImageIcon("C:\\Users\\kpchb\\Desktop\\workSpace\\VirtualMonopoly\\VirtualMonopoly\\src\\IMG\\d3.png");
                break;
            case 4:
                icoImagen = new ImageIcon("C:\\Users\\kpchb\\Desktop\\workSpace\\VirtualMonopoly\\VirtualMonopoly\\src\\IMG\\d4.png");
                break;
            case 5:
                icoImagen = new ImageIcon("C:\\Users\\kpchb\\Desktop\\workSpace\\VirtualMonopoly\\VirtualMonopoly\\src\\IMG\\d5.png");
                break;
            case 6:
                icoImagen = new ImageIcon("C:\\Users\\kpchb\\Desktop\\workSpace\\VirtualMonopoly\\VirtualMonopoly\\src\\IMG\\d6.png");
                break;
        }
        return icoImagen;
}
}