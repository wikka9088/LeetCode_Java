import java.util.ArrayList;
import java.util.List;

public class Pascal_Triangle_easy {

	public static void main(String[] args) {
		/**
		 * given numRows = 5,
		 * return 
		 *  						[
								     [1],
								    [1,1],
								   [1,2,1],
								  [1,3,3,1],
								 [1,4,6,4,1]
								]
		 */
		
		List<List<Integer>> res = new Pascal_Triangle_easy().generate(5);
		System.out.println(res);

	}
	
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> res = new ArrayList<>();
        if (numRows <=0) {
        		return res;
        }
        List<Integer> preRow = new ArrayList<>();
        preRow.add(1); // 第一行
        res.add(preRow);
        
        for (int i = 2; i <= numRows; i++) {
        	List<Integer> currentRow = new ArrayList<>();
        		currentRow.add(1); //每一行的第一个元素为1   
        		for (int j = 1; j < preRow.size(); j++) {
        			int temp = preRow.get(j - 1) + preRow.get(j);
        			currentRow.add(temp); //根据上一行，放进中间项
        		}
        		currentRow.add(1); //每一行的最后一个元素为1
        		res.add(currentRow);
        		preRow = currentRow;
        }
       
        
        return res;
    }

}
