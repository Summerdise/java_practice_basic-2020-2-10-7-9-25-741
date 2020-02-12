import java.util.*;

public class Teacher {
    private String name;
    ArrayList<Student> studentArrayList = new ArrayList<>();

    public Teacher(String teacherName) {
        this.name = teacherName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addStudent(String studentName, int studentGrade) {
        studentArrayList.add(new Student(studentName, studentGrade));
    }

    public void addPoints(int index, int addGrade) {
        Student student = studentArrayList.get(index);
        int newGrade = student.getGrade() + addGrade;
        student.setGrade(newGrade);
    }

    public void printTeacherStatus() {
        System.out.println(String.format("老师：%s\n学生：", name));
        for (int i = 0; i < studentArrayList.size(); i++) {
            Student student = studentArrayList.get(i);
            String studentName = student.getName();
            int studentGrade = student.getGrade();
            System.out.print(String.format("（%s，%d分）", studentName, studentGrade));
        }
    }
}
