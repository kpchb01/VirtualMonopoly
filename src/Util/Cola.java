/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Util;

import java.util.ArrayList;
import javax.swing.JTextArea;

/**
 *
 * @author dev-
 */
public class Cola {
    private ListaLigada cola;
    
    public Cola(){
        cola = new ListaLigada();
    }
    
    public void encolar(Object dato){
        cola.insertarUltimo(dato);
    }
    
    public Object desencolar(){
        Object dato = cola.getElementos()[0];
        cola.eliminarPrimero();
        return dato;
    }
    
    public Object frente(){
        return cola.getElementos()[0];
    }
    
    public int size(){
        return cola.getTamaño();
    }
    
    public Object[] getElementos(){
        return cola.getElementos();
    }
    
   

    
     public void listar(JTextArea txtArea) {
        // Crea una copia de la pila.
        Node aux = cola.getPrimero();
        String impresion = "";
        // Recorre la pila hasta el ultimo nodo.
        while (aux != null) {
            impresion += ("|\t" + aux.getValue() + "\t| \n");
            impresion += ("----------------------------- \n");
            aux = aux.getNextElement();
        }
        txtArea.setText(impresion);
    }
   
}
