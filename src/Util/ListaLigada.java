package Util;

/**
 *
 * @author NetoSolis
 */
public class ListaLigada {
    //Creamos dos Nodos, que seran el primero y el ultimo nodo de nuestra lista
    private Node primero,ultimo;

    public Node getPrimero() {
        return primero;
    }

    public Node getUltimo() {
        return ultimo;
    }
    //Variable que llevara el tamaño de la lista
    private int tamaño;
    
    //Constructor. Inicializacion de las variables
    public ListaLigada(){
        ultimo = primero = null;
        tamaño = 0;
    }
    
    //Funcion que inserta un dato al principio de la lista, recibe como parametro el dato a insertar
    public void insertarPrimero(Object valor, int color){
        if(tamaño == 0){
            primero = new Node(valor);
            ultimo = primero;
            tamaño++;
        }
        else{
            Node temporal = primero;
            primero = new Node( valor);
            tamaño++;
        }
    }
    
    //Funcion que inserta un dato al final de la lista, recibe como parametro el dato a insertar
    public void insertarUltimo(Object valor){
        if(tamaño == 0){
            primero = new Node(valor);
            ultimo = primero;
            tamaño++;
        }
        else{
            Node temporal = ultimo;
            ultimo = new Node(valor);
            temporal.setNextElement(ultimo);
            tamaño++;
        }
    }
    
    //Funcion que elimina el primer nodo de la lista
    public void eliminarPrimero(){
        if(tamaño == 0)return;
        Node temporal = primero;
        temporal = primero.getNextElement();
        primero = null;
        primero = temporal;
        tamaño--;
    }
    
    //Funcion que elimmina el ultimo nodo de la lista
    public void eliminarUltimo(){
        if(tamaño == 0)return;
        if(tamaño == 1){
            ultimo = primero = null;
            tamaño = 0;
            return;
        }
        Node temporal = primero;
        while(temporal.getNextElement()!= ultimo){
            temporal = temporal.getNextElement();
        }
        temporal.setNextElement(null);
        ultimo = temporal;
        tamaño--;
    }
    
    //Funcion que regresa el tamaño de la lista... es decir el numero de elementos que contiene
    public int getTamaño(){
        return tamaño;
    }
    
    //Funcion que devuelve un array con los elementos de la lista
    public Object[] getElementos(){
        if(tamaño == 0)return new Object[0];
        Object[] elementos = new Object[tamaño];
        int i = 0;
        Node temporal = primero;
        while(temporal != null){
            System.out.print(temporal.getValue()+"  ");
            elementos[i++] = temporal.getValue();
            temporal = temporal.getNextElement();
        }
        System.out.println("");
        return elementos;
    }
    
 
    
}
