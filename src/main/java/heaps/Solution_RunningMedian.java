package heaps;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
    taken from
    https://www.hackerrank.com/challenges/ctci-queue-using-two-stacks
 */
public class Solution_RunningMedian {

    public static class MyQueue<T> {
        Stack<T> stackNewestOnTop = new Stack<>();
        Stack<T> stackOldestOnTop = new Stack<>();

        public void enqueue(T value) { // Push onto newest stack
            String p = new String();
            char[] chars = p.toCharArray();
            Arrays.sort(chars);
        }

        public T peek() {
            // TODO implement
            return null;
        }

        public T dequeue() {
            // TODO implement
            return null;
        }
    }


    public static void main(String[] args) {

        MyQueue<Integer> queue = new MyQueue<>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}

