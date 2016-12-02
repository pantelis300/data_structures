package LinkedList;

public class LinkedListNode {

    private LinkedListNode next = null;
    private Object data;
    
    public LinkedListNode(Object data) {
        this.data = data;
    }
    
    public Object getData() {
        return this.data;
    }
    
    public void setData(Object data) {
        this.data = data;
    }
    
    public void setNext(LinkedListNode next) {
        this.next = next;
    }
    
    public LinkedListNode getNext() {
        return this.next;
    }
}
