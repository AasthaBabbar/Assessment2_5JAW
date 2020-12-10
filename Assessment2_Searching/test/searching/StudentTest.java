/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searching;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aastha Babbar
 */
public class StudentTest {
    ArrayList<Student> students = new ArrayList();
    public StudentTest() throws ParseException {
        
        students.add(new Student(1, "Abner", "04527890", "Abner@yahoo.com", 23, "start Street", "Goodwood", "SA", "5089", "Cert3", new SimpleDateFormat("mm/dd/yyyy").parse("10/14/2009"), new SimpleDateFormat("mm/dd/yyyy").parse("10/14/2009"), "1", "Awaited", new Course("c201", "Certificate 3", 900)));
            students.add(new Student(7, "David", "04167870", "David@yahoo.com", 29, "This Street", "Flinders", "WA", "5089", "Diploma", new SimpleDateFormat("mm/dd/yyyy").parse("10/4/2009"), new SimpleDateFormat("mm/dd/yyyy").parse("10/4/2009"), "1", "Fail", new Course("d345", "Diploma", 450)));
            students.add( new Student(4, "Jack", "042379997", "Jack@yahoo.com", 5, "That Street", "Norwood", "SA", "5089", "Degree", new SimpleDateFormat("mm/dd/yyyy").parse("10/24/2009"), new SimpleDateFormat("mm/dd/yyyy").parse("10/24/2009"), "1", "Passed", new Course("d990", "Degree", 950)));
            students.add(new Student(2, "John", "049071234", "John@yahoo.com", 213, "Leader Street", "Castle", "VIC", "5089", "Cert4", new SimpleDateFormat("mm/dd/yyyy").parse("10/18/2009"), new SimpleDateFormat("mm/dd/yyyy").parse("10/18/2009"), "1", "Awaited", new Course("Cert4", "Certificate 4", 250)));
            students.add( new Student(10, "Samantha", "04123490", "Sam@yahoo.com", 263, "sturt Street", "Belair", "SA", "5089", "Cert3", new SimpleDateFormat("mm/dd/yyyy").parse("10/1/2009"), new SimpleDateFormat("mm/dd/yyyy").parse("10/1/2009"), "1", "Fail", new Course("c201", "Certificate 3", 900)));
            students.add(new Student(6,"Peter", "04444890", "Peter@yahoo.com", 239, "cole Street", "Standard", "SA", "5089", "Diploma", new SimpleDateFormat("mm/dd/yyyy").parse("10/12/2009"), new SimpleDateFormat("mm/dd/yyyy").parse("10/12/2009"), "1", "Awaited", new Course("d345", "Diploma", 450)));
            students.add( new Student(9, "Gabriela", "04567888", "Gabriela@yahoo.com", 8, "start Street", "SouthWest", "SA", "5089", "Cert4", new SimpleDateFormat("mm/dd/yyyy").parse("10/17/2009"), new SimpleDateFormat("mm/dd/yyyy").parse("10/17/2009"), "1", "Awaited", new Course("Cert4", "Certificate 4", 250)));
            students.add(new Student(8, "Zoey", "04100890", "Zoey@yahoo.com", 10, "start Street", "Goodwood", "NSW", "5089", "Cert3", new SimpleDateFormat("mm/dd/yyyy").parse("10/15/2009"), new SimpleDateFormat("mm/dd/yyyy").parse("10/15/2009"), "1", "Passed", new Course("c201", "Certificate 3", 900)));
            students.add( new Student(3, "Kristine", "04577990", "Kristine@yahoo.com", 61, "start Street", "Goodwood", "VIC", "5089", "Diploma",new SimpleDateFormat("mm/dd/yyyy").parse("10/19/2009"), new SimpleDateFormat("mm/dd/yyyy").parse("10/19/2009"), "1", "Awaited", new Course("d345", "Diploma", 450)));
            students.add(new Student(5, "Debby", "04561123", "Debby@yahoo.com", 89, "start Street", "Goodwood", "WA", "5089", "Degree", new SimpleDateFormat("mm/dd/yyyy").parse("10/16/2009"), new SimpleDateFormat("mm/dd/yyyy").parse("10/16/2009"), "1", "Fail", new Course("d990", "Degree", 950)));    
            
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    /**
     * Test of LinearSearch method, of class Student.
     */
    @Test
    public void testLinearSearch() {
        System.out.println("LinearSearch");
        //ArrayList students = null;
        Student student = students.get(3);
        
        int result = Student.LinearSearch(students, student);
        assertEquals(3, result);
        
    }

    /**
     * Test of BinarySearch method, of class Student.
     */
    @Test
    public void testBinarySearch() {
        System.out.println("BinarySearch");
        
        Student student = students.get(5);
        
        int result = Student.BinarySearch(students, student);
        assertNotEquals(6, result);
        
    }
    
}
