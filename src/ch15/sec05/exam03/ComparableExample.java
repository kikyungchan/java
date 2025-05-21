package ch15.sec05.exam03;

import com.sun.source.tree.Tree;

import java.util.TreeSet;

public class ComparableExample {
    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<Person>();

        treeSet.add(new Person("홍길동", 45));
        treeSet.add(new Person("감자바", 24));
        treeSet.add(new Person("가지원", 31));

        for (Person person : treeSet) {
            System.out.println(person.name + ":" + person.age);
        }
    }
}
