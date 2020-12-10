/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searching;

import java.util.Objects;

/**
 *
 * @author Aastha Babbar
 */
/**
 * Address class
 */
public class Address {
      // properties
    int number;
    String street;
    String suburb;
    String state;
    String postcode;

    /**
     * getter of building number
     * @return returns building number
     */
    public int getNumber() {
        return number;
    }

    /**
     * setter of building number
     * @param number sets building number 
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * getter for street name
     * @return returns street name
     */
    public String getStreet() {
        return street;
    }

    /**
     * setter for the street name
     * @param street street name to be assigned
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * getter for the suburb name
     * @return returns the suburb name
     */
    public String getSuburb() {
        return suburb;
    }

    /**
     * setter for the suburb name
     * @param suburb suburb name to be assigned 
     */
    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }
    

    /**
     * getter for the state name
     * @return suburb name
     */
    public String getState() {
        return state;
    }

    /**
     * setter for the state
     * @param state state name to be assigned 
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * getter for the postcode
     * @return postcode of the state
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * setter of the postcode
     * @param postcode postcode to be assigned
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    /**
     * all args constructor
     * @param number building number
     * @param street street name
     * @param suburb suburb name
     * @param state state name
     * @param postcode post code 
     */
    public Address(int number, String street, String suburb, String state, String postcode) {
        this.number = number;
        this.street = street;
        this.suburb = suburb;
        this.state = state;
        this.postcode = postcode;
    }

    /**
     * no args constructor
     */
    public Address() {
        this.number = 0;
        this.street = "";
        this.suburb = "";
        this.state = "";
        this.postcode = "";
    }

    /**
     * override hash code method
     * @return hashcode for street name
     */
    @Override
    public int hashCode() {
        
        return this.street.hashCode();
    }

    /**
     * override function for equals
     * @param obj object to be compared
     * @return true if objects are equal else false
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Address other = (Address) obj;
        return this.number == other.number;
    }
    

    /**
     * Override to string method
     * @return object in string form
     */
    @Override
    public String toString() {
        return "Address{" + "number=" + number + ", street=" + street + ", suburb=" + suburb + ", state=" + state + ", postcode=" + postcode + '}';
    }
  
}
