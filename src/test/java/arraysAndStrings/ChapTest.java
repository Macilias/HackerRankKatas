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
        Assert.assertTrue(Chap1_1_AllUnique.allUnique("abcd"));
        Assert.assertFalse(Chap1_1_AllUnique.allUnique("abcdd"));
        Assert.assertTrue(Chap1_1_AllUnique.allUnique("bcde"));
        Assert.assertFalse(Chap1_1_AllUnique.allUnique("000"));
        Assert.assertTrue(Chap1_1_AllUnique.allUnique("012"));
    }

    @Test
    public void test1_3 () {
        Assert.assertTrue(Chap1_3_PermutationTest.isPermutation("abc", "bca"));
        Assert.assertFalse(Chap1_3_PermutationTest.isPermutation("ab", "cba"));
        Assert.assertTrue(Chap1_3_PermutationTest.isPermutation("cba", "abc"));
        Assert.assertFalse(Chap1_3_PermutationTest.isPermutation("efg", "abc"));
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
        Assert.assertEquals("%20abc", Chap1_4_ReplaceSpace.replaceSpace(" abc"));
        Assert.assertEquals("abc%20", Chap1_4_ReplaceSpace.replaceSpace("abc "));
        Assert.assertEquals("Mr%20John%20Smith", Chap1_4_ReplaceSpace.replaceSpace("Mr John Smith"));
    }
}
