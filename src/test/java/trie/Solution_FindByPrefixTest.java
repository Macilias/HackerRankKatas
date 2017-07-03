package trie;

import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

/**
 * Some Description
 *
 * @author maciej.niemczyk@voipfuture.com
 */
public class Solution_FindByPrefixTest {

    String problem0 = "add hack\n" +
                    "add hackerrank\n" +
                    "find hac\n" +
                    "find hak";

    String result0 = "2\n" +
                    "0";

    String problem1 = "add s\n" +
                    "add ss\n" +
                    "add sss\n" +
                    "add ssss\n" +
                    "add sssss\n" +
                    "find s\n" +
                    "find ss\n" +
                    "find sss\n" +
                    "find ssss\n" +
                    "find sssss\n" +
                    "find ssssss";

    String result1 = "5\n" +
                    "4\n" +
                    "3\n" +
                    "2\n" +
                    "1\n" +
                    "0";

    @Test
    public void testProblem0() {
        Solution_FindByPrefix solution = new Solution_FindByPrefix();
        String[] lines = problem0.split(System.getProperty("line.separator"));
        String resultProblem0 = testLines(solution, lines);
        System.out.println(resultProblem0);
        Assert.assertEquals(result0.trim(), resultProblem0.trim());
    }

    @Test
    public void testProblem1() {
        Solution_FindByPrefix solution = new Solution_FindByPrefix();
        String[] lines = problem1.split(System.getProperty("line.separator"));
        String resultProbelem1 = testLines(solution, lines);
        System.out.println(resultProbelem1);
        Assert.assertEquals(result1.trim(), resultProbelem1.trim());
    }

    private String testLines(Solution_FindByPrefix solution, String[] lines) {
        StringBuffer result = new StringBuffer();
        for (String line : lines) {
            String[] split = line.split(" ");
            Optional<String> s = Solution_FindByPrefix.runCommand(solution, split[0], split[1]);
            if (s.isPresent()) {
                result.append(s.get() + "\n");
            }
        }
        return result.toString();
    }

}
