package ch05.Exercise;

public class Exercise06and08 {
    public static void main(String[] args) {
        System.out.println("6번----------------------------");
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };
        System.out.println("array.length = " + array.length); // 3
        System.out.println("array[2].length = " + array[2].length);//5

        System.out.println("8번----------------------------");
        int total = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                total += array[i][j];
                count++;
            }
        }
        double avg = total / count;
        System.out.println("총점 = " + total);
        System.out.println("평균" + " = " + avg);

    }
}

