package SchoolManagementSystem;
import java.util.List;

/*
* Create School class that will have 
* Teachers and Students using an ArrayList
*/

public class School {

    private List<Teacher> teachers;
    private List<Student> students;

    /**
     * New school objects created.
     * @param teachers list of teachers in the school
     * @param students list of students in the school
     */

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;

    }
    /**
     * 
     * @return the list of teachers in the school
     */
    public List<Teacher> getTeachers(){
        return teachers;
    }
    public void addTeachers(Teacher teachers){
        teachers.add(teachers);
    }
    /**
     * 
     * @return the list of students in the school
     */
    public List<Student> getStudents(){
        return students;
    }
    /**
     * Add a student to the school
     * @param student is the student to be added
     */
    public void addStudent(Student student){
        students.add(student); 
    }

}

