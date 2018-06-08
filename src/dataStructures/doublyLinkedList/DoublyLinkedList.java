package dataStructures.doublyLinkedList;

/*
 * Doubly linked list class;
 * functions implemented : length(), push(), unshift(value), shift(), reverse(); add(index, value);  
 * @return this
 * 
 */

public class DoublyLinkedList {

	private DoublyLinkedListNode head;
	private DoublyLinkedListNode tail;  // "Zeiger/Pointer" 4 Byte
	
	// constructor 
	public DoublyLinkedList() {
		head = null;
		tail = null;
	}
		
	/*
	 * @return length of the list
	 */
	public int length(){
        DoublyLinkedListNode c = head;
        
        int count = 0;
        
        while(c != null){
        
        	count++;
            c = c.getNext();
        }
        return count;
}
	
		
	/*
	 * private method
	 * @param node
	 * @return reversed node
	 */
	/*
	private DoublyLinkedListNode reverseNode(DoublyLinkedListNode node) {
		DoublyLinkedListNode reversedNode = new DoublyLinkedListNode();

		while (node != null) {
			DoublyLinkedListNode tempNode = new DoublyLinkedListNode();
			reversedNode.setValue(node.getValue());			
			tempNode.setNext(reversedNode);
			if (node.next != null) {				
				reversedNode = tempNode;				
			}			
			node = node.next;
		}
		return reversedNode;
	}
	*/	
	/*
	 * private method - insert node b after node a
	 * cuts off excess nodes
	 * @param  node firstParthead - node in left side
	 * @param  node insertedNode - which insert after  node a
	 * @param  countInterruption - number of nodes where need insert new node
	 * @return  new final node  
	 */
	/*
	private DoublyLinkedListNode insertNodeAfter(DoublyLinkedListNode firstParthead, DoublyLinkedListNode insertedNode, int countInterruption) {

		int count = 1;

		while (firstParthead.next != null) {

			if (count == countInterruption) {
				break;
			}

			count++;
			firstParthead = firstParthead.next;
		}

		firstParthead.setNext(insertedNode);

		return firstParthead;
	}
	*/
	
	/* add new element in existing node
	 * @param  index is the place where insert new value 
	 * @param  value
	 * @return finished  LinkedList 
	 */
	
	/*
	public DoublyLinkedList _add(int index, int value) {

		DoublyLinkedListNode chead = head;
		
		DoublyLinkedListNode firstPartNode = new DoublyLinkedListNode();
		DoublyLinkedListNode insertedNode = new DoublyLinkedListNode();

		insertedNode.setValue(value);
		insertedNode.setPrev(null);
		insertedNode.setNext(null);

		int countInterruption = 0;

		while (chead != null) {			
			
			DoublyLinkedListNode aTemp = new DoublyLinkedListNode();

			
			firstPartNode.setValue(chead.getValue());
			aTemp.setNext(firstPartNode);
			firstPartNode = aTemp;
			
			

			if (countInterruption == index) {

				DoublyLinkedListNode firstParthead = new DoublyLinkedListNode();

				firstParthead = reverseNode(firstPartNode);

				insertedNode.setNext(chead);
								

				head = insertNodeAfter(firstParthead, insertedNode, countInterruption);
				head = firstParthead;

				break;
			}

			countInterruption++;

			chead = chead.next;
		}

		return this;
	}
	

	
	private void rewriteHeadPrev() {
		if(head.prev!=null) {	
			head = head.prev;
			rewriteHeadPrev();
		}
	}
	
	
	public DoublyLinkedList add1(int index, int value) {		
		DoublyLinkedListNode storeNext = new DoublyLinkedListNode();
		DoublyLinkedListNode newNode = new DoublyLinkedListNode();
		
		int count = 1;		
		newNode.value = value;
		newNode.next = null;
		newNode.prev = null;		
		
		while (head.next !=null) {
						
			if (count == index) {				
				storeNext = head.next;				
				head.next = newNode;
								
				//head = head.prev;	// need rewrite head.prev   			
				rewriteHeadPrev();
				
				newNode.next = storeNext;
				storeNext.prev = newNode;					
				break;
															
			} else {				
				count ++;
				head = head.next;
			}
			
		}
		return this;
	}
	*/
	
	public int getValue(int index) {
		if (index > length() || index < 0) {
			throw new IndexOutOfBoundsException(String.format("index has to be in 0 to %s", length() - 1));
		}
		
		DoublyLinkedListNode curNode = head;
		
		for (int i = 0; i < index; i++) {
			curNode = curNode.next;
		}
		
		return curNode.getValue();
	}
	
	public DoublyLinkedList add(int index, int value) throws Exception {
		DoublyLinkedListNode curNode = head;

		if (index > length() || index < 0) {
			throw new IndexOutOfBoundsException(String.format("index has to be in 0 to %s", length() - 1));

			// index = length();
			// System.err.println(String.format("index has to be in 0 to %s. Index by
			// default is %s", length()-1, index));
		}

		//if (index < 0) {
			//System.err.println("index can't be negative. Only positive numbers! Index by default is 0");
			//index = 0;
		//}

		for (int i = 0; i < index; i++) {
			curNode = curNode.next;
		}

		DoublyLinkedListNode newNode = new DoublyLinkedListNode();
		newNode.value = value;

		// when position is last
		if (curNode == null) {
			
			//this.push(value);

			newNode.prev = tail;
			if (tail == null) {
				// when list is empty
				tail = newNode;
				head = tail;
			} else {
				tail.next = newNode;
				tail = newNode;
			}

			// when position is in range
		} else if (curNode.prev != null) {

			DoublyLinkedListNode prevNode = curNode.prev;
			
			prevNode.next = newNode;
			newNode.next = curNode;
			curNode.prev = newNode;
			newNode.prev = prevNode;

			// when position is 0
		} else {
			
			//this.unshift(value);
			// to the start of list
			
			newNode.next = head;

			if (tail != null) {

				// when list is empty
				head.prev = newNode;
				head = newNode;
			} else {

				head = newNode;
				tail = newNode;
			}
		}

		return this;
	}

	
	/*   push method for the list
	 * * 
	 * @param: int value
	 * @return: list with inserted value to the end of this list   
	 */
	public DoublyLinkedList push(int value) throws Exception {
		// return add2(0, value);
	
		
		 DoublyLinkedListNode a = new DoublyLinkedListNode();
		   
		   a.setPrev(tail);
		   a.setValue(value);
		   a.setNext(null); 
		   
           if(tail==null){        	       
        	   		//when list is empty                                 
        	   		tail = a;
        	   		head = tail;                   
           }else{        	   		        	   	        	   
                   tail.setNext(a);
                   tail = a;
           }           
		return this;
		
	}
	
	
	/*
	 * @param int value
	 * @return list with inserted value to the start of this list 
	 */
	public DoublyLinkedList unshift(int value) {

		DoublyLinkedListNode a = new DoublyLinkedListNode();

		a.setValue(value);
		a.setPrev(null);		
		
		a.setNext(head);		

		if (tail != null) {
			
			head.setPrev(a);			
			head = a;
			
		} else {
			
			head = a;
			tail = a;
		}

		return this;
	}
	
	/*
	 * @return list without first element 
	 */
	public DoublyLinkedList shift() {
		
		DoublyLinkedListNode a = new DoublyLinkedListNode();
				
		
		if(head.next!=null) {
			
			head  = head.next; 
			
		} else {
			
			head  = tail = a;
		}
		
		return this;
	}
	
	
	/*
	 * Script by Herrn S. Frank for traversing  list
	 */
	/*
	private DoublyLinkedListNode GetSecondLastNode(DoublyLinkedListNode node) {
		if (node.next != null && node.next.next == null) {
			return node;
		}
		
		return GetSecondLastNode(node.next);
	}
	
	private DoublyLinkedListNode GetLastNode(DoublyLinkedListNode node) {
		if (node.next == null) {
			return node;
		}
		
		return GetLastNode(node.next);
	}
	
	public DoublyLinkedList _reverse() {
		// wenn null oder ein Koten existieren
		if (head == null || head.next == null) {
			return this;
		}
		
		DoublyLinkedListNode oldRoot = head;
		DoublyLinkedListNode newRoot = null;
		//SinglyLinkedListNode curNode = null;
		
		while (oldRoot.next != null) {		
										
			DoublyLinkedListNode secondLastNode = GetSecondLastNode(head);			
			DoublyLinkedListNode lastNode = secondLastNode.next;
				secondLastNode.next = null;
						
			if (newRoot == null) {
				newRoot = lastNode;
			} else {
				GetLastNode(newRoot).next = lastNode;
			}				
	
		}
		
		GetLastNode(newRoot).next = oldRoot;						
		
		head = newRoot;
		
		return this;
	}
	*/
	
	/*
	 * @return list after traversing 
	 */
    public DoublyLinkedList reverse(){
    	
        DoublyLinkedListNode a = head;
        
        DoublyLinkedListNode temp = null;
        
        while(a != null){
                
        	temp = a.getNext();
            
        	a.setNext(a.getPrev());
            
        	a.setPrev(temp);
                
            a = a.getPrev();
        }
        
        //traversing for head<->tail 
        temp = head;
        head = tail;
        tail = temp;
        
        //null pointer to the start of head and to the end of tail
        head.setPrev(null);
        tail.setNext(null);
        
        return this;
}
	 
	
	
    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     * return formated list  to the console
     */
	@Override	
	public String toString() {
		
		String out = "[";
		
		DoublyLinkedListNode a = head;
		
		while (a != null && a.next != null) {
			out += String.format("%s, ", a.value);
			a = a.next;
		}
		
		if (a != null) {
			out += String.format("%s", a.value);
		}
		
		out+="]";
		
		return out;
	}
	
}
