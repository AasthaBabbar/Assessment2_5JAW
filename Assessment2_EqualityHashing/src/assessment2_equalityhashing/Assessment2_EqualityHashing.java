/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessment2_equalityhashing;

import java.util.Date;

/**
 *
 * @author Aastha Babbar
 * date 2.12.2020
 * 
 */
/**
 * It has main function to start the application
 */
public class Assessment2_EqualityHashing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Person p1 = new Person("James", "04536789", "James@yahoo.com", 37, "leader street", "goodwood", "SA", "5034");
            System.out.println(p1);
            Person p2 = new Person("John", "045454578", "JohnSmith@yahoo.com", 65, "Pirie Street", "Adelaide", "SA", "5000");
            System.out.println(p2);
            System.out.println("Hashcode comparison of p1 and p2: " + (p1.hashCode() == p2.hashCode()));
            Person p3 = p1;
            System.out.println("Hashcode comparison of p1 and p3: " + (p1.hashCode() == p3.hashCode()));
            Person p4 = new Person("james", "04536789", "James@yahoo.com", 37, "leader street", "goodwood", "SA", "5034");
            
            System.out.println("Overload equals operator p1 and p2: " + (p1.equals(p2)));
            
            System.out.println("Overload equals operator p1 and p3: " + (p1.equals(p3)));
            
            System.out.println("Overload equals operator p1 and p4: " + (p1.equals(p4)));

            System.out.println("Address overload equals of p1 and p4: " + (p1.getAddress().equals(p4.getAddress())));

            Course c = new Course("DE09", "Diploma", 99.00);
            Course c1 = new Course("CE11", "Certificate", 299.00);
            Student s1 = new Student("James", "04536789", "James@yahoo.com", 37, "leader street", "goodwood", "SA", "5034", "Diploma", new Date(),new Date(), "2", "Awaited", c);
            System.out.println(s1);
            Student s2 = new Student("John", "045454578", "JohnSmith@yahoo.com", 65, "Pirie Street", "Adelaide", "SA", "5000", "Certificate", new Date(2001, 12, 22), new Date(2002, 1, 15), "1", "Passed",c1);
            System.out.println(s2);
            Student s3 = new Student("James", "04536789", "James@yahoo.com", 37, "leader street", "goodwood", "SA", "5034", "Certificate", new Date(2016, 10, 22), new Date(2018, 11, 25), "2", "Awaited", c1);

            System.out.println("Overload Equals operator s1 == s2: " + (s1.equals(s2)));

            System.out.println("Overload Equals operator s1 == s3: " + (s1.equals(s3)));

            System.out.println("Overload Equals operator on Enrollment s1 == s3: " + (s1.getEnrollment().equals(s3.getEnrollment())));

            System.out.println("Overload Equals operator on Course s1 == s3: " + (s1.getEnrollment().getCourse().equals(s3.getEnrollment().getCourse())));

            System.out.println("Overload Equals operator on Enrollment s2 == s3: " + (s2.getEnrollment().equals(s3.getEnrollment())));

            System.out.println("Overload Equals operator on Course s2 == s3: " + (s2.getEnrollment().getCourse().equals(s3.getEnrollment().getCourse())));

            
    }
    
}
