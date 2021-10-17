package SchoolManagementSystem;

import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) {
       
        Teacher mcgonagall = new Teacher (2003, "McGonagall", "Transfiguration", "Masters of Wizardry");
        Teacher slughorn = new Teacher (2004, "Slughorn", "Potions", "Masters of Wizardry");
        Teacher flitwick = new Teacher (2014, "Flitwick", "Charms", "Masters of Fine Arts");
        Teacher quirrell = new Teacher (2008, "Quirrell", "Muggle Studies", "Masters of Human Behavior");
        Teacher snape = new Teacher (2100, "Snape", "Defense Against the Dark Arts", "Wizard Master");
        

        List<Teacher>teacherList = new ArrayList<>();
        teacherList.add(mcgonagall);
        teacherList.add(slughorn);
        teacherList.add(flitwick);
        teacherList.add(quirrell);
        teacherList.add(snape);

        Student harry = new Student (1999, "Harry", "Year One");
        Student hermione = new Student (1996, "Hermione", "Year One");
        Student george = new Student (1888, "George", "Year Three");
        Student millecent = new Student (1887, "Millecent", "Year Two ");


        List<Student>studentList = new ArrayList<>();
        studentList.add(harry);
        studentList.add(hermione);
        studentList.add(george);
        studentList.add(millecent);


        School hogwarts = new School(teacherList, studentList);
        for (int i = 0; i < (teacherList.size());i++) 
            {
                Teacher curTeacher = teacherList.get(i);
                    System.out.println();
                    System.out.printf("\n Hogwart's Professor ID Number: %s",curTeacher.getId());
                    System.out.printf("\n Professor Name: %s", curTeacher.getName());
                    System.out.printf("\n Subject Taught: %s", curTeacher.getSubject());
                    System.out.printf("\n Degree Earned: %s", curTeacher.getDegree());
        
            }
   
        for (int i = 0; i < (studentList.size());i++) 
            {
               Student curStudent = studentList.get(i); 
                    System.out.println();
                    System.out.printf("\n Hogwart's Professor ID Number: %s",curStudent.getId());
                    System.out.printf("\n Professor Name: %s", curStudent.getName());
                    System.out.printf("\n Subject Taught: %s", curStudent.getGrade());
                    System.out.println();
            
            }
       
    }
}
    

