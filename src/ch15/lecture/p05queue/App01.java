package ch15.lecture.p05queue;

import java.util.LinkedList;
import java.util.Queue;

public class App01 {
    public static void main(String[] args) {
        // queue(FIFO, First In First Out)
        // 먼저 들어간 객체가 먼저 출력됨

        Queue<String> queue = new LinkedList<>();

        //offer : 객체 넣기
        queue.offer("java");
        queue.offer("html");
        queue.offer("css");
        queue.offer("java");
        queue.offer("react");
        System.out.println("queue = " + queue);
        // poll : 객체 꺼내기
        String poll = queue.poll();
        System.out.println("poll = " + poll);
        System.out.println("queue = " + queue);
        String poll1 = queue.poll();
        System.out.println("poll1 = " + poll1);
        System.out.println("queue = " + queue);
        //peek : 객체 살펴보기
        String peek = queue.peek();
        System.out.println("peek = " + peek);
        System.out.println("queue = " + queue);
    }
}
