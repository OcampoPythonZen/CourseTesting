package code.challenge;

import java.util.Arrays;
import java.util.List;

public class BirthdayCakeCandles {

    public static int birthdayCakeCandles(List<Integer> candles) {
        int valueToReturn = 0;
        Integer maxValue =
                candles
                        .stream()
                        .mapToInt(Integer::valueOf)
                        .max()
                        .getAsInt();
        Integer counterOfMaxValue = Integer.valueOf((int)
                candles
                        .stream()
                        .filter(v -> v.equals(maxValue))
                        .count());
        return counterOfMaxValue;
    }

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(3, 2, 1, 3);
        birthdayCakeCandles(myList);
    }
}
