package Students;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Student Alex = new Student("Alex", "636-02", 1, new int[] { 2, 2, 3, 2, 5 });
        Student Jon = new Student("Jon", "436-01", 2, new int[] { 5, 5, 5, 4, 5 });
        Student Petr = new Student("Petr", "706-02", 2, new int[] { 3, 4, 3, 4, 5 });
        Student Oleg = new Student("Oleg", "401-02", 1, new int[] { 3, 3, 3, 3, 2 });
        Student Dima = new Student("Dima", "602-04", 3, new int[] { 2, 5, 5, 2, 5 });
        Student Yana = new Student("Yana", "332-01", 3, new int[] { 4, 3, 3, 4, 5 });
        ArrayList<Student> studentsList = new ArrayList<Student>(Arrays.asList(Alex, Jon, Petr, Oleg, Dima, Yana));

        Student.printStudents(studentsList, 3);

        System.out.println("-------");

        Student.print(studentsList);
        Student.deleteStudents(studentsList);
        Student.print(studentsList);
    }
}