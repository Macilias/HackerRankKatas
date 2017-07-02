package linkedLists;

import java.util.Collection;
import java.util.Iterator;

/**
 * Some Description
 *
 * @author maciej.niemczyk@voipfuture.com
 */
public class DoubleLinkedList<T> implements Collection<T> {

    private int size = 0;

    private Node<T> first;

    private Node<T> last;

    public Node<T> getFirst() {
        return first;
    }

    public Node<T> getLast() {
        return last;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return first == null || last == null;
    }

    public boolean contains(Object o) {
        System.out.println("not implemented yet");
        return false;
    }

    public Iterator<T> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<T> {

        // Start stepping through the array from the beginning
        private int nextIndex = 0;
        private Node<T> current = null;
        boolean lastConsumed = false;

        public boolean hasNext() {

            if (current == null) {
                current = first;
            }

            if (current == last) {
                if (!lastConsumed) {
                    lastConsumed = true;
                    return true;
                }
                return false;
            }

            return current.next != null;
        }

        public T next() {
            if (isEmpty()) {
                return null;
            }
            if (current == null) {
                current = first;
            }
            T data = current.getData();
            if (current.next != null) {
                current = current.next;
            }
            return data;
        }

        public void remove() {
            if (current == null) {
                current = first;
            }
            // head
            if (first == current) {
                first = current.next;
            }
            // tail
            if (last == current) {
                last = current.prev;
                current = last;
                lastConsumed = true;
            } else {
                current = current.next;
            }
            size --;
        }

    }

    public Object[] toArray() {
        Object[] result = new Object[size];
        Iterator<T> iterator = iterator();
        for (int i = 0; iterator.hasNext() ; i++) {
            result[i] = iterator.next();
        }
        return result;
    }

    public <T> T[] toArray(T[] result) {
        if (result.length < size) {
            result = (T[]) java.lang.reflect.Array.newInstance(result.getClass().getComponentType(), size);
        }

        Iterator<T> iterator = (Iterator<T>) iterator();
        for (int i = 0; iterator.hasNext() ; i++) {
            result[i] = iterator.next();
        }

        if (result.length > size) {
            result[size] = null;
        }

        return result;
    }

    public DoubleLinkedList<T> addCon(T t) {
        add(t);
        return this;
    }

    public boolean add(T t) {
        Node<T> node = new Node<T>(t);
        if (first == null) {
            first = node;
            last = node;
        } else {
            last.next = node;
            node.prev = last;
            last = node;
        }

        size++;

        return true;
    }

    public boolean remove(Object o) {
        System.out.println("not implemented yet");
        return false;
    }

    public boolean containsAll(Collection<?> c) {
        System.out.println("not implemented yet");
        return false;
    }

    public boolean addAll(Collection<? extends T> c) {
        System.out.println("not implemented yet");
        return false;
    }

    public boolean removeAll(Collection<?> c) {
        System.out.println("not implemented yet");
        return false;
    }

    public boolean retainAll(Collection<?> c) {
        System.out.println("not implemented yet");
        return false;
    }

    public void clear() {
        first = null;
        last = null;
        size = 0;
    }
}
