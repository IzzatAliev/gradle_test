package ua.com.alevel.decorator;

public class DecoratorMain {

    public static void main(String[] args) {
        Student student = new ThirdSemesterStudent(new SecondSemesterStudent(new FirstSemesterStudent()));
        System.out.println(student.study());
    }
}
