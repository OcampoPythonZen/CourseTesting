package code.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.util.RouteMatcher;

public class FindingPairsChallenge {


    public static int sockMerchant2(int n, List<Integer> ar) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ret = 0;
        for (int x : ar) {
            if (!map.containsKey(x)) {
                map.put(x, 1);
            } else {
                map.put(x, map.get(x) + 1);
            }
        }
        for (int x : map.keySet()) {
            ret += map.get(x) / 2;
        }
        return ret;
    }

    public static int sockMerchant(int n, List<Integer> ar) {
        List<Integer> result = new ArrayList<Integer>();
        List<Integer> difValues = ar.stream().distinct().collect(Collectors.toList());
        for (int value : difValues) {
            int counter = 0;
            for (Integer arValue : ar) {
                System.out.println("value to find: " + value + " = array values " + arValue);
                if (value == arValue) {
                    counter++;
                    result.add(howManyPairs(counter));
                }
            }
        }
        System.out.println("Result: " + result);
        return result.stream().mapToInt(Integer::valueOf).sum();
    }


    static int howManyPairs(int value) {
        return value / 2;
    }


    public static void main(String[] args) {
        int n = args.length;
        List<Integer> ar = Arrays.asList(4, 5, 5, 5, 6, 6, 4, 1, 4, 4, 3, 6, 6, 3, 6, 1, 4, 5, 5, 5);
        //System.out.println("Pairs: " + howManyPairs(sockMerchant(n, ar)));
        System.out.println("Segunda opcion: " + sockMerchant2(n, ar));
    }
}
