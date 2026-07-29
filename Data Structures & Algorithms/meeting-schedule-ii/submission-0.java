/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        if(intervals.size()==0)return 0;
        if(intervals.size()==1)return 1;
        //we know that there's atleast gonna be two elements; so we just put the first one into the priority queue
        intervals.sort((a,b)->Integer.compare(a.start,b.start));
        // System.out.println(intervals);
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        pq.add(intervals.get(0).end);
        intervals.remove(0);
        for(Interval interval: intervals){
            // System.out.println(pq.peek()); --naturally the smallest in the pri q stays at the top of the pri q
            if(pq.peek()<=interval.start){
                pq.poll();
                pq.add(interval.end);
            }
            else{
                pq.add(interval.end);
            }
            // System.out.println(pq);
        }
        // System.out.println(pq);
        return pq.size();
    }
}
