//package HW_4;

import controler.TeacherController;
import data.Teacher;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TeacherController teacherController = new TeacherController();

        Teacher teacher1 = teacherController.create("Иван", "Иванович", "Иванов");
        Teacher teacher2 = teacherController.create("Петр", "Петрович", "Петров");
        Teacher teacher3 = teacherController.create("Николай", "Николаевич", "Николаев");

        teacherController.editTeacher(0, "Сергей", "Иванович", "Иванов");

        List<Teacher> teacherList = teacherController.getAllTeachers();
        teacherController.displayTeachers(teacherList);
    }
}