
package Util;
public class Lista {
    private Node tail;
    private Node head;
 
    public void add(Object value) {
        Node node = new Node(value);
        if (tail == null && head == null) {
            tail = node;
            head = node;
        } else {
            tail.setNextElement(node);
            node.setPreviousElement(tail);
            tail = node;} }
    public void addFirst(Object value) {
        Node node = new Node(value);
        if (tail == null && head == null){
            tail = node;
            head = node;
        } else {
            node.setNextElement(head);
            head.setPreviousElement(node);
            head = node;} }
    public void print() {
        for (Node i = head; i != null; i = i.getNextElement()) {
            System.out.printf("\t %s ", i.toString());
        }
        System.out.println(); }

    public Node getTail() {
        return tail; }
    public Node getHead() {
        return head;
    }
    
    public Object get(int posicion) {
         int  contador = 1;
          System.out.println(posicion);
        for (Node i = head; i != null; i = i.getNextElement()) {
           if(contador==posicion){
            System.out.print(":(");
            return i.getValue();
            }
            contador++;
            System.out.print(contador);
        }
        return null;
    }
}