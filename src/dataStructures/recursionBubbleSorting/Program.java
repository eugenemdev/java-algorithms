package dataStructures.recursionBubbleSorting;

import java.util.Arrays;

public class Program {

	/*
	 * Aufgabe: Erstellen Sie eine Methode, die die folgende Zahlenfolge abbildet:
	 * 
	 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
	 * 
	 * CalcSum(0) -> 0
	 * CalcSum(1) -> 1
	 * CalcSum(2) -> 1
	 * CalcSum(3) -> 2
	 * CalcSum(4) -> 3
	 * CalcSum(5) -> 5
	 * CalcSum(6) -> 8
	 * CalcSum(7) -> 13
	 * CalcSum(8) -> 21
	 * CalcSum(9) -> 34
	 * 
	 * */
	
	
	//iteration  method
	private static int[] CalcSum (int num ) {
		
		//declare new array
		int[] calcSumArray = new int[num];		
		

		calcSumArray[0] = 0;
		calcSumArray[1] = 1 ; 
		
		//put to the array our values
		for (int i=2; i<num; i++) {
			calcSumArray[i] = calcSumArray[i-1] + calcSumArray[i-2];
		}
		
		//return to main
		return calcSumArray;
		
	}
	
	//iteration  method
	private static int CalcSum2(int num) {
		
		int s0 = 0;
		int s1 = 1;
		
		if (num == 0) {
			return s0;
		}
		if (num == 1) {
			return s1;
		}
		
		//put to the array our values
		for (int i=2; i <= num; i++) {
			int temp = s1 + s0;
			s0 = s1;
			s1 = temp;
		}
		
		//return to main
		return s1;
	}
	
	/*
	 * recursive method
	 */
	
	private static int CalcSumRecursion (int num) {
				
		int sum = 0;
		int s0 = 0;
		int s1 = 1;
				
		if (num>1) {
			for (int c=1; c<num; c++) {
				sum = s1 + s0;
				
				s0 = s1;
				s1=sum;									
			}
			
			System.out.println(num +"    "+sum);			
			CalcSumRecursion(num - 1);									
			
		} else if(num==1) {
						
			System.out.println(num +"    "+s1);			
			CalcSumRecursion(num - 1);
		
		} else {
		
			System.out.println(num +"    "+s0);
		}
		
		return 0;
	}

	
	/*
	 * Aufgabe: Erstellen Sie eine Methode, die die folgende Zahlenfolge abbildet:  
	 * 
	 * 0, 1, 3, 6, 10, 15, 21, 28  
	 * 
	 * Sum(0) -> 0
	 * Sum(1) -> 1
	 * Sum(2) -> 3
	 * Sum(3) -> 6
	 * Sum(4) -> 10
	 * Sum(5) -> 15
	 * Sum(6) -> 21
	 * Sum(7) -> 28 
	 * 
	 */
	

	private static int Sum(int n) {
		if (n < 0) {
			return -1;
		}
		
		int sum = 0;
		
		for (int i = 0; i <= n; i++) {
			sum = sum + i;
		}
		
		return sum;
	}
	
	
	
	
	
		
	
	public static void main (String [] args) {
		
		int lastSum = 0;
		
		for (int i = 0; i <= 10 ; i++) {			
			//System.out.println("Sum(" + i + "): " + Sum(i) + "        last sum: " + lastSum);
			
			
			lastSum = lastSum + i;
			System.out.println("Sum(" + i + "): " + lastSum);
			
		}
		System.out.println("-------------------------------");
		
			
		
		//declare and call our method
		int a = 15;						
		int [] outputArray = CalcSum(a);
		
		//print array
		for(int b=0; b<outputArray.length; b++) {
			System.out.println( " i: " + b + "  Sum is:" + outputArray[b]);
		}
		
		
		System.out.println("-------------------------------");
	
		for (int i = 0; i <= 15; i++) {
			System.out.println(CalcSum2(i));
		}
		
		System.out.println("-------------------------------");
		//recursion
		CalcSumRecursion(12);
		
		
		System.out.println("-------------------------------");
		for (int i=0; i<=15; i++) {
			System.out.println("number: " + i + "  sum: "+ getSumRecursion.sum(i));
		}
		
		System.out.println("-------------------------------");
		int c = 5;
		System.out.println("number: " + c + "  sum: "+ getSumRecursion.fact(c));
		
		
		System.out.println("-------------------------------");
		
		int [] inputArray = { 5, 0, 3, -1, 10, 12, 5, 9, 44};
		int [] inputArrayforRecursive = { 5, 0, 3, -1, 10, 12, 5, 9, 44};
		// inputArrayforRecursive = new int[]{ 4, 3, 2, 1, 0 }; 
	
		
		System.out.println(" input: " + Arrays.toString(inputArray));
		System.out.println("output: "+ Arrays.toString(BubbleSorting.sort(inputArray)));	
		System.out.println("-------------------------------");
		System.out.println(" input: " + Arrays.toString(inputArrayforRecursive));
		System.out.println("output: "+ Arrays.toString(BubbleSorting.sortRecursive(inputArrayforRecursive , inputArrayforRecursive.length, inputArrayforRecursive.length)));		
		
	}
	
}
