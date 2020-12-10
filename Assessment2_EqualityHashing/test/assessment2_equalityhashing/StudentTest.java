/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessment2_equalityhashing;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Deepak
 */
public class StudentTest {
    Student s;
    public StudentTest() {
        s = new Student();
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
     * Test of getEnrollment method, of class Student.
     */
    @Test
    public void testGetEnrollment() {
        System.out.println("getEnrollment");
        Student s1 = new Student();
        Enrollment expResult = s1.getEnrollment();
        Enrollment result = s.getEnrollment();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setEnrollment method, of class Student.
     */
    @Test
    public void testSetEnrollment() {
        System.out.println("setEnrollment");
        Enrollment enrollment = new Enrollment();
        
        s.setEnrollment(enrollment);
        assertEquals(enrollment, s.enrollment);
    }

    /**
     * Test of toString method, of class Student.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        
        String expResult = "";
        String result = s.toString();
        assertNotEquals(expResult, result);
        
    }

    /**
     * Test of equals method, of class Student.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Student instance = new Student();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of hashCode method, of class Student.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        
        int expResult = 0;
        int result = s.hashCode();
        assertNotEquals(expResult, result);
        
    }
    
}
