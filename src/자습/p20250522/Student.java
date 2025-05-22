package 자습.p20250522;

public class Student {
    private String name;
    private int score;

    // 생성자
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    // getter 메서드들
    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    // toString 메서드 (선택 사항, 출력할 때 유용)
    @Override
    public String toString() {
        return name + ": " + score;
    }
}