package org.gonzalez.Inheritance;

public class ExampleInheritanceToString {
    public static void main(String[] args) {
        System.out.println("======== Creating the Student instance ========");
        Student student = new Student("Diego", "Bautista González", 23, "TESH");
        student.setSpanishGrade(9.5);
        student.setMathematicsGrade(10.0);
        student.setHistoryGrade(9.8);
        student.setEmail("bautistadiego368@gmail.com");

        System.out.println("======== Creating the International  lStudent instance ========");
        InternationalStudent interStudent = new InternationalStudent("Peter", "Gosling White", "Australia");
        interStudent.setAge(16);
        interStudent.setInstitution("Trinity School");
        interStudent.setEmail("peter123@gmail.com");
        interStudent.setSpanishGrade(8.0);
        interStudent.setMathematicsGrade(9.0);
        interStudent.setHistoryGrade(9.0);
        interStudent.setLanguageGrade(7.8);

        System.out.println("======== Creating the Teacher instance ========");
        Teacher teacher = new Teacher("Juan", "Huerta Estrada", "Spanish");
        teacher.setAge(40);
        teacher.setEmail("juanito456@gmail.com");

        System.out.println(student);
    }
}