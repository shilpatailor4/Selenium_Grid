package com.java.Array;

public class ArrayExample {

	public static void main(String[] args) {
		
		/*int[] age = {12, 10, 3, 4, 8};
		
		for(int i=0; i<5; i++) {
		
		System.out.println("Element at index:" + " " +i+ " - " + age[i]);
			*/
		
		//How to access array elements
		int[] age = new int[5];
		
		//insert third element
		age[2] = 24;
		
		//insert fifth element
		age[4] = 20;
		
		for(int i = 0; i < 5; ++i) {
			
			System.out.println("Element at index" + " " + i + " " +":"+" " +age[i]);

		}
	}

}
