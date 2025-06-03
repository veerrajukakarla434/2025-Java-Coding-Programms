package com.JavaCodingProblems.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 */
public class P0001LeftRotation {
	
	// you may get this problem in two ways
	// 1 direct array input OR 2 List input both are arrays

	public static void main(String[] args) {

		int[] intArray = { 1, 2, 3, 4, 5, 6 };

		// Convert int array to List<Integer> using streams
       List<Integer> integerList = Arrays.stream(intArray).boxed().collect(Collectors.toList());
       
       // List<Integer> integerList = Arrays.asList(intArray);
       
        System.out.println("Left Rorate with "+ 3);
        rotLeftInteger(integerList, 3); // calling List<Integer>
        System.out.println();
        System.out.println("Left Rorate with "+ 4);
		rotLeftInt(intArray, 4); // int[]
		System.out.println();
		System.out.println("Completed");

	}
	
	public static List<Integer> rotLeftInteger(List<Integer> a, int d) {
		
		int n = a.size();
        List<Integer> rotated = new ArrayList<>(n); 
        for (int i = 0; i < n; i++) {
            rotated.add(a.get((i + d) % n));
        }
        
        for (Integer element : rotated) {
           
            System.out.print(element + " ");
        }
        
        return rotated;
		
	}
	
	
	public static int[] rotLeftInt(int[] original, int shift) {
		
		int[] reordered = new int[original.length];
		
		for (int i = 0; i < original.length; i++) {
			
			reordered[i] = original[(shift + i) % original.length];
		}

		for (int a : reordered) {
			System.out.print(a + " ");
		}

		return reordered;
	}
	

}
