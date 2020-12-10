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
public class CourseTest {
    Course c;
    public CourseTest() {
        c = new Course();
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
     * Test of getCourseCode method, of class Course.
     */
    @Test
    public void testGetCourseCode() {
        System.out.println("getCourseCode");
        
        String expResult = "";
        String result = c.getCourseCode();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setCourseCode method, of class Course.
     */
    @Test
    public void testSetCourseCode() {
        System.out.println("setCourseCode");
        String courseCode = "2020 Semester 2";
        
        c.setCourseCode(courseCode);
       assertEquals(courseCode, c.courseCode);
    }

    /**
     * Test of getCourseName method, of class Course.
     */
    @Test
    public void testGetCourseName() {
        System.out.println("getCourseName");
        
        String expResult = "";
        String result = c.getCourseName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setCourseName method, of class Course.
     */
    @Test
    public void testSetCourseName() {
        System.out.println("setCourseName");
        String courseName = "Diploma";
        Course instance = new Course();
        c.setCourseName(courseName);
        assertEquals(c.courseName, courseName);
    }

    /**
     * Test of getCost method, of class Course.
     */
    @Test
    public void testGetCost() {
        System.out.println("getCost");
        
        double expResult = 0.0;
        double result = c.getCost();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of setCost method, of class Course.
     */
    @Test
    public void testSetCost() {
        System.out.println("setCost");
        double cost = 20.0;
        
        c.setCost(cost);
        
    }

    /**
     * Test of equals method, of class Course.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        
        Course instance = new Course();
        boolean expResult = false;
        boolean result = instance.equals(c);
        assertNotEquals(expResult, result);
        
    }

    /**
     * Test of hashCode method, of class Course.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Course instance = new Course();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of toString method, of class Course.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        
        String expResult = "";
        String result = c.toString();
        assertNotEquals(expResult, result);
        
    }
    
}
