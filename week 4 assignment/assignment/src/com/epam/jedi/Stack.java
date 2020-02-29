package com.epam.jedi;

import java.util.EmptyStackException;

//stack implementation using array and reversal
public class Stack {
	private static int size;
	private static int stackArray[];
	private static int top;

	public static void createStack(int stackSize) {
		size = stackSize;
		stackArray = new int[size];
		top = -1;
		System.out.println("stack created successfully");
	}

	public static void push(int item) throws StackOverflowError {
		if (top == size - 1) {
			throw new StackOverflowError();
		} else {
			top++;
			stackArray[top] = item;
		}
	}

	public static int pop() {
		if (top == -1) {
			throw new EmptyStackException();
		} else {
			int num = stackArray[top];
			stackArray[top] = 0;
			top--;
			return num;
		}
	}

	public static int peak() {
		if (top == -1) {
			throw new EmptyStackException();
		} else {
			return stackArray[top];
		}
	}

	public static boolean isEmpty() {
		if (top == -1)
			return true;
		return false;
	}

	public static void printStack() {
		for (int i : stackArray)
			System.out.print(i);
		System.out.println();
	}

	public static void reverse() {
		if (top == -1)
			return;
		int item = pop();
		reverse();
		insertBack(item);
	}

	public static void insertBack(int item) {
		if (top == -1)
			push(item);
		else {
			int num = pop();
			insertBack(item);
			push(num);

		}
	}
}
