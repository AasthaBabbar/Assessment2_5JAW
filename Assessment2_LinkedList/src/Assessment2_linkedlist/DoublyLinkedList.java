/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assessment2_linkedlist;

/**
 *
 * @author Aastha Babbar
 */
/**
 * Doubly linked list class
 * @param <T> generic list
 */
public class DoublyLinkedList<T> {
    DoublyNode<T> head;
    DoublyNode<T> tail;
    int count;

    /**
     * getter for head
     * @return head node
     */
    public DoublyNode<T> getHead() {
        return head;
    }

    /**
     * setter for header
     * @param head node to be set
     */
    public void setHead(DoublyNode<T> head) {
        this.head = head;
    }

    /**
     * getter for tail
     * @return tail node
     */
    public DoublyNode<T> getTail() {
        return tail;
    }

    /**
     * setter for tail
     * @param tail node to be set
     */
    public void setTail(DoublyNode<T> tail) {
        this.tail = tail;
    }

    /**
     * getter for count
     * @return number of nodes
     */
    public int getCount() {
        return count;
    }

    /**
     * insert item at the start
     * @param item item to be inserted
     */
    public void insertStart(T item){
        insertStart(new DoublyNode<>(item));
    }    
    
    /**
     * insert node at the start
     * @param node node to be inserted
     */
    public void insertStart(DoublyNode<T> node){
        if (head == null){
            head = node;
            tail = node;
            
        }
        else{
        DoublyNode<T> temp = this.head;
        temp.previous = node;
        node.previous = null;
        node.next = temp;
        head = node;
        }
        System.out.println("Node is added at start");
        count++;
    }
    
    /**
     * insert at the last of the list
     * @param item to be inserted
     */
    public void insertLast(T item){
        insertLast(new DoublyNode<>(item));
    }
    
    /**
     * insert at the last of the list
     * @param node to be inserted
     */
    public void insertLast(DoublyNode<T> node){
        if (tail == null){
            head = node;
            tail = node;
            
        }
        else{
        DoublyNode<T> temp = tail;
        temp.next = node;
        node.previous = temp;
        tail = node;
        }
        System.out.println("Node is added at last");
        count++;
    }
    
    /**
     * removes first item from the list
     */
    public void removeFirst(){
        if(count == 0)
            return;
        else if (count == 1){
            head = null;
            tail = null;
            
        }
        else{
            head = head.next;
            head.previous = null;
            
        }
        count--;
        System.out.println("First Node is removed");
    }
    
    /**
     * removes last item from the list
     */
    public void removeLast(){
        if(tail == null){
            head = null;
            tail = null;
            return;
        }
        else if (count == 1){
            head = null;
            tail = null;
            
        }
        else{
            tail = tail.previous;
            tail.next = null;
            
        }
        count--;
        System.out.println("Last Node is removed");
    }
    
    /**
     * removes particular item from the list
     * @param item to be removed
     * @return true if deleted else false
     */
    public boolean remove(T item){
        DoublyNode<T> current = head;
        DoublyNode<T> previous = null;
        while(current != null){
            if(current.value.equals(item)){
                if(previous != null){
                    previous.next = current.next;
                    if(current.next == null){
                        tail = previous;
                    }
                    else
                        current.next.previous = previous;
                    count--;
                }
                else
                    removeFirst();
                System.out.println("Node is removed");
                return true;
            }
            previous = current;
            current = current.next;
        }
        return false;
    }
    
    /**
     * insert particular item at the given position
     * @param item item to be inserted
     * @param position position after which node is t be inserted
     */
    public void insert(T item, int position){
        DoublyNode<T> current = head;
        DoublyNode<T> node = new DoublyNode<>(item);
        int num = 0;
        if(count <= position)
            System.out.println("Please check the position. There are not enough items in list.");
        else{
            while(num < position-1){
                current = current.next;
                num++;
            }
            current.next.previous = node;
            node.next = current.next;
            node.previous = current;
            current.next = node;
            ;
            System.out.println("Node is added at position "+ position);
            count++;
        }
    }
    
    /**
     * finds particular node in list
     * @param node to be find
     * @return position of the node
     */
    public int find(DoublyNode<T> node){
        int position = 0;
        DoublyNode<T> current = head;
        while(current != null){
            if(current == node)
                return position;
            position++;
            current = current.next;
        }
        return -1;
    }
    
    /**
     * traverses and prints list
     */
    public void printList(){
        DoublyNode current = head;
        System.out.println("\nDoubly Linked list: \n");
        while(current != null){
            System.out.println(current.value);
            current = current.next;
        }
        System.out.println("\n");
    }

    /**
     * prints list in reverse order
     */
    public void printReverseList(){
        DoublyNode current = tail;
        System.out.println("\nDoubly Linked list in reversed order: \n");
        while(current != null){
            System.out.println(current.value);
            current = current.previous;
        }
        System.out.println("\n");
    }

    /**
     * checks if particular item exists in the list
     * @param item to be checked
     * @return true if item exists else false
     */
    public boolean contains(T item) {
        DoublyNode<T> current = this.head;
       //DoublyNode<T> node = (DoublyNode)item;
        while(current != null){
            if(current.value.equals(item)){
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
    /**
     * copies the list to an array
     * @param array array to which list is to be copied
     * @param arrayIndex index from where list is to be copied to array 
     */
    public void copyTo(T[]array, int arrayIndex){
        DoublyNode<T> current = head;
        while (current != null){
            array[arrayIndex++] = current.value;
            current = current.next;
        }
    }
    
    
}
