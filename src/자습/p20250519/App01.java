package 자습.p20250519;

import java.util.ArrayList;
import java.util.List;

public class App01 {
    public List<Boolean> evenNumbersInArray(int[] numbers) {
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                result.add(true);

                // 코드 작성하기

            } else {
                result.add(false);
            }
        }
        return result;
    }
}