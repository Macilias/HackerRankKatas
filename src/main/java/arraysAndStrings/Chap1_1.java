package arraysAndStrings;

import java.util.HashSet;
import java.util.Set;

/**
 * Some Description
 *
 * @author maciej.niemczyk@voipfuture.com
 */
public class Chap1_1 {

    public static boolean allUnique(String source) {

        Set<Character> set =  new HashSet<Character>(source.length());

        for (int i = 0; i < source.length(); i++) {
            int c = source.charAt(i);
            boolean add = set.add(source.charAt(i));
            if (!add) return false;
        }

        return true;
    }

    public static void main(String [] args){
        System.out.println(allUnique("abcd"));
        System.out.println(allUnique("abcdd"));
        System.out.println(allUnique("bcde"));
        System.out.println(allUnique("000"));
        System.out.println(allUnique("012"));
    }
}
