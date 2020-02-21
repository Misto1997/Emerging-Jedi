package test;

import java.util.Scanner;

//Find the maximum (or minimum) element in an array using recursion.  
public class LargestSmallestNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int ar[] = new int[size];
		for (int counter = 0; counter < size; counter++) {
			ar[counter] = input.nextInt();
		}
		System.out.println("smallest number = " + smallestNum(ar, size));
		System.out.println("largest number = " + largestNum(ar, size));
		input.close();
	}

	private static int largestNum(int[] ar, int size) {
		if (size == 1)
			return ar[0];
		return Math.max(ar[size - 1], largestNum(ar, size - 1));
	}

	private static int smallestNum(int[] ar, int size) {
		if (size == 1)
			return ar[0];
		return Math.min(ar[size - 1], smallestNum(ar, size - 1));
	}
}
