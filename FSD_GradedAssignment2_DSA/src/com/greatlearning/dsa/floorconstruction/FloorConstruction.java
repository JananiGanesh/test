package com.greatlearning.dsa.floorconstruction;

import java.util.Collections;
import java.util.PriorityQueue;

public class FloorConstruction {

	public  void orderOfConstruction(int[] floor) {
		
		PriorityQueue <Integer> que = new PriorityQueue <Integer> ( Collections.reverseOrder());
		
		PriorityQueue <Integer> que1 = new PriorityQueue <Integer> ( Collections.reverseOrder());
		
		for(int i=0;i<floor.length;i++) {
			que.add(floor[i]);
		}
		for(int i=0;i<floor.length;i++) {
			if(floor[i]==que.peek()) {
				System.out.println("Day: "+ (i+1));

				System.out.print(que.remove() +" ");
				while(!que1.isEmpty() ) {
					int x=que.peek();
					if( x==que1.peek()) {
						System.out.print(que1.remove() +" ");
						que.remove();
					}
					else {
						break;
					}
				}
				System.out.println();
			}
			else {
				System.out.println("Day: "+ (i+1));
				System.out.println(" ");
				que1.add(floor[i]);
				System.out.println();

			}
		}
	}

}
