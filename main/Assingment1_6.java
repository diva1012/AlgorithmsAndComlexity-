package main;

import java.util.Arrays;

public class Assingment1_6 {

	public static void main(String[] args) {

		double[] x1y = {4.0/32, 2.0/32, 2.0/32, 8.0/32};
		double[] x2y = {2.0/32, 4.0/32, 2.0/32, 0.0/32};
		double[] x3y = {1.0/32, 1.0/32, 2.0/32, 0.0/32};
		double[] x4y = {1.0/32, 1.0/32, 2.0/32, 0.0/32};
		
		double [][] xyDistribution = {x1y, x2y, x3y, x4y};
		
		System.out.println(calculateMutualInformation(x1y, x2y, xyDistribution));

	}
	
	public static double calculateMutualInformation(double [] xValues, double[] yValues, double[][] xYDistribution){
		
		// Calculate the marginal distribution of X and Y 
		double[] margX = new double[xYDistribution.length];
		double[] margY = new double[xYDistribution[0].length];
		for (int i = 0; i<xYDistribution.length; i++){

		    for (int j = 0; j<xYDistribution[i].length; j++){
		    	margX[i] += xYDistribution[i][j];
		    	margY[j] += xYDistribution[i][j];
		    }
		}
		
		System.out.println(Arrays.toString(margX));
		System.out.println(Arrays.toString(margY));
		
		
		double mi = 0.0;
		for (int i = 0; i<xYDistribution.length; i++){

			for (int j = 0; j<xYDistribution[i].length; j++){

				double joinDistrXY = xYDistribution[i][j];
				double margDistrX = margX[i];
				double margDistrY = margY[j];
				
				System.out.println("JOIN: " + joinDistrXY + " MarX: " + margDistrX + " MarY: " + margDistrY);
				
				double calc = 0.0;
				// Check if the join distriburion is equal to 0
				if (joinDistrXY != 0) {
					calc = joinDistrXY * Math.log( joinDistrXY / ( margDistrX * margDistrY) );
				}
		    	
				mi += calc;
		    } 
		}
		
		return mi;
		
	}

}
