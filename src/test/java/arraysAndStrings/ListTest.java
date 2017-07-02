package arraysAndStrings;

import linkedLists.DoubleLinkedList;
import linkedLists.Node;
import linkedLists.chap2_1;
import org.junit.Assert;
import org.junit.Test;

/**
 * Some Description
 *
 * @author maciej.niemczyk@voipfuture.com
 */
public class ListTest {

    @Test
    public void testUniquesWithBuffer () {
        DoubleLinkedList<Integer> list = chap2_1.removeDuplicatesWithBuffer(getIntegers(1, 2, 2));
        Integer[] expected = {1,2};
        Assert.assertArrayEquals(expected, list.toArray());
    }

    @Test
    public void testBasicOperations () {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
        Assert.assertTrue(list.size() == 0);
        Assert.assertTrue(list.isEmpty());
        list.add(1);
        Assert.assertTrue(list.size() == 1);
        Assert.assertFalse(list.isEmpty());
        list.add(2);
        list.add(3);
        Assert.assertTrue(list.getFirst().getData().equals(new Integer(1)));
        Assert.assertTrue(list.getLast().getData().equals(new Integer(3)));
    }

    @Test
    public void testIterator () {
        DoubleLinkedList<Integer> list = getIntegers(1, 2, 3);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }

    @Test
    public void testReverse () {
        DoubleLinkedList<Integer> list = getIntegers(5, 6, 7);
        Node<Integer> last = list.getLast();
        System.out.println(last.data);
        while (last.prev != null) {
            last = last.prev;
            System.out.println(last.data);
        }
    }

    @Test
    public void testToArray () {
        DoubleLinkedList<Integer> list = getIntegers(1, 2, 3);
        Integer[] expected = {1,2,3};
        Assert.assertArrayEquals(expected, list.toArray());
        Assert.assertArrayEquals(expected, list.toArray(new Integer[3]));
    }

    private DoubleLinkedList<Integer> getIntegers(int t, int t2, int t3) {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
        return list.addCon(t).addCon(t2).addCon(t3);
    }



}
