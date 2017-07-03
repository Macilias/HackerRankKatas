package linkedLists;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Some Description
 *
 * @author maciej.niemczyk@voipfuture.com
 */
public class chap2_1_RemoveDuplicates {

    public static <T> DoubleLinkedList<T> removeDuplicatesWithBuffer(DoubleLinkedList<T> source) {
        
        Set<T> uniques = new HashSet<T>();
        Iterator<T> iterator = source.iterator();
        while (iterator.hasNext() ) {
            if (!uniques.add(iterator.next())) {
                iterator.remove();
            }
        }
        
        return source;
    }

    public static <T> DoubleLinkedList<T> removeDuplicatesWithoutBuffer(DoubleLinkedList<T> source) {

        Iterator<T> iterator1 = source.iterator();
        Iterator<T> iterator2 = source.iterator();
        while (iterator1.hasNext() ) {
            T next1 = iterator1.next();
            while (iterator2.hasNext()) {
                T next2 = iterator2.next();
                if (next2.equals(next1)) {
                    iterator2.remove();
                }
            }
        }

        return source;
    }

}
