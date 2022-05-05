package ua.com.alevel.decorator;

public class ThirdSemesterStudent extends StudentDecorator{

    public ThirdSemesterStudent(Student student) {
        super(student);
    }

    public String mySkills(){
        return " and I know Java, SQL and Docker";
    }

    @Override
    public String study() {
        return super.study() + mySkills();
    }
}
