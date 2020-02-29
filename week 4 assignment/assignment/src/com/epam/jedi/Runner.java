package com.epam.jedi;

import java.util.Scanner;

// uncomment the method you want to use
public class Runner {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		stackImplementation(input);

	}

	private static void stackImplementation(Scanner input) {
		int stackSize = input.nextInt();
		Stack.createStack(stackSize);// stack creation
		Stack.push(1); // push element
		Stack.push(2);
		Stack.push(3);
		System.out.println(Stack.peak());// getting peak element
		Stack.printStack();
		Stack.reverse();
		Stack.printStack();
		System.out.println(Stack.isEmpty()); // is empty or not
		System.out.println(Stack.pop()); // pop element
		System.out.println(Stack.pop());
		System.out.println(Stack.pop());
		// System.out.println(Stack.pop());
		System.out.println(Stack.isEmpty());
		Stack.printStack();
		input.close();

	}

}
