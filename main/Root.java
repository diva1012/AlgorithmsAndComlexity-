package main;

public class Root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = -16;
		
		findSecondRoot(n);

	}
	
	public static int findSecondRoot(int number) {
		
		for (int i = 0; i * i  < number ; i++){ 
			
			System.out.println(i);
			
			if(i*i == number) {
				System.out.println("The root is : " + i);
				return i; 
			} 
		}
		System.out.println("No answer");
		return -1; 

	}

}
