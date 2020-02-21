package test;

import java.util.Arrays;
import java.util.Scanner;

//Reverse an array. 
public class ArrayReverse {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int temp;
		int ar[] = new int[size];
		for (int counter = 0; counter < size; counter++) {
			ar[counter] = input.nextInt();
		}
		for (int counter = 0; counter < size / 2; counter++) {
			temp = ar[counter];
			ar[counter] = ar[size - 1 - counter];
			ar[size - 1 - counter] = temp;
		}
		System.out.print(Arrays.toString(ar));
		input.close();
	}

}
