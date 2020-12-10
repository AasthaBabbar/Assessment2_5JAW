/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assessment2_linkedlist;

/**
 *
 * @author Aastha Babbar
 */
/**
 * Person class
 */
public class Person {
    // properties of the person
    int id;
    String name;
    String email;
    String telNum;
    Address address;

    /**
     * getter of Id
     * @return returns id of the person
     */
    public int getId() {
        return id;
    }

    /**
     * sets Id of the person
     * @param id name to be set for the person
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * getter of Name
     * @return returns name of the person
     */
    public String getName() {
        return name;
    }

    /**
     * sets Name of the person
     * @param name name to be set for the person
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getter of email
     * @return returns email of the person
     */
    public String getEmail() {
        return email;
    }

    /**
     * sets email of the person
     * @param email email to be set for the person
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * getter of telephone number
     * @return returns telephone number of the person 
     */
    public String getTelNum() {
        return telNum;
    }

    /**
     * sets telephone number of the person
     * @param telNum telephone number to be set for the person
     */
    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    /**
     * getter of Address
     * @return returns Address of the person 
     */
    public Address getAddress() {
        return address;
    }

    /**
     * sets address of the person
     * @param address address to be set for the person
     */
    public void setAddress(Address address) {
        this.address = address;
    }
    
    /**
     * Constructor of Person
     */
    public Person()
    {
        id  = 0;
        name = "";
        telNum = "";
        email = "";
        address = new Address();
    }

    /**
     * Constructor of person
     * @param _id Id for person
     * @param _name Name to be assigned to Person
     * @param _telNum telephone number assigned to Person
     * @param _email email of the Person
     * @param bldgNo bldgNo of address of the Person
     * @param street street name of the address of the Person
     * @param suburb suburb name of the address of the Person
     * @param state state of the address of the Person
     * @param postcode postcode of the address of the Person
     */
    public Person(int _id, String _name, String _telNum, String _email, int bldgNo, String street, String suburb, String state, String postcode)
    {
        id = _id;
        name = _name;
        telNum = _telNum;
        email = _email;
        address = new Address(bldgNo, street, suburb, state, postcode);
    }
    
    /**
     * equals method to check if two objects are equal
     * @param obj object to be compared
     * @return returns true if objects are equal else false
     */
    @Override
    public  boolean equals(Object obj)
    {
        final Person p = (Person)obj;
        if (obj == null)
            return false;
        if (obj.getClass()!= this.getClass())
            return false;
        if(this == obj){
            return true;
        }
        if(this.id == p.id){
            return true;
        }
            
        return false;
    }

    /**
     * hash code of the person
     * @return id of the person
     */
    @Override
    public int hashCode()
    {
        return id;
    }

    /**
     * Converts the value of the object to string
     * @return returns name and id of the person as string
     */
    @Override
    public String toString()
    {
     return "Person[ id= "+ id+", Name= "+name +" ]";
    }

}
