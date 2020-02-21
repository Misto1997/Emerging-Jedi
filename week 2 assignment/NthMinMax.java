package test;

import java.util.Arrays;
import java.util.Scanner;

//Program to find the nth minimum (or maximum) element of an array.
public class NthMinMax {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int ar[] = new int[size];
		for (int counter = 0; counter < size; counter++) {
			ar[counter] = input.nextInt();
		}
		int n = input.nextInt();
		Arrays.parallelSort(ar);
		System.out.println("nth smallest = " + ar[n - 1]);
		System.out.println("nth largest = " + ar[size - n]);
		input.close();
	}

}
