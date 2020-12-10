/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessment2_binarytree;

/**
 *
 * @author Aastha Babbar
 */

/**
 * Node class for binary tree 
 * @param <T> generic type
 */
public class Node<T> {
    T value;
    Node left;
    Node right;

    /**
    * getter for value
    * @return returns value
    */
    public T getValue() {
        return value;
    }

    /**
    * setter of value
    * @param value value to be set
    */
    public void setValue(T value) {
        this.value = value;
    }

    /**
    * getter for left child
    * @return left child
    */
    public Node getLeft() {
        return left;
    }

    /**
    * setter for left child node 
    * @param left set left node
    */

    public void setLeft(Node left) {
        this.left = left;
    }

    /**
    * getter for right child
    * @return right child 
    */
    public Node getRight() {
        return right;
    }

    /**
    * setter for right child node 
    * @param right set right node
    */
    public void setRight(Node right) {
        this.right = right;
    }
    
    
    /**
    * Constructor
    * @param _value value of the node
    */ 
    public Node(T _value){
        value = _value;
        left = null;
        right = null;
    }
}
