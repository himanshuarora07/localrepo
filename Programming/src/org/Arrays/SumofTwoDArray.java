package org.Arrays;

public class SumofTwoDArray {
	
	public static void main(String[] args) {
		int mat1_r=3;   int mat1_c=2;
		
		int mat2_r=3;   int mat2_c=2;
		
		
		int mat1[][]=new int[mat1_r][mat1_c];
		
		int mat2[][]=new int[mat2_r][mat2_c];
		
		
		int mat3[][]=new int[mat1_r][mat2_c];
		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat1[i].length; j++) {
				
				
				mat3[i][j]=mat1[i][j]+mat2[i][j];
				
			}
			
			
		}
	}

}
