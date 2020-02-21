import java.util.Scanner;

class LinkedList {
	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
}

public class RemoveLoop {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		LinkedList.head = new LinkedList.Node(1);
		LinkedList.head.next = new LinkedList.Node(2);
		LinkedList.head.next.next = new LinkedList.Node(3);
		LinkedList.head.next.next.next = new LinkedList.Node(4);
		LinkedList.head.next.next.next.next = new LinkedList.Node(5);
		LinkedList.head.next.next.next.next.next = LinkedList.head.next;
		removeLoop(LinkedList.head);
		while (LinkedList.head != null) {
			System.out.print(LinkedList.head.data + "->");
			LinkedList.head = LinkedList.head.next;
		}
		System.out.println("null");
		input.close();
	}

	private static void removeLoop(LinkedList.Node head) {
		if (head == null)
			return;
		LinkedList.Node slow = head.next, fast = head.next.next;
		while (fast != null) {
			if (slow == fast)
				break;
			slow = slow.next;
			fast = fast.next.next;
		}
		if (slow == fast) {
			slow = head;
			while (slow.next != fast.next) {
				slow = slow.next;
				fast = fast.next;

			}
			fast.next = null;
		}
	}

}
