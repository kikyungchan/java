package ch15.exercise.p10;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<Student>();
        treeSet.add(new Student("blue", 96));
        treeSet.add(new Student("fong", 86));
        treeSet.add(new Student("white", 92));

        Student student = treeSet.last();
        System.out.println("student.score = " + student.score);
        System.out.println("student.id = " + student.id);

    }
}
