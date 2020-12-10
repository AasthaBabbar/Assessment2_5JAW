/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assessment2_linkedlist;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Aastha Babbar
 */
public class Assessment2_LinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        DoublyLinkedList<Student> list= new DoublyLinkedList<>();
        DoublyNode<Student> node = new DoublyNode(new Student(8, "Zoey", "04100890", "Zoey@yahoo.com", 10, "start Street", "Goodwood", "NSW", "5089", 
                "Cert3", new SimpleDateFormat("mm/dd/yyyy").parse("10/15/2009"), new SimpleDateFormat("mm/dd/yyyy").parse("10/15/2009"), "1", "Passed", 
                new Course("c201", "Certificate 3", 900)));
        list.insertStart(node);
            list.insertLast(new Student(2, "John", "049071234", "John@yahoo.com", 213, "Leader Street", "Castle", "VIC", "5089", "Diploma", new SimpleDateFormat("mm/dd/yyyy").parse("10/14/2009"), new SimpleDateFormat("mm/dd/yyyy").parse("10/14/2009"), "1", "Awaited", new Course("Cert4", "Certificate 4", 250)));
            list.insertStart(new Student(1, "Abner", "04527890", "Abner@yahoo.com", 23, "start Street", "Goodwood", "SA", "5089", "Diploma", new SimpleDateFormat("mm/dd/yyyy").parse("11/4/2009"), new SimpleDateFormat("mm/dd/yyyy").parse("11/4/2009"), "1", "Awaited", new Course("c201", "Certificate 3", 900)));
            list.insertLast(new Student(3, "Kristine", "04577990", "Kristine@yahoo.com", 61, "start Street", "Goodwood", "VIC", "5089", "Diploma",new SimpleDateFormat("mm/dd/yyyy").parse("10/19/2009"), new SimpleDateFormat("mm/dd/yyyy").parse("10/19/2009"), "1", "Awaited", new Course("d345", "Diploma", 450)));
            list.insertLast(new Student(5, "Debby", "04561123", "Debby@yahoo.com", 89, "start Street", "Goodwood", "WA", "5089", "Diploma", new SimpleDateFormat("mm/dd/yyyy").parse("12/16/2009"), new SimpleDateFormat("mm/dd/yyyy").parse("12/16/2009"), "1", "Fail", new Course("d990", "Degree", 950)));
            list.printList();
            int i = list.find(node);
            System.out.println("Zoey was found at position: "+ i);
            list.removeFirst();
            list.insertStart(new Student(1, "Abner", "04527890", "Abner@yahoo.com", 23, "start Street", "Goodwood", "SA", "5089", "Diploma", new SimpleDateFormat("mm/dd/yyyy").parse("11/4/2009"), new SimpleDateFormat("mm/dd/yyyy").parse("11/4/2009"), "1", "Awaited", new Course("c201", "Certificate 3", 900)));
            list.removeLast();
            list.insertLast(new Student(5, "Debby", "04561123", "Debby@yahoo.com", 89, "start Street", "Goodwood", "WA", "5089", "Diploma", new SimpleDateFormat("mm/dd/yyyy").parse("12/16/2009"), new SimpleDateFormat("mm/dd/yyyy").parse("12/16/2009"), "1", "Fail", new Course("d990", "Degree", 950)));
            list.remove(node.value);
            list.insert(node.value, 3);
            list.printList();
            list.printReverseList();
            
    }
    
}
