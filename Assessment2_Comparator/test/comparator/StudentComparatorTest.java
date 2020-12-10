/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
public class StudentComparatorTest {
    StudentComparator student = new StudentComparator();
    public StudentComparatorTest() {
        student.setSortingField("Id");
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
     * Test of getSortingField method, of class StudentComparator.
     */
    @Test
    public void testGetSortingField() {
        System.out.println("getSortingField");
        StudentComparator instance = new StudentComparator();
        String result = instance.getSortingField();
        assertEquals(student.getSortingField(), result);
        
    }

    /**
     * Test of setSortingField method, of class StudentComparator.
     */
    @Test
    public void testSetSortingField() {
        System.out.println("setSortingField");
        
        StudentComparator instance = new StudentComparator();
        instance.setSortingField("Id");
        assertNotEquals(student, this);
    }

    /**
     * Test of compare method, of class StudentComparator.
     */
    @Test
    public void testCompare() throws ParseException {
        System.out.println("compare");
        Student t1 = new Student(1, "Abner", "04527890", "Abner@yahoo.com", 23, "start Street", "Goodwood", "SA", "5089", "Cert3", new SimpleDateFormat("mm/dd/yyyy").parse("10/14/2009"), new SimpleDateFormat("mm/dd/yyyy").parse("10/14/2009"), "1", "Awaited", new Course("c201", "Certificate 3", 900));
        Student t2 = new Student(7, "David", "04167870", "David@yahoo.com", 29, "This Street", "Flinders", "WA", "5089", "Diploma", new SimpleDateFormat("mm/dd/yyyy").parse("10/4/2009"), new SimpleDateFormat("mm/dd/yyyy").parse("10/4/2009"), "1", "Fail", new Course("d345", "Diploma", 450));
        StudentComparator instance = new StudentComparator();
        int expResult = 0;
        int result = instance.compare(t1, t2);
        assertNotEquals(expResult, result);
        
    }
    
}
