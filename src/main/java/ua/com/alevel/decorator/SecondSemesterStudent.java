package ua.com.alevel.decorator;

public class SecondSemesterStudent extends StudentDecorator {

    public SecondSemesterStudent(Student student) {
        super(student);
    }

    public String mySkills(){
        return " and I know JavaScript, TypeScript";
    }

    @Override
    public String study() {
        return super.study() + mySkills();
    }
}
