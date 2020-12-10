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
 * Generic Binary tree class that extends Comparable  to compare values of the nodes
 * 
 * @param <T> generic data type
 */
public class BinaryTree<T extends Comparable<T>>{
    // root Node
    Node root;
    
    
    /**
    * Constructor with item
    * @param item initialize tree with item
    */
    BinaryTree(T item){
        root = new Node(item);
    }        
    
    /**
    * default constructor
    */
    BinaryTree(){        
        root = null;    
    }
    
    /**
     * checks if tree is empty
     * @return true if empty else false
     */
    public boolean isEmpty(){
        return root == null;
    }
    
    /**
     * inserts item to the tree
     * @param item item to be added to the tree
     */
    public void insert(T item){
        if(isEmpty())
            root = new Node(item);
        else
            insert(root, item);
    }
    
    /**
    * inserts node to the tree
    * @param node root node of the tree
    * @param value value to be added to the tree
    */
    private void insert(Node node, T value){
        // value is less than current node value       
        if (value.compareTo((T)node.value) < 0){
            // left node is null
            if (node.left == null)
                node.left = new Node(value);
            else
                // left node is not null and recursive call to the function
                insert(node.left, value);
        }
        else{
            // right nod eis null
            if(node.right == null)
                node.right = new Node(value);
            // recursive cal to the function
            else
                insert(node.right, value);
        }
    }
    
    /**
     * traverse preorder through the tree
     */
    public void preOrder(){
        traversePreOrder(root);
    }
   
    /**
    * traverse through the tree starting from root node
    * @param node root node
    */
    private void traversePreOrder(Node node){
        if (node != null){
            System.out.print("\n " +node.value);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    
    /**
 * 
 */

    public void inOrder(){
        traverseInOrder(root);
    }
    
    /**
    * traverse through the tree starting from left of root node
    * @param node root node
    */
    private void traverseInOrder(Node node){
        if (node != null){
            traversePreOrder(node.left);
            System.out.print("\n " +node.value);
            traversePreOrder(node.right);
        }
    }
    
    /**
    * traverse post order
    */
    public void postOrder(){
        traversePostOrder(root);
    }
    
    /**
    * traverse through the tree starting from right of root node
    * @param node root node
    */
    private void traversePostOrder(Node node){
        if(node != null){
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print("\n "+node.value);
        }
    }

    /**
    * find a particular node in tree
    * @param value to be searched
    * @return node containing that value
    */
    public Node find(T value){
        Node current = root;
        while(current.value != value){
            if(value.compareTo((T)current.value) < 0)
                current = current.left;
            else
                current = current.right;
            if(current == null)
                return null;
        }
        return current;
    }    

    /**
    * deletes the particular value 
    * @param value value of the node to be deleted
    */
    public void delete(T value){
        root = delete(root, value);
    }
    
    /**
    * deletes particular node
    * @param node root node
    * @param value to be deleted
    * @return node that replaces deleted node
    */
    private Node delete(Node node, T value){
        // if root node is null
        if(node == null)
            return null;
        // value is less than root
        if(value.compareTo((T)node.value) <0){
            node.left = delete(node.left, value);
        }
        // value is more than root
        else if(value.compareTo((T)node.value) >0){
            node.right = delete(node.right, value);
        }
        else{// value is equal to node
            // node does not have child node
            if(node.left == null && node.right == null)
                node= null;
            // only left child node
            else if(node.left == null)
                node = node.right;
            // only right child node
            else if(node.right == null)
                node = node.left;
            else{// node has both child nodes
                // gets the minimum value from the right side of the node 
                // as it is the closest value to the current node to be deleted
                node.value = minValue(node.right);
                node.right = delete(node.right, (T)node.value);
            }
        }
        return node;
    }
    
    /**
    * gets the minimum value from the node till down
    * @param node root node
    * @return value of that node
    */
    private T minValue(Node node){
        T value = (T)node.value;
        while(node.left != null){
            node = node.left;
            value = (T)node.value;
        }
        return value;
    }
}
