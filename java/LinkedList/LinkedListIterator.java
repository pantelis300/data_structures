package LinkedList;

import java.util.Iterator;

public class LinkedListIterator implements Iterator {
    LinkedList linkedList;
    LinkedListNode position = null;
    
    public LinkedListIterator(LinkedList linkedList) {
        this.linkedList = linkedList;
        this.position = linkedList.getHead();
    }
    
    public boolean hasNext() {
        return position.getNext() != null;
    }

    public Object next() {
        LinkedListNode n = position;
        position = position.getNext();
        return n;
    }
    
    public void remove() {
        // Find the node just before the node "position"
        LinkedListNode n = linkedList.getHead();
        while (n.getNext() != position) {
            n = n.getNext();
        }
        // Link the node before position with the one after position
        n.setNext(position.getNext());
        linkedList.setSize(linkedList.getSize() - 1);
    }
}
