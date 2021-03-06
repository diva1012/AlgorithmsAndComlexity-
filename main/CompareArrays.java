package main;

import java.util.ArrayList;
import java.util.List;

public class CompareArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] two = {2,3,4,5,5,5,5,5,5,5,5,5,5,5,7,7,8,9,9};
		int[] one = {2,5,5,7,7,7,7,8,9,9,10,11};
		
		List<Integer> result = new ArrayList<Integer>();
		
		getCommonItems(one,two, 0, 0, result);
	}
	
	
	public static void getCommonItems (int[] arrayOne, int[] arrayTwo, int arrayOneLow, int arrayTwoLow, List<Integer> result){
		
		// Check A1 length
		if ( !(arrayOneLow < arrayOne.length) || !(arrayTwoLow < arrayTwo.length) ) {
			System.out.println("EXIT Lenght:" + arrayTwoLow);
			System.out.println(result);
		}
		
		// Check if the current numbers in both arrays are common
		else if (arrayOne[arrayOneLow] == arrayTwo[arrayTwoLow]) {
			System.out.println("COMMON " + arrayOneLow +  " " + arrayTwoLow);
			result.add(arrayOne[arrayOneLow]);
			getCommonItems(arrayOne, arrayTwo, arrayOneLow + 1, arrayTwoLow + 1, result);
		
		// If arrayOne number is bigger than arrayTwo number go to next arrayTwo number
		} else if (arrayOne[arrayOneLow] > arrayTwo[arrayTwoLow]) {
			getCommonItems(arrayOne, arrayTwo, arrayOneLow, arrayTwoLow + 1, result);		
		
		} else 
			// in all other cases go to the next arrayOne element so you can arrive to the end of the algorithm at some point
			getCommonItems(arrayOne, arrayTwo, arrayOneLow + 1, arrayTwoLow, result);	

	}
}

