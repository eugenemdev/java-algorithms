package dataStructures.recursionBubbleSorting;

public class getSumRecursion {

	public static int sum(int num) {
		if (num == 1) {
			return 1;
		}		
		if (num > 0) {
			// sum(num - 1);
			
			int a = sum(num - 1) + sum(num - 2);
			return a;
		}
		
		return 0;
	}
	
	public static int fact(int num) {
		int out;
		
		if(num==1) {
			return 1;
		}
		
		out = fact(num-1) * num;
		
		return out;
	}
	

}
