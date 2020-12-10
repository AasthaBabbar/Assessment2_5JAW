/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessment2_binarytree;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Aastha Babbar
 */
/**
 * Enrollment class
 */
public class Enrollment implements Comparable<Enrollment> {
    // Properties
    Date dateEnrolled;
    String grade;
    String semester;
    Course course;

    /**
     * getter for date enrolled
     * @return Date when enrolled
     */
    public Date getDateEnrolled() {
        return dateEnrolled;
    }

    /**
     * setter of the date enrolled
     * @param dateEnrolled date to be assigned as date enrolled
     */
    public void setDateEnrolled(Date dateEnrolled) {
        this.dateEnrolled = dateEnrolled;
    }

    /**
     * getter for grades received
     * @return grade received
     */
    public String getGrade() {
        return grade;
    }

    /**
     * setter of the grades assigned
     * @param grade grade to be assigned
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * getter for semester
     * @return semester for the enrollment
     */
    public String getSemester() {
        return semester;
    }

    /**
     * setter of the semester
     * @param semester semester for the assignment
     */
    public void setSemester(String semester) {
        this.semester = semester;
    }

    /**
     * getter for the course
     * @return course associated with the enrollment
     */
    public Course getCourse() {
        return course;
    }

    /**
     * setter for the Course
     * @param course course to be assigned for the enrollment
     */
    public void setCourse(Course course) {
        this.course = course;
    }

    
    
    /**
     * no args constructor
     */
    public Enrollment() {
        
        dateEnrolled = null;
        grade = "";
        semester = "";
        course = new Course();
    }

    /**
     * all args constructor
     * @param dateEnrolled enrollment date
     * @param grade grade assigned for the enrollment
     * @param semester semester assigned for the enrollment
     * @param course course associated with the enrollment
     */
    public Enrollment(Date dateEnrolled, String grade, String semester, Course course) {
        this.dateEnrolled = dateEnrolled;
        this.grade = grade;
        this.semester = semester;
        this.course = course;
    }
    
    /**
     * Overrides equals function
     * @param obj object to be compared for equality
     * @return true if equal else false
     */
    @Override
   public boolean equals(Object obj)
   {
        if (obj == null)
            return false;
        if (obj.getClass() != this.getClass())
            return false;
        if (this== obj){
            return true;
        }
        Enrollment e = (Enrollment)obj;
        return e.dateEnrolled == this.dateEnrolled;
    }

   /**
    * Override function for hash code
    * @return returns int hash value
    */
   @Override
    public  int hashCode()
    {
        return this.semester.hashCode();
    }
    
    /**
     * override method for to string
     * @return returns the string value of the object
     */
    @Override
    public String toString()
    {
        return "Enrollment[ Date: "+dateEnrolled+", grade: "+grade+", semester: "+semester+" ]";
    }

    /**
     * Override Compare function
     * @param t enrollment to be compared
     * @return 0 if equal, 1 if first is smaller than other else -1
     */
    @Override
    public int compareTo(Enrollment t) {
        Date first = this.getDateEnrolled();
        Date second = t.getDateEnrolled();
        return first.compareTo(second);
    }
    
    /**
     * Insertion sort method
     * @param enrollments list to be sort 
     */
    public static void InsertionSort(ArrayList enrollments){
        for(int count = 1; count < enrollments.size(); count++){
            Enrollment current = (Enrollment)enrollments.get(count);
            
            int num = count -1;
            //Enrollment enrollment = ;
            while(num >= 0 && current.compareTo((Enrollment)enrollments.get(num)) == -1){
                enrollments.set(num+1, (Enrollment)enrollments.get(num));
                num--;
            }
            enrollments.set(num+1, current);
        }
    }
    
}

