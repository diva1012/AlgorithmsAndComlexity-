package main;

public class Assingment1_3 {

	public static void main(String[] args) {

		int[] array = {-11, -3, -1, 0, 3, 5, 7, 8, 10, 12, 15, 16, 17}; 
		
		System.out.println("Array length: " + array.length);
		System.out.print(findElement(array, 0, array.length - 1));

	}
	
	public static boolean findElement ( int[] array, int start, int end ) {
		
		System.out.println("The array to check is: ");
		System.out.println("START: " + start);
		System.out.println("END: " + end);
		for (int i = start; i <= end; i++) {
			System.out.print(" ");
			System.out.println("I" + i + ": " + array[i]);
		}
		System.out.println();
		
		
		if( end - start < 0 ) {
			System.out.println("No elements left");
			return false;
		}
		
		int mid = start + (end - start) / 2;
		
		if (array[mid] == mid) {
			System.out.println(mid + " = " + array[mid]);
			return true;
		}
		
		else if (array[mid] < mid) {
			// check right side
			System.out.println("CHECK RIGHT");
			return findElement(array, mid + 1, end);
			
		} else { 
			// check left side
			System.out.println("CHECK LEFT");
			return findElement(array, start, mid -1);
		}
	}

}
