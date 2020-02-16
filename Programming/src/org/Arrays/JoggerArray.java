package org.Arrays;

import java.util.Scanner;

public class JoggerArray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int arr[][]=new int[3][4];
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				
				System.out.println("Enter the value");
				int val=scan.nextInt();
				arr[i][j]=val;
				
			}
			
		}
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				
				
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
	}

}
