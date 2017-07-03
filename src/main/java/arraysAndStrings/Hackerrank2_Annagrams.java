package arraysAndStrings;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by mac on 03.07.17.
 */
public class Hackerrank2_Annagrams {

    public static int numberNeeded(String first, String second) {
        int max = first.length() + second.length();
        int pairs = 0;
        char[] a = first.toCharArray();
        char[] b = second.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            System.out.println(a[i] + " -vs- " + b[j]);
            if (a[i] == b[j]) {
                pairs++;
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }
        return max - pairs * 2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }

}
