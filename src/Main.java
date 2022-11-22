import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student student = new Student("Adil Aitbaev", 12, "adil@gmail.com", Gender.M);
        Student student1 = new Student("Rahim Bazarbai uulu", 14, "rahim@gmail.com", Gender.M);
        Student student2 = new Student("Kani Akjoltoi kyzy", 11, "kani@gmail.com",Gender.F);
        Student[] students = {student, student1, student2};

        Student studen = new Student();
        studen.getAllStudent(students);
        studen.getMale(students);
        studen.getSurname(students);
        studen.sortAge(students);
        studen.findByName(students, input.next());

        for (Student student3 : students) {
            student3.findByName(students,"Ilim");
            student3.sortAge(students);

        }


    }
}