
public class Solution {
	//Find the maximum difference in an array where difference is a[j]-a[i] and j > i
	  static int maxDifference(int[] a) {
	      int max_dif = a[1]-a[0];
	      int min_num = a[0];
	      for(int i =1; i<a.length; i++)
	      {
	    	  int dif = a[i]-min_num;
	    	  //This if is true when a[i] is the biggest number seen so far
	    	  if(dif>max_dif)
	    		  max_dif = dif;
	    	  //This if is true when a[i] is the smallest number seen so far.
	    	  if(min_num > a[i])
	    		  min_num=a[i];
	      }
	      return max_dif;
	    }


	   
	   public static void main(String[] args) {
		   int[] a = {7,9,5,6,3,2};
		   int res = maxDifference(a);
		   System.out.println(res);
	       /* Scanner in = new Scanner(System.in);
	        final String fileName = System.getenv("OUTPUT_PATH");
	        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
	        int res;
	        
	        int _a_size = 0;
	        _a_size = Integer.parseInt(in.nextLine());
	        int[] _a = new int[_a_size];
	        int _a_item;
	        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
	            _a_item = Integer.parseInt(in.nextLine());
	            _a[_a_i] = _a_item;
	        }
	        
	        res = maxDifference(_a);
	        bw.write(String.valueOf(res));
	        bw.newLine();
	        
	        bw.close();*/
	    }
	
}
