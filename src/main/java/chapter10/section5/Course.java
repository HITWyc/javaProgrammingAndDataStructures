package chapter10.section5;

/**
 * @author wangyc
 * @version 1.11
 * @description 《Java语言程序设计》P335页演示面向对象的例子
 * @data 2022/8/15 19:50
 */
public class Course {
    private final String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student){
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public void dropStudent(String student){
        // Left as an exercise in Programming Exercise 10.9
    }

    public String getCourseName() {
        return courseName;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }
}
