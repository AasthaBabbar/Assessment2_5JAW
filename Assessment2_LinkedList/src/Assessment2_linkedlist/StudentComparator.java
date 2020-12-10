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
 * student comparator class implementing comparator interface
 */
public class StudentComparator implements java.util.Comparator<Student> {

    private String sortingField;

    /**
     * getter for sorting field
     * @return sorting field
     */
    public String getSortingField() {
        return sortingField;
    }

    /**
     * setter for sorting field
     * @param sortingField value to be set in sorting field
     */
    public void setSortingField(String sortingField) {
        this.sortingField = sortingField;
    }
    
    /**
     * override compare function to compare two objects
     * @param t1 first object
     * @param t2 second object
     * @return 0 if equal, 1 if first is smaller else -1 
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
