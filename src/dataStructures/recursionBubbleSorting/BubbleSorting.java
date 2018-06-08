package dataStructures.recursionBubbleSorting;

public class BubbleSorting {

	// iterative method
		public static int[] sort(int[] inputArray) {

			int num = inputArray.length;

			for (int j = 1; j < num; j++) {

				for (int i = 1; i < num; i++) {

					int temp = 0;

					if (inputArray[i - 1] > inputArray[i]) {

						temp = inputArray[i - 1];

						inputArray[i - 1] = inputArray[i];
						inputArray[i] = temp;

					} else {

						// nothing
					}
				}
			}

			return inputArray;

		}
		
		
		private static void print(int[] ary) {
			for (int i = 0, len = ary.length; i < len; i++) {
				System.out.print(ary[i]);
				System.out.print(", ");
			}
			System.out.println();
		}
			
		// recursive method
		public static int [] sortRecursive (int [] putArray, int i, int j) {
			if (j == 1) {
				return putArray;
			}
			
			if(i==1) {
				
				
				j = j -1;
				i = j;
				
							
				if(j==1) {
					return putArray;
				}
				
				System.out.println("----");
				sortRecursive(putArray, putArray.length, j);
			}
			
			if(i>0) {
									
				if(putArray[i - 2] > putArray[i-1]) {				
					
					int temp = putArray[i-1];
					
					putArray[i-1] = putArray[i-2];
					putArray[i-2] = temp;
																	
				}
				print(putArray);
				sortRecursive(putArray, i-1, j);
						
																				
			}
			
			return putArray;			
		}
	
}
