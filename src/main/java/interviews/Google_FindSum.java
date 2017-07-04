package interviews;


import java.util.*;

/**
 * Created by mac on 04.07.17.
 */
public class Google_FindSum {

    /**
     * taken from https://www.youtube.com/watch?v=XKu_SEDAykw&t=183s
     * <p>
     * [1, 2, 3, 9]/4 Sum = 8 -> NO
     * [1, 2, 4, 4]/4 Sum = 8 -> YES (4 + 4)
     * [-9, -8, -2, 1, 2, 3, 5, 8, 10, 12, 16, 20]/12 Sum = 8 -> YES (-8 + 16; -2 + 10; 3 + 5)
     * <p>
     * - negative numbers are allowed
     * - the input arrays are sorted
     */

    static class Pair {
        int a, b;

        public Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    // this is my initial solution:

    public static List<Pair> hasSum(int[] a, int sum) {

        int mini = 0, maxi = 0;
        List<Pair> pairs = new LinkedList<>();

        while (mini < a.length) {
            if (a[mini] + a[maxi] == sum) {
                pairs.add(new Pair(a[mini], a[maxi]));
                mini++;
                maxi = mini;
            }
            if (a[mini] < a[maxi] + sum && maxi < a.length - 1) {
                maxi++;
            } else {
                mini++;
                maxi = mini;
            }

        }
        return pairs;

    }

    // this is his initial solution (before circumstances been changed)
    public static boolean hasPairWithSum(int[] a, int sum) {

        int low = 0;
        int hi = a.length - 1;

        while (low < hi) {
            int s = a[low] + a[hi];
            if (s == sum) {
                return true;
            }
            // now the rest follows his explanation an also my previous initial idea:
            if (s < sum) {
                low ++;
            } else {
                hi --;
            }
        }
        return false;
    }

    // this is his solution after the circumstances been changed: not sorted any more, and no sorting allowed
    public static boolean hasPairWithSumUnsorted(int[] a, int sum) {

        // the idea behind it here is a set with complements checked before the next complement is added
        // this way we can see in linear time weather or not a complement for the current number has been
        // seen in the past.
        Set<Integer> comp = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            int value = a[i];
            if (comp.contains(value)) {
                return true;
            }
            comp.add(sum - value);
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("ths sum:");
        int sum = in.nextInt();
        System.out.println("the arrays length:");
        int n = in.nextInt();
        int[] a = new int[n];
        System.out.println("now the arrays numbers (sorted):");
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        List<Pair> pairs = hasSum(a, sum);
        System.out.println(!pairs.isEmpty() ? "YES" : "NO");

        for (Pair pair : pairs) {
            System.out.println(pair.a + " " + pair.b);
        }
    }

}
