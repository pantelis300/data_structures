package LinkedList;

import java.util.Iterator;

public class LinkedList {
    private LinkedListNode head = null;
    private LinkedListNode tail = null;
    private int size = 0;

    public LinkedListNode getTail() {
        return tail;
    }

    public void setTail(LinkedListNode tail) {
        this.tail = tail;
    }

    public LinkedListNode getHead() {
        return head;
    }

    public void setHead(LinkedListNode head) {
        this.head = head;
    }
    
    public void setTailNext(LinkedListNode n) {
        this.tail.setNext(n);
    }

    public int getSize() {
        return size;
    }
    
    void setSize(int size) {
        this.size = size;
    }

    public LinkedList() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }
    
    public LinkedList(LinkedList linkedList) {

        this.head = linkedList.getHead();
        this.tail = linkedList.getTail();
        this.size = linkedList.getSize();
    }
    
    public void concatenateLinkedLists(LinkedList l) {     
        if (l.getHead() == null) {
        }
        else {
            this.tail.setNext(l.getHead());
            this.size += l.getSize();
            this.tail = l.getTail();
        }
    }
    
    public void append(Object data) {
        if (tail == null) {     // The list is empty
            head = new LinkedListNode(data);
            tail = head;
        }
        else
        {
            tail.setNext(new LinkedListNode(data));
            tail = tail.getNext();
        }
        size++;
    }
    
    public String toString() {
        LinkedListNode n = this.getHead();
        
        StringBuilder sb = new StringBuilder("[");
        while (n.getNext() != null) {
            sb.append(n.getData().toString()).append(", ");
            n = n.getNext();
        }
        sb.append(n.getData().toString()).append("]");
        return sb.toString();
    }
    
    public Iterator createIterator() {
        return new LinkedListIterator(this);
    }
}
