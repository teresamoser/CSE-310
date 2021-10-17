package SchoolManagementSystem;

/*
* Create Student class which will house the 
* student's name, ID number, Grade Level
*/


public class Student {
    
    private int id;
    private String name;
    private String grade;

        /**
        * Initializing the objects from student class
        * @param id
        * @param name
        * @param grade
        */

    Student(int id, String name, String grade){

        this.id=id;
        this.name=name;
        this.grade=grade;

    }
    /**
     * 
     * @return the student id number
     */
    public int getId(){
        return id;
    }
    /**
     * 
     * @return the name of the student
     */
    public String getName(){
        return name;
    }

    /**
     * 
     * @return the grade the student is currently enrolled in
     */
    public String getGrade(){
        return grade;
    }

    
}

