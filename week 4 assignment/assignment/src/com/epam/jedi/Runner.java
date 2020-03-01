package com.epam.jedi;

import java.util.Scanner;

// uncomment the method you want to use
public class Runner {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// stackImplementation(input);
		queueImplementation(input);

	}

	private static void queueImplementation(Scanner input) {
		int queueSize = input.nextInt();
		Queue.createQueue(queueSize);
		Queue.enque(1);
		Queue.enque(2);
		Queue.enque(3);
		System.out.println(Queue.peak());
		Queue.printQueue();
		Queue.reverse();
		Queue.printQueue();
		System.out.println(Queue.isEmpty());
		Queue.deque();
		Queue.deque();
		Queue.deque();
		System.out.println(Queue.isEmpty());
		Queue.printQueue();

	}

	private static void stackImplementation(Scanner input) {
		int stackSize = input.nextInt();
		Stack.createStack(stackSize);
		Stack.push(1);
		Stack.push(2);
		Stack.push(3);
		System.out.println(Stack.peak());
		Stack.printStack();
		Stack.reverse();
		Stack.printStack();
		System.out.println(Stack.isEmpty());
		System.out.println(Stack.pop());
		System.out.println(Stack.pop());
		System.out.println(Stack.pop());
		System.out.println(Stack.isEmpty());
		Stack.printStack();
		input.close();

	}

}
