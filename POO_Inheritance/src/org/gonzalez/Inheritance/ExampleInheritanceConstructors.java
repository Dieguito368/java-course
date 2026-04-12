package org.gonzalez.Inheritance;

public class ExampleInheritanceConstructors {
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

        print(student);
    }

    public static void print(Person person) {
        System.out.println(person.greeting());

        System.out.println("Name: " + person.getName() + " " + person.getSurnames());
        System.out.println("Age: " + person.getAge());
        System.out.println("Email: " + person.getEmail());

        if(person instanceof Student) {
            System.out.println("Institution: " + ((Student) person).getInstitution());
            System.out.println("Spanish Grade: " + ((Student) person).getSpanishGrade());
            System.out.println("Mathematics Grade: " + ((Student) person).getMathematicsGrade());
            System.out.println("History Grade: " + ((Student) person).getHistoryGrade());

            if(person instanceof InternationalStudent) {
                System.out.println("Language Grade: " + ((InternationalStudent) person).getLanguageGrade());
                System.out.println("Country: " + ((InternationalStudent) person).getCountry());
            }
            System.out.println("Average: " + ((Student) person).calculateAverage());
        }

        if(person instanceof Teacher) {
            System.out.println("Subject: " + ((Teacher) person).getSubject());
        }
    }
}