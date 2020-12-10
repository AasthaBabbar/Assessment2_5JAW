/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparator;

/**
 *
 * @author Aastha Babbar
 */
/**
 * Student comparator class/
 */
public class StudentComparator implements java.util.Comparator<Student> {

    //filed setting according to which list is sorted
    private String sortingField = "Id";

    /**
     * getter for sorting field
     * @return returns string containing sorting field
     */
    public String getSortingField() {
        return sortingField;
    }

    /**
     * setter for sorting field
     * @param sortingField string to assign to sorting field
     */
    public void setSortingField(String sortingField) {
        this.sortingField = sortingField;
    }
    
    /**
     * override compare function
     * @param t1 student 1 to be compared
     * @param t2 student 2 to be compared
     * @return returns 0 if equal, 1 if t1 is greater than t2 else -1
     */
    @Override
    public int compare(Student t1, Student t2) {
        Enrollment firstEnrollment = t1.getEnrollment();
        Enrollment secEnrollment = t2.getEnrollment();
        switch(sortingField){
            case "Id":{
                if (t1.getId()==t2.getId())
                    return 0;
                else if(t1.getId() > t2.getId())
                    return 1;
                else
                    return -1;
            }
            case "enrollment":{
                
                return (firstEnrollment.dateEnrolled.compareTo(secEnrollment.dateEnrolled) );
            }
            case "course":{
                double firstCost = firstEnrollment.getCourse().cost;
                double secondCost = secEnrollment.getCourse().cost;
                   if (firstCost == secondCost)
                    return 0;
                else if(firstCost > secondCost)
                    return 1;
                else
                    return -1;
            }
                
        }        
       return -1; 
    }
    
    
}
