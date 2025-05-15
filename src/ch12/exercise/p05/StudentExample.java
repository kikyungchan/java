package ch12.exercise.p05;

import java.util.HashSet;

public class StudentExample {
    public static void main(String[] args) {
        //student를 저장하는 hashset생성
        HashSet<Student> hashSet = new HashSet<Student>();

        //student저장
        hashSet.add(new Student("1"));
        hashSet.add(new Student("1"));
        hashSet.add(new Student("2"));

        //저장된 student수 출력
        System.out.println(hashSet.size());
        
    }
}
