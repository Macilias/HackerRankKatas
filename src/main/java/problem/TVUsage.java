package problem;

import java.util.*;

/**
 * StacksSolution to the Problem:
 * There's a room with a TV and people are coming in and out to watch it. The TV is on only when there's at least a person in the room.
 * For each person that comes in, we record the start and end time. We want to know for how long the TV has been on. In other words:
 * Given a list of time intervals, write a function that calculates the total amount of time covered by the intervals.
 * <p>
 * input: (1,4) (2,3)
 * > 3
 * input: (4,6) (1,2)
 * > 3
 * input: (1,4) (6,8) (2,4) (7,9) (10, 15)
 * > 11
 *
 * a proper solution as provided here, can be found there: http://www.geeksforgeeks.org/merging-intervals/
 *
 * @author maciej.niemczyk@voipfuture.com
 */
public class TVUsage {

    public static int calculateUsage(List<Interval> intervals) {

        Set<Integer> set = new HashSet<Integer>();

        for (Interval interval : intervals) {

            // here was a bug: i should be not <= but only < -> otherwise 1-4 is 4
            for (int i = interval.start; i < interval.end; i++) {
                set.add(i);
            }
        }
        return set.size();

    }

    // if you want to use it from static -> static
    public static class Interval {

        int start;
        int end;

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }

    }

    public static void main(String[] args) {


        System.out.println(TVUsage.calculateUsage(Arrays.asList(new Interval(1, 4), new Interval(2, 3)))); // 3
        System.out.println(TVUsage.calculateUsage(Arrays.asList(new Interval(4, 6), new Interval(1, 2)))); // 3
        System.out.println(TVUsage.calculateUsage(Arrays.asList(new Interval(1, 4), new Interval(6, 8),
                new Interval(2, 4), new Interval(7, 9), new Interval(10, 15)))); // 11

    }

}



