package arraysAndStrings;

/**
 * Some Description
 *
 * @author maciej.niemczyk@voipfuture.com
 */
public class Chap1_4_soultion {

    public static String replaceSpace(char[] source, int  length) {
        int count = 0, newLength;

        for (char aChar : source) {
            if (aChar == ' '){
                count ++;
            }
        }

        newLength = length + count * 2;
        for (int i = length - 1; i >= 0; i--) {
            if (source[i] == ' ') {
                source[newLength-1]   = '0';
                source[newLength-2] = '2';
                source[newLength-3] = '%';
                newLength = newLength - 3;
            } else {
                source[newLength-1] = source[i];
                newLength --;
            }
        }

        return new String(source);
    }

    public static void main(String [] args){
        char[] source = {' ', 'b', 'c', ' ', '\0', '\0', '\0', '\0' };
        System.out.println(replaceSpace(source, " bc ".length()));

    }

}
