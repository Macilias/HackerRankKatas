package treesAndGraphs;

import java.util.Hashtable;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Some Description
 *
 * @author maciej.niemczyk@voipfuture.com
 */
public class BFS {

    public static <T> void search(Node<T> root) {

        Queue<Node<T>> queue = new PriorityQueue<Node<T>>();

        root.visited = true;

    }

    class Node<T> {

        Hashtable<T, Node<T>> adjacent = new Hashtable<T, Node<T>>();

        boolean visited;

        public Hashtable<T, Node<T>> getAdjazent() {
            return adjacent;
        }

        public T data;

        public Node(T data) {
            this.data = data;
        }

        public Node<T> addAdj(Node<T> node) {
            adjacent.put(node.data, node);
            return this;
        }

        public T getData() {
            return data;
        }
    }

    public static void test(){

        String test;

        int[] fuck = new int[3];
        {
            BFS node = new BFS();
        }

        for (int i : fuck) {
            
        }
    }

    
    
    public static void main (String args[]) {



    }

}
