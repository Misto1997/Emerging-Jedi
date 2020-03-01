package com.epam.jedi;

import java.util.EmptyStackException;

public class Queue {
	private static int size;
	private static int queueArray[];
	private static int front;
	private static int rear;

	public static void createQueue(int queueSize) {
		size = queueSize;
		queueArray = new int[size];
		front = rear = -1;
		System.out.println("queue created successfully");
	}

	public static void enque(int item) {
		if (rear == size - 1) {
			throw new StackOverflowError();
		} else {
			rear++;
			queueArray[rear] = item;
			if (front == -1)
				front++;
		}
	}

	public static int deque() {
		if (front == -1) {
			throw new EmptyStackException();
		} else {
			int num = queueArray[front];
			queueArray[front] = 0;
			if (front == rear)
				front = rear = -1;
			else
				front++;
			return num;
		}
	}

	public static int peak() {
		if (front == -1) {
			throw new EmptyStackException();
		} else {
			return queueArray[front];
		}
	}

	public static boolean isEmpty() {
		if (front == -1)
			return true;
		return false;
	}

	public static void printQueue() {
		if (front == -1)
			System.out.println("[]");
		else
			for (int i = front; i <= rear; i++)
				System.out.print(queueArray[i]);
		System.out.println();
	}

	public static void reverse() {
		if (front == -1)
			return;
		int item = deque();
		reverse();
		enque(item);

	}

}
