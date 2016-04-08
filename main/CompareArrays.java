package main;

import java.util.ArrayList;
import java.util.List;

public class CompareArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] one = {2,5,5,7,7,8};
		int[] two = {2,5,5,5,7,7,8,9,10,11};
		
		List<Integer> result = new ArrayList<Integer>();
		
		getCommonItems(one,two, 0, 0, result);
	}
	

	
	public static void getCommonItems (int[] arrayOne, int[] arrayTwo, int arrayOneLow, int arrayTwoLow, List<Integer> result){
		
		// Check A1 length
		if (!(arrayTwoLow < arrayOne.length)) {
			System.out.println("EXIT A1 Lenght:" + arrayTwoLow);
			System.out.println(result);
		}
		
		// Check A2 length
		else if (!(arrayTwoLow < arrayTwo.length)) {
			System.out.println("EXIT A2 lengh:" + arrayTwoLow );
			getCommonItems(arrayOne, arrayTwo, arrayOneLow + 1, arrayTwoLow, result);
		}
		
		else if (arrayOne[arrayOneLow] == arrayTwo[arrayTwoLow]) {
			
			System.out.println("COMMON " + arrayOneLow +  " " + arrayTwoLow);
			
			result.add(arrayOne[arrayOneLow]);
			getCommonItems(arrayOne, arrayTwo, arrayOneLow + 1, arrayTwoLow + 1, result);
		
		} else if (arrayOne[arrayOneLow] > arrayTwo[arrayTwoLow])
			getCommonItems(arrayOne, arrayTwo, arrayOneLow, arrayTwoLow + 1, result);		

	}
}

