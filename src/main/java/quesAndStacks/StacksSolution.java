package quesAndStacks;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StacksSolution {

    static class Node {
        char data;
        Node next;
        public Node(char data) {
            this.data = data;
        }
    }

    static class Stack {

        Node head;

        boolean empty(){
            return head == null;
        }

        char peak() throws EmptyStackException {
            if (head == null) {
                throw new EmptyStackException();
            }
            return head.data;
        }

        char pop() throws EmptyStackException {
            if (head == null) {
                throw new EmptyStackException();
            }
            char data = head.data;
            head = head.next;
            return data;
        }

        void push(char data) {
            Node newHead = new Node(data);
            if (head != null) {
                newHead.next = head;
            }
            head = newHead;
        }

    }

    public static boolean isBalanced(String expression) {

        Stack stack = new Stack();

        if(expression.length() % 2 != 0) {
            return false;
        }

        for (int i = 0; i < expression.length(); i++) {
            char bracket = expression.charAt(i);
            switch (bracket) {
                case '{':
                case '[':
                case '(':
                    stack.push(bracket); break;
                case '}':
                    try {
                        if (stack.pop() != '{') {
                            return false;
                        }
                    } catch (EmptyStackException e) {
                        return false;
                    }
                    break;
                case ']':
                    try {
                        if (stack.pop() != '[') {
                            return false;
                        }
                    } catch (EmptyStackException e) {
                        return false;
                    }
                    break;
                case ')':
                    try {
                        if (stack.pop() != '(') {
                            return false;
                        }
                    } catch (EmptyStackException e) {
                        return false;
                    }
                    break;
                default:
                    System.out.println("should not happen");
                    return false;
            }
        }

        return stack.empty();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }

}


