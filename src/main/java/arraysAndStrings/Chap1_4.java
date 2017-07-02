package arraysAndStrings;

/**
 * Some Description
 *
 * @author maciej.niemczyk@voipfuture.com
 */
public class Chap1_4 {

    public static String replaceSpace(String string) {
        char[] source = string.toCharArray();
        int count = 0;

        for (char aChar : source) {
            if (aChar == ' '){
                count ++;
            }
        }

        char[] result = new char[source.length + count * 2];
        int j = result.length -1 ;
        for (int i = source.length -1; i >= 0; i--) {
            if (source[i] == ' ') {
                result[j]   = '0';
                result[j-1] = '2';
                result[j-2] = '%';
                j = j - 3;
            } else {
                result[j] = source[i];
                j --;
            }
        }

        return new String(result);
    }

    public static void main(String [] args){

        System.out.println(replaceSpace("abc "));

    }

}
