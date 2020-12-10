/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessment2_equalityhashing;


import java.util.Date;

/**
 *
 * @author Aastha Babbar
 * StudentId: 001108645
 * 
 */

/**
 * Student class has information about student with more information from parent class Person
 */
// Student Class with parent class as person
public class Student extends Person{
    /* properties of Student*/
    //program chosen by studen
    String program;
    // date of registeration under the program
    Date dateRegistered;
    // student's enrollment
    Enrollment enrollment;

    /**
     * getter of enrollment
     * @return enrollment object
     */
    public Enrollment getEnrollment() {
        return enrollment;
    }

    /**
     * setter of enrollment
     * @param enrollment object
     */
    public void setEnrollment(Enrollment enrollment) {
        this.enrollment = enrollment;
    }
    
    /**
     * no args constructor
     * assigning default values to the properties
     */
    public Student(){
        program = "";
        enrollment = new Enrollment();
        
        dateRegistered = new Date();
    }
    
    /**
     * all args constructor
     * @param name Name to be assigned to Student
     * @param tel telephone number assigned to Student
     * @param email email of the student
     * @param bldgNo bldgNo of address of the student
     * @param street street name of the address of the student
     * @param suburb suburb name of the address of the student
     * @param state state of the address of the student
     * @param postcode postcode of the address of the student
     * @param _program program under which student has enrolled
     * @param _dateRegistered date on which student registered
     * @param _dateEnrolled date on which student enrolled
     * @param _semester semester under which student is enrolled
     * @param _grade grade achieved by student
     * @param course course under which student has enrolled
     */
    public Student(String name, String tel, String email, int bldgNo, String street, 
            String suburb, String state, String postcode, String _program, 
            Date _dateRegistered, Date _dateEnrolled, String _semester, String _grade, Course course)
        {
            super(name, tel, email, bldgNo, street, suburb, state, postcode);
            program = _program;
            dateRegistered = _dateRegistered;
            enrollment = new Enrollment(_dateEnrolled, _semester, _grade, course);
        }

    
    
    /**
     * to convert the value of the object to String
     * @return returns Name and id
     */
    @Override
    public String toString(){
        return "Student[ id = "+id+" ,name = "+name +"]";
    }
    /**
     * equals function to check equality of the two student objects on the basis of their properties
     * @param obj object with which current object is checked
     * @return true if both objects are equal else false
     */
    @Override
    public boolean equals (Object obj){
       if(obj == null){
           return false;
       }
       if(getClass() != obj.getClass()){
           return false;
       }
       if(this == obj)
           return true;
       final Student newStudent = (Student)obj;
       if(this.getId() == newStudent.getId()){
           return true;
       }
       
       return false;
   } 

    /**
     * checks the value of the hash code of the properties of the object
     * @return hash code value
     */
    @Override
    public int hashCode() {
        return id;
    }
    
}
