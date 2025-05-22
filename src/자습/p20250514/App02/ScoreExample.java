package 자습.p20250514.App02;

public class ScoreExample {
    private static int[] scores = {95, 87, 42, 9, 12, 66, 3};

    public static int sumByCondition(ScoreCondition condition) {
        int sum = 0;
        for (int score : scores) {
            if (condition.test(score)) {
                sum += score;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int sum1 = sumByCondition(score -> score >= 50);
        int sum2 = sumByCondition(score -> (score % 2) == 0);
        int sum3 = sumByCondition(score -> score < 10);
        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);
        System.out.println("sum3 = " + sum3);

    }
}

