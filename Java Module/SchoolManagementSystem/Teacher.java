package SchoolManagementSystem;

/*
* Create Teacher class which will house the 
* teacher's name, ID number, Subject taught, Degree
*/

public class Teacher {

    private int id;
    private String name;
    private String subject;
    private String degree;

    /**
     * Initialize the objects in the Teacher class
     * @param id
     * @param name
     * @param subject
     * @param degree
     */

    Teacher(int id, String name, String subject, String degree){
        this.id=id;
        this.name=name;
        this.subject=subject;
        this.degree=degree;

    }
    /**
     * 
     * @return id for the Teacher
     */
    public int getId(){
        return id;
    }
    /**
     * 
     * @return Name of teacher
     */

    public String getName(){
        return name;
    }
    /**
     * 
     * @return Subject taught by the teacher 
     */

    public String getSubject(){
        return subject;
    }
    /**
     * 
     * @return the degree the teacher holds
     */

    public String getDegree(){
        return degree;
    }

    public void add(Teacher teachers) {
    }
}
