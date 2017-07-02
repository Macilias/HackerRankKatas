package arraysAndStrings;

import java.util.LinkedList;
import java.util.List;

/**
 * Some Description
 *
 * @author maciej.niemczyk@voipfuture.com
 */
public class Chap1_3 {

    public static boolean isPermutation(String a, String b) {

        if (a.length() != b.length()) return false;

        List<Integer> used = new LinkedList<Integer>();
        for (int i = 0; i < a.length(); i++) {
            char ac = a.charAt(i);
            boolean found = false;
            for (int j = 0; j < b.length(); j++) {
                char bc = b.charAt(j);
                if (ac == bc && !used.contains(j)) {
                    used.add(j);
                    found = true;
                    break;
                }
            }
            if (!found) return false;
        }
        return true;
    }

    public static void main(String [] args){

        System.out.println(isPermutation("abc", "cba"));
        System.out.println(isPermutation("ab", "cba"));
        System.out.println(isPermutation("cba", "abc"));
        System.out.println(isPermutation("efg", "abc"));

    }
}
