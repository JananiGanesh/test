package com.greatlearning.dsa.floorconstruction;

import java.util.Scanner;

public class FloorConstructionDriver {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			FloorConstruction obj1=new FloorConstruction();
			System.out.println("Enter the total number of floors in a building");
			int N=sc.nextInt();
			int []floor=new int[N];
			for(int i=0;i<N;i++) {
				System.out.println("Enter the floor size given on day "+(i+1));
				floor[i]=sc.nextInt();
			}
			System.out.println();
			obj1.orderOfConstruction(floor);
			sc.close();
		}
	}

}
