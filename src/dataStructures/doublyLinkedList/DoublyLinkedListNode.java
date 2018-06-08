package dataStructures.doublyLinkedList;

public class DoublyLinkedListNode {

	public int value;
	public DoublyLinkedListNode next;
	public DoublyLinkedListNode prev;

	public int getValue() {
		return this.value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	// set next for Node
	public void setNext(DoublyLinkedListNode nextNode) {
		this.next = nextNode;
	}

	public void setPrev(DoublyLinkedListNode prevNode) {
		this.prev = prevNode;
	}

	// get next
	public DoublyLinkedListNode getNext() {
		return this.next;
	}

	// get previous
	public DoublyLinkedListNode getPrev() {
		return this.prev;
	}

	// print objects
	@Override
	public String toString() {

		String output = "";

		int key = 0;

		DoublyLinkedListNode a = this;

		output = "{" + a.getValue() + ",";

		while (a.next != null) {

			a = a.next;
			key++;
			
			output = output + "{" + a.value + ",";

		}

		output = output + "null";

		if (a.next == null) {
			for (int i = 0; i <= key; i++) {
				output = output + "}";
			}
		}
						

		return output;
	}
}
