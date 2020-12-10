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
 * Node class for linked list
 * @param <T> generic class
 */
public class Node<T>{
        
    Node next;
    T value;
    /**
     * constructor
     * @param _value value to be assigned to a node
     */
    Node(T _value){
        value = _value;
        next = null;
    }

    /**
     * getter for next node
     * @return next node of the current node
     */
    public Node getNext() {
        return next;
    }

    /**
     * setter of next node
     * @param next next node to be assigned to next node
     */
    public void setNext(Node next) {
        this.next = next;
    }

    /**
     * getter of value of the node
     * @return generic type value of value
     */
    public T getValue() {
        return value;
    }

    /**
     * setter of the value of the node
     * @param value to b assigned
     */
    public void setValue(T value) {
        this.value = value;
    }
        
        
}
