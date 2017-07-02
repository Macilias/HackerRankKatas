package linkedLists;

/**
 * Some Description
 *
 * @author maciej.niemczyk@voipfuture.com
 */
public class Node<T> {

    public Node<T> next;
    public Node<T> prev;

    public T data;

    public Node(T data) {
        this.data = data;
    }

    public Node(Node<T> prev, Node<T> next) {
        this.prev = prev;
        this.next = next;
    }

    public T getData() {
        return data;
    }
}
