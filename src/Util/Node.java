
package Util;
public class Node {
    private Object value;
    private Node nextElement;
    private Node previousElement;
 
    public Node(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
    
    public Node getNextElement() {
        return nextElement;
    }
    public void setNextElement(Node nextElement) {
        this.nextElement = nextElement;
    }
    public Node getPreviousElement() {
        return previousElement;
    }
    public void setPreviousElement(Node previousElement) {
        this.previousElement = previousElement;
    }
 
    @Override
    public String toString() {
        return "Node [value=" + value + ", nextElement=" + ((nextElement != null) ? nextElement.getValue()
                : null) + ", previousElement=" +( (previousElement != null) ? previousElement.getValue() : null) + "]";
    }
 
}