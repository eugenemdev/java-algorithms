package dataStructures.singlyLinkedList;

public class SinglyLinkedListNode {
	
	public int value;
	public SinglyLinkedListNode next;
	
	
	//set value for Node
	public void setValue(int value){
		this.value = value;
	}
	
	//get value for Node 
	public int  getValue() {				
		return this.value;
	}
	
	//set next for Node
	public void setNext( SinglyLinkedListNode nextNode) {
		this.next = nextNode;
	}
	
	//get next
	public SinglyLinkedListNode getNext() {
		return this.next;
	}
		
	
	
	public int length(){
		
		SinglyLinkedListNode a = this;
		
		int length= 1;
		
		while(a.next != null) {
			length++;
			a = a.next;
		}																							
		return length;
				
	}
	
	//push method ()
	public SinglyLinkedListNode push(int value) {
		
		SinglyLinkedListNode a = this;
		SinglyLinkedListNode b = new SinglyLinkedListNode();
		SinglyLinkedListNode c = new SinglyLinkedListNode();
		
		c.setValue(value);
		c.setNext(null);
		
		b.setValue(a.getValue());
		b.setNext(a.getNext());
		

		while(a.getNext()!=null) {
			a = a.getNext();
		}
		
		if(a.getNext()==null) {			
			
			a.setNext(c);
			
		}				
	
		return b;
	}
	
	
	//pop method (output last element)
	public int pop() {
		
		SinglyLinkedListNode a = this;
				
		while(a.getNext()!=null) {
			a = a.getNext();
		}
		return a.getValue();
	}
	
	
	
	public int  shift() {
		
		SinglyLinkedListNode a = this;
		int value = this.value;
		
		//remove first element from Object
		a.value = this.next.value;
		a.next = this.next.next;
		
		return value;
	}
	
		
	//unshift method
	public SinglyLinkedListNode unshift(int value) {
		
		SinglyLinkedListNode a = new SinglyLinkedListNode();
				
		a.setNext(this);
		a.setValue(value);		
						
		return a;
	}
	
	
	//reverse method
	public SinglyLinkedListNode  reverse() {
		
		SinglyLinkedListNode a = this;		
		SinglyLinkedListNode b = new SinglyLinkedListNode();						
				
		b.setValue(a.shift());						
		
		while(a.getNext()!=null) {
									
			a  = a.getNext();									
			b = b.unshift(a.getValue());
		}						
				
		return b;
	}
	

	
	//print objects
	@Override
	public String toString() {

		String output = "";

		int key = 0;

		SinglyLinkedListNode a = this;

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
