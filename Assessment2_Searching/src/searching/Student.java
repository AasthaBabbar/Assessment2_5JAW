/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

/**
 *
 * @author Aastha
 */
/**
 * Student class
 */
public class Student extends Person implements Comparable<Student>{
    
    
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
     * @param id Id for person
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
    public Student(int id,String name, String tel, String email, int bldgNo, String street, 
            String suburb, String state, String postcode, String _program, 
            Date _dateRegistered, Date _dateEnrolled, String _semester, String _grade, Course course)
        {
            super(id,name, tel, email, bldgNo, street, suburb, state, postcode);
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
       return this.getId() == newStudent.getId();
   } 

    /**
     * checks the value of the hash code of the properties of the object
     * @return hash code value
     */
    @Override
    public int hashCode() {
        return id;
    }

    
    /**
     * search function linear search for students
     * @param students list of students
     * @param student student to search
     * @return index of searched student
     */
    public static int LinearSearch(ArrayList students, Student student)
    {
        int count;
        for (count = 0; count < 10; count++)
        {
            if (students.get(count) == student)
            {
                return count;
            }
        }
        return -1;
    }

    /**
     * search function binary search for students
     * @param students list of students
     * @param student student to search
     * @return index of searched student
     */
    public static int BinarySearch(ArrayList students, Student student)
    {

        StudentComparator studentCompare =  new StudentComparator();
        studentCompare.setSortingField("Id");
        Collections.sort(students, studentCompare);
        int min = 0;
        int max = students.size() - 1;
        int mid;
        int result = 0;
        while (min < max)
        {
            mid = (min + max) / 2;
            Student midStudent = (Student)students.get(mid);
            if (students.get(mid) == student)
            {
                result = mid;
                break;
            }
            if (((midStudent.compareTo(student)) == 0) || (midStudent.compareTo(student) == -1))
            {
                min = mid + 1;
            }
            else
            {
                max = mid - 1;
            }
            if (min > max)
            {
                result = -1;
                break;
            }
        }
        return result;
    }

    /**
     * Override function of Comparable interface
     * @param t student to be compared
     * @return 0 if equal, 1 if t is less and -1 if t is greater
     */
    @Override
    public int compareTo(Student t) {
        int first = this.getId();
        int second = t.getId();
        if(first == second){
            return 0;
        }
        else if(first>second){
            return 1;
        }
        else return -1;
    }
}
