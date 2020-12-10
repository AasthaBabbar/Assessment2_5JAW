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
 * Node for doubly link list
 * @param <T> generic
 */
public class DoublyNode<T> {
    DoublyNode next;
    DoublyNode previous; 
    T value;

    /**
     * getter for next node
     * @return next node
     */
    public DoublyNode getNext() {
        return next;
    }

    /**
     * setter for next node
     * @param next node to be set next to current node
     */
    public void setNext(DoublyNode next) {
        this.next = next;
    }

    /**
     * getter for previous node
     * @return previous node to current node
     */
    public DoublyNode getPrevious() {
        return previous;
    }

    /**
     * setter for previous node
     * @param previous previous node to be set for current node 
     */
    public void setPrevious(DoublyNode previous) {
        this.previous = previous;
    }

    /**
     * getter for value of the node
     * @return value of the node
     */
    public T getValue() {
        return value;
    }

    /**
     * setter for the value
     * @param value value to be set for the node
     */
    public void setValue(T value) {
        this.value = value;
    }
    
    /**
     * Constructor of node
     * @param _value value to be set for node
     */
    DoublyNode(T _value){
        value = _value;
        
    }
}
