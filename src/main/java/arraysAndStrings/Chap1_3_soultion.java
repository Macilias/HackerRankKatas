package arraysAndStrings;

import java.util.Arrays;

/**
 * User sort Mother Fucker - how have you solved unification and normalization in your DA otherwise?!
 *
 * @author maciej.niemczyk@voipfuture.com
 */
public class Chap1_3_soultion {

    public static String sort(String s) {
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    public static boolean isPermutation(String a, String b){
        if (a.length() != b.length()) return  false;
        return sort(a).equals(sort(b));
    }

    public static void main(String [] args){

        System.out.println(isPermutation("abc", "cba"));
        System.out.println(isPermutation("ab", "cba"));
        System.out.println(isPermutation("cba", "abc"));
        System.out.println(isPermutation("efg", "abc"));

    }

}
