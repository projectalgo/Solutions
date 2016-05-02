import java.util.Scanner;

public class MaxSumSubArray{
	//Linear solution. For each element find the max sum ending with that element.
	//In each iteration, we update max_ending_here, depedning on its previous value. 
	//If its positive add to the current elemnt,
	//if its negative, we update max_ending_here if a[i] is greater than max_ending here. 
	//For example -2,-1 or -2,3. We will not update if its -1,-2 
	public static int kanadesSolution(int[] a)
	{
		if(a.length==0)
		{
			return Integer.MIN_VALUE;
		}
		int max_so_far=a[0];
		int max_ending_here=a[0];
		int start=0;
		int end=0;
		for(int i=1; i<a.length; i++)
		{
			
			if(max_ending_here<0)
			{
				if(max_ending_here<=a[i])
				{
					max_ending_here=a[i];
					
					start = i;
					end=i;
				}
				
			}
			else
			{
                
				max_ending_here+=a[i];
				
			}
			if(max_ending_here>max_so_far)
			{
			  end=i;
			  max_so_far=max_ending_here;
			}
		}
		return max_so_far;
	}
	
	public static int recursiveKanadeSol(int[] a, int index, int max_so_far)
	{
		if(index == 0)
			return a[index];
		else
		{
			
		  int d = recursiveKanadeSol(a,index-1,max_so_far);
		  if(d<0)
		  {
			  if(d<a[index])
				  d=a[index];
		  }
		  
		  else{
		  
			  d = d+a[index];
		  }
		  if(d>max_so_far)
			  max_so_far=d;
		  return d;
			  
		}
	}
	//Foreach element look for maximum sum possible with it when you add elements on its right.Its n^2 brute force solution.
	public static int maxSubArray(int[] a)
	{
		if(a.length==0)
		{
			return Integer.MIN_VALUE;
		}
		int finalMaxSum = a[0];

		for(int i=0; i<a.length; i++)
		{
			int maxSum = a[i];
			int sum = a[i];
			int startIndex = i;
			int endIndex = i;
			for(int j = i+1; j<a.length; j++)
			{

				sum+= a[j];
				if(maxSum<=sum)
				{
					endIndex = j; 
					maxSum = sum;
				}
			}
			if(finalMaxSum < maxSum)
			{
				finalMaxSum = maxSum;
			}
		}
		return finalMaxSum;

	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numTests = 0;
		if(s.hasNext())
		{
			numTests = Integer.parseInt(s.next());
			for(int tc=0; tc<numTests; tc++)
			{
				int length = Integer.parseInt(s.next());
				int[] a = new int[length];
				for(int i=0; i<length ;i++)
				{
					a[i] = Integer.parseInt(s.next());
				}
				System.out.println(MaxSumSubArray.maxSubArray(a));
				System.out.println(MaxSumSubArray.kanadesSolution(a));
			}
		}


	}
}
