package 자습.p20250514.App03;

public class ScoreActionExample {
    private static int[] scores = {95, 87, 42, 9, 12, 66, 3};

    public static void runIf(ScoreCondition condition, ScoreAction action) {
        for (int score : scores) {
            if (condition.test(score)) {
                action.apply(score);
            }
        }
    }

    public static void main(String[] args) {
        //50점이상출력
        System.out.println("==50점 이상==");
        runIf(score -> score >= 50, score -> System.out.println(score));
        //짝수만 출력
        System.out.println("==짝수 점수==");
        runIf(score -> score % 2 == 0, score -> System.out.println(score));
        //10 미만 제곱 출력
        System.out.println("==10 미만 제곱==");
        runIf(score -> score < 10, score -> System.out.println(score * score));
    }

}
