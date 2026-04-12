package org.gonzalez.Inheritance;

public class ExampleInheritance {
    public static void main(String[] args) {
        System.out.println("======== Creating the Student instance ========");
        Student student = new Student();
        student.setName("Diego");
        student.setSurnames("Bautista González");
        student.setSpanishGrade(9.0);
        student.setHistoryGrade(8.6);
        student.setMathematicsGrade(9.6);

        System.out.println("======== Creating the InternationalStudent instance ========");
        InternationalStudent interStudent = new InternationalStudent();
        interStudent.setName("Peter");
        interStudent.setSurnames("Gosling White");
        interStudent.setCountry("Australia");
        interStudent.setAge(16);
        interStudent.setInstitution("Trinity School");
        interStudent.setLanguageGrade(7.8);
        interStudent.setSpanishGrade(8.0);

        System.out.println("======== Creating the Teacher instance ========");
        Teacher teacher = new Teacher();
        teacher.setName("Juan");
        teacher.setSurnames("Huerta Estrada");
        teacher.setSubject("Spanish");

        System.out.println("Student: " + student.getName());
        System.out.println("Teacher: " + teacher.getName());
        System.out.println("International Student: " + interStudent.getName());

        System.out.println();

        Class internationalStudentClass = interStudent.getClass();

        while(internationalStudentClass.getSuperclass() != null) {
            String daughterClass = internationalStudentClass.getName();

            String parentClass = internationalStudentClass.getSuperclass().getName();

            System.out.println(daughterClass + " is a child class of the parent class " + parentClass);

            internationalStudentClass = internationalStudentClass.getSuperclass();
        }
    }
}
