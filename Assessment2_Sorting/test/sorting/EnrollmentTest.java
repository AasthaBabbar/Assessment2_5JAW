/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
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
public class EnrollmentTest {
    
    public EnrollmentTest() {
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
     * Test of InsertionSort method, of class Enrollment.
     */
    @Test
    public void testInsertionSort() throws ParseException {
        System.out.println("InsertionSort");
        ArrayList enrollments = new ArrayList();
        enrollments.add(new Enrollment( new SimpleDateFormat("mm/dd/yyyy").parse("10/14/2009"), "1", "Awaited", new Course("c201", "Certificate 3", 900)));
        enrollments.add(new Enrollment(new SimpleDateFormat("mm/dd/yyyy").parse("10/4/2009"), "1", "Fail", new Course("d345", "Diploma", 450)));
        enrollments.add(new Enrollment(new SimpleDateFormat("mm/dd/yyyy").parse("10/24/2009"), "1", "Passed", new Course("d990", "Degree", 950)));
        enrollments.add(new Enrollment( new SimpleDateFormat("mm/dd/yyyy").parse("10/18/2009"), "1", "Awaited", new Course("cert4", "Certificate 4", 250)));
        enrollments.add(new Enrollment(new SimpleDateFormat("mm/dd/yyyy").parse("10/1/2009"), "1", "Fail", new Course("d345", "Diploma", 450)));
        enrollments.add(new Enrollment(new SimpleDateFormat("mm/dd/yyyy").parse("10/12/2009"), "1", "Passed", new Course("d990", "Degree", 950)));
        Enrollment.InsertionSort(enrollments);
        Enrollment e1 = (Enrollment)enrollments.get(4);
        Collections.sort(enrollments);
        Enrollment e2 = (Enrollment)enrollments.get(4);
        assertEquals(e1,e2);
    }
    
}
