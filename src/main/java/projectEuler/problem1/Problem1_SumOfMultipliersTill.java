package projectEuler.problem1;

import java.util.Arrays;
import java.util.List;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 * @author maciej.niemczyk@voipfuture.com
 */
public class Problem1_SumOfMultipliersTill {

    public static int getMultipliersOf(List<Integer> integers, int till) {

        int sum = 0;

        for (int i = 0; i < till; i++) {
            for (Integer integer : integers) {
                if (i % integer == 0) {
                    sum += i;
                    break;
                }
            }
        }

        return sum;

    }

    public static void main (String[] args) {

        System.out.println(getMultipliersOf(Arrays.asList(3, 5), 1000));

    }


}
