package code.challenge;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSum {
    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> myStream = myList.stream()
                .filter(n -> n%2 == 0)
                .collect(Collectors.toList());
        myStream.forEach(System.out::println);

        //System.out.println(myStream);

        Integer IntegersSum = myList.stream()
                .mapToInt(Integer::valueOf)
                .sum();
        //System.out.println(IntegersSum);


        List<Integer> primeNumbers = myList.stream()
                .filter(StreamSum::isPrime)
                .collect(Collectors.toList());
        //System.out.println(primeNumbers);
    }

    static Boolean isPrime(int number) {
        if (number < 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
