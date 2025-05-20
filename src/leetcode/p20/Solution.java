package leetcode.p20;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        //전체탐색 열린괄호는 푸쉬 닫힌괄호는 팝
        for (char c : s.toCharArray()) {
            // 열린 괄호면stack 에 푸쉬

            // 닫힌 괄호면 stack에 팦 한것과 비교?
            // 매치가 되면 게속 진행, 아니면 false
            switch (c) {
                case ']' -> {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    char open = stack.pop();
                    if (open != '[') {
                        return false;
                    }
                }
                case '}' -> {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    char open = stack.pop();
                    if (open != '{') {
                        return false;
                    }
                }
                case ')' -> {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    char open = stack.pop();
                    if (open != '(') {
                        return false;
                    }
                }
                default -> {
                    stack.push(c);
                }
            }
        }
        return stack.isEmpty();

        // 전부 짝이 맞으면 트루 아니면 폴스 리턴
    }
}
