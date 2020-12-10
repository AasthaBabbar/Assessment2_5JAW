/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.ArrayList;
import java.util.Collections;
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
public class CourseTest {
    
    public CourseTest() {
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
     * Test of SelectionSort method, of class Course.
     */
    @Test
    public void testSelectionSort() {
        System.out.println("SelectionSort");
        ArrayList courses = new ArrayList();
        courses.add(new Course("c201", "Certificate 3", 900));
        courses.add(new Course("d345", "Diploma", 450));
        courses.add(new Course("d990", "Degree", 950));
        courses.add(new Course("Cert4", "Certificate 4", 250));
        Course.SelectionSort(courses);
        Course c = (Course)courses.get(2);
        
        Collections.sort(courses);
        Course c1 = (Course)courses.get(2);
        assertEquals(c, c1);
    }
    
}
