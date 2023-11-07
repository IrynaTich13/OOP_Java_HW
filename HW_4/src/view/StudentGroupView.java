package HW_4.view;

import data.Student;

import java.util.List;

public class StudentGroupView {
    public void printStudentGroup(List<Student> studentGroup){
        for (Student student : studentGroup) {
            System.out.println();
        }
    }
}
