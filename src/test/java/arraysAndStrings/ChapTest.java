package arraysAndStrings;

import org.junit.Assert;
import org.junit.Test;

/**
 * Some Description
 *
 * @author maciej.niemczyk@voipfuture.com
 */
public class ChapTest {

    @Test
    public void test1_1 () {
        Assert.assertTrue(Chap1_1.allUnique("abcd"));
        Assert.assertFalse(Chap1_1.allUnique("abcdd"));
        Assert.assertTrue(Chap1_1.allUnique("bcde"));
        Assert.assertFalse(Chap1_1.allUnique("000"));
        Assert.assertTrue(Chap1_1.allUnique("012"));
    }

    @Test
    public void test1_3 () {
        Assert.assertTrue(Chap1_3.isPermutation("abc", "bca"));
        Assert.assertFalse(Chap1_3.isPermutation("ab", "cba"));
        Assert.assertTrue(Chap1_3.isPermutation("cba", "abc"));
        Assert.assertFalse(Chap1_3.isPermutation("efg", "abc"));
    }

    @Test
    public void test1_3_solution () {
        Assert.assertTrue(Chap1_3_soultion.isPermutation("abc", "bca"));
        Assert.assertFalse(Chap1_3_soultion.isPermutation("ab", "cba"));
        Assert.assertTrue(Chap1_3_soultion.isPermutation("cba", "abc"));
        Assert.assertFalse(Chap1_3_soultion.isPermutation("efg", "abc"));
    }

    @Test
    public void test1_4 () {
        Assert.assertEquals("%20abc", Chap1_4.replaceSpace(" abc"));
        Assert.assertEquals("abc%20", Chap1_4.replaceSpace("abc "));
        Assert.assertEquals("Mr%20John%20Smith", Chap1_4.replaceSpace("Mr John Smith"));
    }
}
