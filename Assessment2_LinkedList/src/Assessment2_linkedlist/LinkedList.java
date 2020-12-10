/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assessment2_linkedlist;

import java.util.*;


/**
 *
 * @author Aastha Babbar
 */
/**
 * Linked list class
 * @param <T> generic
 */
public class LinkedList<T> {
    
    Node<T> head;
    Node<T> tail;
    int count;

    /**
     * getter for head
     * @return gets the first node of the list as head
     */
    public Node<T> getHead() {
        return head;
    }

    /**
     * setter for head
     * @param head node to be set for head
     */
    public void setHead(Node<T> head) {
        this.head = head;
    }

    /**
     * getter for tail
     * @return gets the last node of the list
     */
    public Node<T> getTail() {
        return tail;
    }

    /**
     * setter for the tail
     * @param tail node to be set at the tail of the list
     */
    public void setTail(Node<T> tail) {
        this.tail = tail;
    }

    /**
     * getter for the count
     * @return number of nodes in the list
     */
    public int getCount() {
        return count;
    }
    
    /**
     * adding node to the start of the lit
     * @param node node to be inserted
     */
    public void insertStart(Node<T> node){
        Node<T> temp = this.head;
        head = node;
        head.next = temp;
        count++;
        if(count == 1){
            tail.next = head;
        }
    }
    
    /**
     * adding node at the last of the list
     * @param node node to be added at the last of the list
     */
    public void insertLast(Node<T> node){
        if(count == 0)
            head = node;
        else
            tail.next = node;
        tail = node;
        count++;
    }
    
    /**
     * insert node after the given node
     * @param node node after which new node is to be added
     * @param value value of the node to be added
     * 
     */
    public void insertAfter(Node<T> node, T value){
        Node current = new Node(value);
        Node temp = node.next;
        node.next = current;
        current.next = temp;
    }
    
    /**
     * remove node from the last of the list
     */
    public void removeLast(){
        if(count!=0){
            if(count ==1){
                head = null;
                tail = null;
            }
            else{
                Node<T> current = head;
                while(current.next != tail){
                    current = current.next;
                }
                current.next = null;
                tail = current;
            }
            count--;
        }
    }
    
    /**
     * removes first node from the list
     * 
     */
    public void removeFirst(){
        if(count != 0){
            head = head.next;
            count--;
            if(count == 0){
                tail = null;
            }
        }
    }
    
    /**
     * removes particular node 
     * @param node node to be deleted
     * @return true if deletion was successful
     */
    public boolean remove(T node){
        Node<T> previous = null;
        Node<T> current = head;
        while(current!=null){
            if(current.value.equals(node)){
                if(previous != null){
                    previous.next = current.next;
                    if(current.next == null){
                        tail = previous;
                    }
                    count--;
                }
                else{
                    removeFirst();
                }
                return true;
            }
            previous = current;
            current = current.next;
        }
        return false;
    }
    
    /**
     * find a node in the list
     * @param node node to be find
     * @return position of the node
     */
    public int find(Node<T> node){
        int position = 0;
        Node<T> current = head;
        while(current != null){
            if(current == node)
                return position;
            position++;
            current = current.next;
        }
        return -1;
    }
    
    /**
     * prints the list by traversing through it. 
     */
    public void printList(){
        Node current = head;
        System.out.println("\n Linked list: \n");
        while(current != null){
            System.out.println(current.value);
            current = current.next;
        }
        System.out.println("\n");
    }

    
    /**
     * searches for the node in the list
     * @param  item value to be searched
     * @return true if found else false
     */
    public boolean contains(T item) {
        Node<T> current = this.head;
       Node<T> node = (Node)item;
        while(current != null){
            if(current.value.equals(node)){
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
        Node<T> current = head;
        while (current != null){
            array[arrayIndex++] = current.value;
            current = current.next;
        }
    }
    
    /**
     * insert item at particular position
     * @param item item to be added
     * @param position position at which item is to be added
     */ 
    public void insert(T item, int position){
        //insertStart(new Node<T>(item));
        Node<T> current = head;
        Node<T> node = new Node<>(item);
        int num = 0;
        while(num < position){
            current = current.next;
            num++;
        }
        node.next = current.next;
        current.next = node;
        
    }

}

