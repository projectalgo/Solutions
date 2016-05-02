import static org.junit.Assert.*;

import org.junit.Test;


public class SolutionTest {

	@Test
	public void testNormalInput1() {
		
		int diff= Solution.maxDifference(new int[]{7,9,5,6,3,2});
		assertEquals(2, diff);
	}
	@Test
	public void testNormulInput2() {
		
		int diff= Solution.maxDifference(new int[]{7,2,10,5,6,3,-1,11});
		assertEquals(12, diff);
	}
	@Test
	public void testNegInput() {
		
		int diff= Solution.maxDifference(new int[]{-13,-12,1,-9,-7,1});
		assertEquals(14, diff);
	}
	
	@Test
	public void testAllPositives(){
		int a[]={1,3,4,5};
		assertEquals(13, MaxSumSubArray.kanadesSolution(a));
		assertEquals(13, MaxSumSubArray.maxSubArray(a));
		assertEquals(13, MaxSumSubArray.recursiveKanadeSol(a,3,Integer.MIN_VALUE));
	}
	
	@Test
	public void testAllNegatives(){
		int a[]={-1,-9,-3,-4,-5};
		assertEquals(-1, MaxSumSubArray.kanadesSolution(a));
		assertEquals(-1, MaxSumSubArray.maxSubArray(a));
		assertEquals(-1, MaxSumSubArray.recursiveKanadeSol(a,4,Integer.MIN_VALUE));
	}

	@Test
	public void testMixNumbers(){
		int a[]={-1,-2,3,4,-5,6};
		assertEquals(8, MaxSumSubArray.kanadesSolution(a));
		assertEquals(8, MaxSumSubArray.maxSubArray(a));
		assertEquals(8, MaxSumSubArray.recursiveKanadeSol(a,5,Integer.MIN_VALUE));
	}

}
