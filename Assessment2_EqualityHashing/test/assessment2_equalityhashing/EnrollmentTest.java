/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessment2_equalityhashing;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class EnrollmentTest {
    Enrollment enroll;
    public EnrollmentTest() {
        enroll = new Enrollment();
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
     * Test of getDateEnrolled method, of class Enrollment.
     */
    @Test
    public void testGetDateEnrolled() {
        System.out.println("getDateEnrolled");
        
        Date expResult = new Date(2020/12/2);
        Date result = enroll.getDateEnrolled();
        assertNotEquals(expResult, result);
        
    }

    /**
     * Test of setDateEnrolled method, of class Enrollment.
     */
    @Test
    public void testSetDateEnrolled() throws ParseException {
        System.out.println("setDateEnrolled");
        Date dateEnrolled = new SimpleDateFormat("mm/dd/yyyy").parse("2020/12/2");
        
        enroll.setDateEnrolled(dateEnrolled);
        assertEquals(dateEnrolled, enroll.dateEnrolled);
    }

    /**
     * Test of getGrade method, of class Enrollment.
     */
    @Test
    public void testGetGrade() {
        System.out.println("getGrade");
        
        String expResult = "";
        String result = enroll.getGrade();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setGrade method, of class Enrollment.
     */
    @Test
    public void testSetGrade() {
        System.out.println("setGrade");
        String grade = "passed";
        
        enroll.setGrade(grade);
        assertEquals(grade, enroll.grade);
    }

    /**
     * Test of getSemester method, of class Enrollment.
     */
    @Test
    public void testGetSemester() {
        System.out.println("getSemester");
        
        String expResult = "";
        String result = enroll.getSemester();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setSemester method, of class Enrollment.
     */
    @Test
    public void testSetSemester() {
        System.out.println("setSemester");
        String semester = "2020 Sem2";
        
        enroll.setSemester(semester);
        assertEquals(semester, enroll.semester);
    }

    /**
     * Test of getCourse method, of class Enrollment.
     */
    @Test
    public void testGetCourse() {
        System.out.println("getCourse");
        
        Course expResult = new Course();
        Course result = enroll.getCourse();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCourse method, of class Enrollment.
     */
    @Test
    public void testSetCourse() {
        System.out.println("setCourse");
        Course course = new Course();
        Enrollment instance = new Enrollment();
        instance.setCourse(course);
    }

    /**
     * Test of equals method, of class Enrollment.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        
        Enrollment instance = new Enrollment();
        boolean expResult = false;
        boolean result = enroll.equals(instance);
        assertNotEquals(expResult, result);       
    }

    /**
     * Test of hashCode method, of class Enrollment.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        
        int expResult = 0;
        int result = enroll.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Enrollment.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        
        String expResult = "";
        String result = enroll.toString();
        assertNotEquals(expResult, result);
    }
    
}
