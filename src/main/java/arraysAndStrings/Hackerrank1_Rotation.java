package arraysAndStrings;

import java.util.Scanner;

/**
 * Some Description
 *
 * @author maciej.niemczyk@voipfuture.com
 */
public class Hackerrank1_Rotation {

    public static void rotate(int[] array, int rotationCount) {

        int n = array.length;

        for(int i = 0; i < n; i++) {
            System.out.print(array[(i + rotationCount) % n] + " ");
        }
        System.out.print('\n');

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        rotate(a, k);

    }

}
