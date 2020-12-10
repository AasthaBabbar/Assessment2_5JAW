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
 * @author Aastha Babbar
 */
public class AddressTest {
    
    Address add;
    public AddressTest() {
        add = new Address();
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
     * Test of getNumber method, of class Address.
     */
    @Test
    public void testGetNumber() {
        System.out.println("getNumber");
        
        int expResult = 10;
        int result = add.getNumber();
        assertNotEquals(expResult, result);
        
    }

    /**
     * Test of setNumber method, of class Address.
     */
    @Test
    public void testSetNumber() {
        System.out.println("setNumber");
        int number = 5;
        add.setNumber(number);
        assertEquals(number, add.number);
    }

    /**
     * Test of getStreet method, of class Address.
     */
    @Test
    public void testGetStreet() {
        System.out.println("getStreet");
        String expResult = "";
        String result = add.getStreet();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setStreet method, of class Address.
     */
    @Test
    public void testSetStreet() {
        System.out.println("setStreet");
        add.setStreet("Essex ST");
        assertEquals(add.street, "Essex ST");
    }

    /**
     * Test of getSuburb method, of class Address.
     */
    @Test
    public void testGetSuburb() {
        System.out.println("getSuburb");
        String result = add.getSuburb();
        assertEquals("", result);
    }

    /**
     * Test of setSuburb method, of class Address.
     */
    @Test
    public void testSetSuburb() {
        System.out.println("setSuburb");
        add.setSuburb("Goodwood");
        assertEquals("Goodwood", add.suburb);
        
    }

    /**
     * Test of getState method, of class Address.
     */
    @Test
    public void testGetState() {
        System.out.println("getState");
        String expResult = "";
        String result = add.getState();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setState method, of class Address.
     */
    @Test
    public void testSetState() {
        System.out.println("setState");
        String state = "South Australia";
        
        add.setState(state);
        assertNotEquals("Adelaide", add.state);
    }

    /**
     * Test of getPostcode method, of class Address.
     */
    @Test
    public void testGetPostcode() {
        System.out.println("getPostcode");
        
        String expResult = "";
        String result = add.getPostcode();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPostcode method, of class Address.
     */
    @Test
    public void testSetPostcode() {
        System.out.println("setPostcode");
        String postcode = "5034";
        add.setPostcode(postcode);
        assertEquals(postcode, add.postcode);
    }

    /**
     * Test of hashCode method, of class Address.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        int expResult = 0;
        int result = add.hashCode();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of equals method, of class Address.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Address instance = new Address();
        boolean expResult = false;
        boolean result = instance.equals(add);
        assertNotEquals(expResult, result);
        
    }

    /**
     * Test of toString method, of class Address.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "";
        String result = add.toString();
        assertNotEquals(expResult, result);

    }
    
}
