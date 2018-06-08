package dataStructures.singlyLinkedList;

import java.util.Arrays;

public class Program {
	public static void main(String[] args) throws Exception{
		
		
		SinglyLinkedListNode n1 = new SinglyLinkedListNode();
		SinglyLinkedListNode n2 = new SinglyLinkedListNode();
		SinglyLinkedListNode n3 = new SinglyLinkedListNode();
		SinglyLinkedListNode n4 = new SinglyLinkedListNode();
		
		
		n1.value = 12;
		n2.value = 99;
		n3.value = 37;
		n4.value = 55;
		
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
											
		/*
		 * Erstellen Sie eine Klasse, die wie das Javascriptarray (aus int) funktioniert.
		 * Implentieren Sie folgende Methoden und Properties:
		 * - length()
		 * - pop()
		 * - push(1)
		 * - shift(2)
		 * - unshift()
		 * - reverse()
		 * 
		 */
		
		
		/*
		SinglyLinkedListNode n12 = new SinglyLinkedListNode();
		n12.setValue(2);
		
		
		System.out.println("-------------n1.length()-----------");		
		System.out.println(n1.length());
		
		
		System.out.println("------------print---------------");
		System.out.println(n1);
		
		
		int v1 = 5;		
		System.out.println("-------------n1.push(int value)-----------");		
		System.out.println("value = "+v1);
		System.out.println("Object before");
		System.out.println(n1);
		System.out.println("Object after");		
		System.out.println(n1.push(v1));
		
		System.out.println("-------------n1.pop()-----------");
		System.out.println(n1.pop());
		
		int v2 = 1;
		System.out.println("-------------n1.unshift(int value)-----------");
		System.out.println("value = "+v2);
		System.out.println(n1.unshift(v2));
				
		System.out.println("-------------n1.shift()-----------");
		System.out.println(n1.shift());
		
		
		System.out.println("-------------n1.reverse()-----------");		
		System.out.println("Object before");
		System.out.println(n1);
		System.out.println("Object after");		
		System.out.println(n1.reverse());		
		
		*/
		
		SinglyLinkedList ary = new SinglyLinkedList();
		//DoubleLinkedList ary2 = new DoubleLinkedList(); 
		System.out.println("------ length -----");
		System.out.println(ary.length());
		//System.out.println(ary2.length());
		System.out.println("------ push(2)-----");
		System.out.println(ary.push(2));
		//System.out.println(ary2.push(2));
		
		System.out.println("------ push(3)-----");
		System.out.println(ary.push(3));		
		
		System.out.println("------ pop-----");
		System.out.println(ary.pop());
		System.out.println("------ shift -----");
		System.out.println(ary.shift());
		System.out.println("------ unshift 4 -----");
		System.out.println(ary.unshift(4));
		System.out.println("------ unshift 7 -----");
		System.out.println(ary.unshift(7));
		
		System.out.println("------ unshift 2 -----");
		System.out.println(ary.unshift(2));
		
		System.out.println("------ push(5) -----");
		System.out.println("------ push(6) -----");
		ary.push(5);
		ary.push(6);
		System.out.println("------ reverse -----");
		SinglyLinkedList ary2 = ary.reverse();
		System.out.println(ary);
		System.out.println(ary2);
		
		System.out.println("------ reverse again -----");
		SinglyLinkedList ary3 = ary.reverse();		
		System.out.println(ary);
		System.out.println(ary3);
		
		System.out.println("------ sort -----");
		SinglyLinkedList ary5 = ary.sort();
		System.out.println(ary);
		System.out.println(ary5);
		
		
		
		
		
				
		
		return;
	}
}
