package test;

import java.util.Scanner;

public class ReverseDoublyLinkedList {

	static class Node {
		public int data;
		public Node next;
		public Node prev;

		public Node(int data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}

	static class DoublyLinkedList {
		public Node head;
		public Node tail;

		public DoublyLinkedList() {
			this.head = null;
			this.tail = null;
		}

		public void insertNode(int data) {
			Node node = new Node(data);

			if (this.head == null) {
				this.head = node;
			} else {
				this.tail.next = node;
				node.prev = this.tail;
			}

			this.tail = node;
		}
	}

	static Node reverseList(Node head) {
		Node temp = head.next;
		head.next = head.prev;
		head.prev = temp;
		if (temp == null)
			return head;
		else
			return reverseList(temp);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DoublyLinkedList list = new DoublyLinkedList();

		int listNodesCount = scanner.nextInt();
		for (int i = 0; i < listNodesCount; i++) {
			int data = scanner.nextInt();
			list.insertNode(data);
		}

		Node reverseList = reverseList(list.head);
		System.out.print("null<-");
		while (reverseList != null) {
			System.out.print(reverseList.data + "<->");
			reverseList = reverseList.next;
		}
		System.out.println("null");
		scanner.close();
	}

}
