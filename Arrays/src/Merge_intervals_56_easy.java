import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Merge_intervals_56_easy {

	public static void main(String[] args) {
		/**
		 * Given a collection of intervals, merge all overlapping intervals.
		 */
		
		//Input: [[1,3],[8,10],[2,6], [15,18]]
		//Output: [[1,6],[8,10],[15,18]]
		//Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].

	}
	
    public List<Interval> merge(List<Interval> intervals) {
        if (intervals == null || intervals.size() < 2) {
        		return intervals;
        }
        
        Collections.sort(intervals, new CompareIntervals());
        List<Interval> result = new ArrayList<>();
        
        Interval prev = intervals.get(0);
        
        for (int i = 1; i < intervals.size(); i++)  {
        		Interval current = intervals.get(i);
        		
        		if (current.start <= prev.end) {
        			Interval temp = new Interval(prev.start, Math.max(prev.end, current.end));
        			prev = temp;
        		
        		} else {
        			result.add(prev);
        			prev = current;
        		}
        }
        	
        result.add(prev);
        
        return result;
    }
    
    public class CompareIntervals implements Comparator<Interval> {

		@Override
		public int compare(Interval o1, Interval o2) {
			// TODO Auto-generated method stub
			return o1.start - o2.start;
		}
    	
    }
	
	 public class Interval {
		int start;
		int end;
		Interval() { start = 0; end = 0; }
		Interval(int s, int e) { start = s; end = e; }
	 }

}
