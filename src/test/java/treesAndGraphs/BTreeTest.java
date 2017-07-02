package treesAndGraphs;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static treesAndGraphs.BTree.*;

/**
 * Some Description
 *
 * @author maciej.niemczyk@voipfuture.com
 */
public class BTreeTest {

    String testCase1 = "1 2 4 3 5 6 7 7";
    String testCase2 = "15 1 16 2 17 0";
//    String testCase2 = "15 24 25 5 6 26 27 28 29 3 4 7 8 9 10 11 30 31";

    @Test
    public void testExample1 () {
        Node<Integer> root = createTreeByAddition(testCase1);
        Assert.assertTrue(recursiveBTreeTest(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
        Assert.assertTrue(root.contains(2));
        Assert.assertFalse(root.contains(8));
    }

    @Test
    public void testExample2 () {
        Node<Integer> root = createTreeByAddition(testCase2);
        Assert.assertTrue(recursiveBTreeTest(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
        Assert.assertTrue(root.contains(0));
        Assert.assertFalse(root.contains(100));
    }

    @Test
    public void testPrint () {
        Node<Integer> root = createTreeByAddition(testCase2);
        root.printInOrder();
        System.out.println();
        root.printPreOrder();
        System.out.println();
        root.printPostOrder();
    }

    private Node<Integer> createTreeByAddition(String problem) {
        Integer[] ints = getArrayFromString(problem);
        List<Integer> integers = Arrays.asList(ints);
        Node<Integer> root = getTreeFromValues(integers);
        BTreePrinter.printNode(root);
        return root;
    }

    private Integer[] getArrayFromString(String problem) {

        String[] split = problem.split(" ");
        Integer [] result = new Integer[split.length];
        for (int i = 0; i < split.length; i++) {
            result[i] = Integer.valueOf(split[i]);
        }
        return result;
    }

}
