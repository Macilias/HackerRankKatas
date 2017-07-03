package treesAndGraphs;

import java.util.List;

/**
 * For the purposes of this challenge, we define a binary search tree to be a binary tree with the following ordering properties:
 *
 * The  value of every node in a node's left subtree is less than the data value of that node.
 * The  value of every node in a node's right subtree is greater than the data value of that node.
 *
 * @author maciej.niemczyk@voipfuture.com
 */
public class BTree_TestIfBFS {

    public static <T extends Comparable<T>> boolean recursiveBTreeTest(Node<T> node, T min, T max) {

        if (node.data.compareTo(min) < 0 || node.data.compareTo(max) > 0) {
            // it belongs else where
            return false;
        }

        if (node.left != null && node.left.data.compareTo(node.data) >= 0) {
            return false;
        }

        if (node.right != null && node.right.data.compareTo(node.data) <= 0) {
            return false;
        }

        return ((node.left == null) || recursiveBTreeTest(node.left, min, node.data)) &&
                ((node.right == null) || recursiveBTreeTest(node.right, node.data, max));

    }

    public static <T extends Comparable<T>> Node<T> getTreeFromValues(List<T> values) {

        if (values.isEmpty()) {
            return null;
        }

        Node<T> root = new Node<T>(values.get(0));

        for (int i = 1; i < values.size(); i++) {

            if (root.add(values.get(i))) {
                System.out.println("added " + values.get(i));
            } else {
                System.out.println("rejected " + values.get(i));
            }

        }

        return root;
    }

    static class Node<T extends Comparable<T>> {
        Node<T> left, right;
        T data;

        public Node(T data) {
            this.data = data;
        }

        public boolean add(T data) {

            if (data == null) {
                System.out.println("null can be added");
                return false;
            }

            int compareTo = data.compareTo(this.data);

            if (compareTo == 0) {
                return false;
            } else if (compareTo < 0) {
                if (left == null) {
                    left = new Node<>(data);
                    return true;
                } else {
                    return left.add(data);
                }
            } else {
                if (right == null) {
                    right = new Node<>(data);
                    return true;
                } else {
                    return right.add(data);
                }
            }

        }

        public boolean contains (T data) {
            if (data == null) {
                return false;
            }

            int compareTo = data.compareTo(this.data);

            if (compareTo == 0) {
                return true;
            } else if (compareTo < 0) {
                if (left == null) {
                    return false;
                } else {
                    return left.contains(data);
                }
            } else {
                if (right == null) {
                    return false;
                } else {
                    return right.contains(data);
                }
            }
        }

        public void printInOrder() {
            if (left != null) {
                left.printInOrder();
            }
            System.out.print(data + " ");
            if (right != null) {
                right.printInOrder();
            }
        }

        public void printPreOrder() {
            System.out.print(data + " ");
            if (left != null) {
                left.printPreOrder();
            }
            if (right != null) {
                right.printPreOrder();
            }
        }

        public void printPostOrder() {
            if (left != null) {
                left.printPostOrder();
            }
            if (right != null) {
                right.printPostOrder();
            }
            System.out.print(data + " ");
        }

    }

}
