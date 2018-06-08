package dataStructures.singlyLinkedList;


public class SinglyLinkedList {
	private SinglyLinkedListNode root;
	
	public int length(){
		
		SinglyLinkedListNode a = root;
		if (root == null) {
			return 0;
		}
		
		int length= 1;
		
		while(a.next != null) {
			length++;
			a = a.next;
		}																							
		return length;
	}
	
private int get(int index) {
		
		SinglyLinkedListNode a = root;
		
		int c = 0; 
		
		int counter = 0;
		
		while (a != null) {			
			if(counter == index) {				
								
				c = a.value;
			}
			counter++;
			a = a.next;
		}
				
		return c;
	}
	
	
	private SinglyLinkedList set(int index, int value) {
		
		SinglyLinkedListNode a = root;
		
		int counter = 0;
		
		while (a != null) {			
			
			if(counter == index) {				
				
				a.value = value;
			}
			
			counter++;
			a = a.next;
		}
		
		a = root;
				
		return this;
	}
	
	
	public int push(int value) {
				
		SinglyLinkedListNode b = new SinglyLinkedListNode();
		
		b.value =value;
		
		if (root != null) {
			SinglyLinkedListNode curNode = root;
			while(curNode.next!=null) {
				curNode = curNode.next;
			}

			curNode.next = b;
		} else {
			
			root = b;
		}		
		
		return length();
			
	}
	
	
	//push method ()
		public int _push(int value) {
			
			SinglyLinkedListNode a = root;
			
			SinglyLinkedListNode b = new SinglyLinkedListNode();
			SinglyLinkedListNode c = new SinglyLinkedListNode();
			
			c.value =value;
			c.setNext(null);
			
			if(root!=null) {
				
				b.setValue(a.getValue());
				b.setNext(a.getNext());
				

				while(a.next!=null) {
					a = a.next;
				}
				
				if(a.next==null) {			
					
					a.next=c;
					
				}				

			}else {
				
				b.setValue(value);
				b.setNext(null);
				
				root = b;
				
			}
			
			return length();
	}
		
	
	public int pop() {
		
		SinglyLinkedListNode a = root;
				
		while(a.next!=null) {
			a = a.next;
		}
		return a.value;
	}
	
	/**
	 * 
	 * @return 
	 */
	
	public int  shift() {
		
		SinglyLinkedListNode a = root;
		int value = root.value;
		
		a.value = root.next.value;
		a.next = root.next.next;
		
		return value;
	}
	
	/**
	 * unshift method
	 */
	
	public int unshift(int value) {
		
		SinglyLinkedListNode a = new SinglyLinkedListNode();
				
		a.setNext(root);
		a.setValue(value);
		
		root = a;				
						
		return length();
	}
	
	/*
	 *reverse methode 
	 */
	
	public SinglyLinkedList reverse() {

		SinglyLinkedListNode b = new SinglyLinkedListNode();

		b.value = root.value;

		while (root.next != null) {
			
			root = root.next;
			b = b.unshift(root.value);
		}
		
		root = b;

		return this;
	}
	
	
	public SinglyLinkedList _sort() {
		
		SinglyLinkedListNode a = root;
		SinglyLinkedListNode c = new SinglyLinkedListNode();
		SinglyLinkedListNode b = new SinglyLinkedListNode();

		b.value = a.value;

		while (a != null) {
			if (b.value != 0) {

				if (b.value > a.value) {

					if (c.value == 0) {
						
						c.value = a.value;											
						
					} else {
						
						c.push(a.value);
					}
				} else {
					// else
				}
			}

			a = a.next;
		}

		c.push(b.value);
		
		root = c;
				

		return this;
	}

	
	
	public SinglyLinkedList sort() {
	
		int num = this.length();

		for (int j = 1; j < num; j++) {

			for (int i = 1; i < num; i++) {

				int temp = 0;
				
				
				if ( this.get(i -1) > this.get(i)) {

					temp = this.get(i - 1);

					this.set(i - 1, this.get(i));
										
					this.set(i, temp);									
					
				}
			}
		}				

		return this;
	}

	
	@Override
	public String toString() {
		String data = "[";
		SinglyLinkedListNode curNode = root;
		
		int counter = 0;
		
		while(curNode != null) {
			if(counter==0) {
				data += String.format("%s ", curNode.value);
			}else {
				data += String.format(", %s ", curNode.value);
			}
						
			curNode = curNode.next;
			counter++;
		}
		data += "]";
		return data;
	}
	
	
}
