package dataStructures.doublyLinkedList;


//import java.io.BufferedReader;
//import java.io.InputStreamReader;

public class Program {

	
	public static void main(String[] args) throws Exception{
		
		
		/*
		 * Erstellen Sie eine Klasse, die wie das Javascriptarray (aus int) funktioniert.
		 * Implentieren Sie folgende Methoden und Properties:
		 * - length()
		 * - pop()
		 * - push(1)
		 * - shift(2)
		 * - unshift()
		 * - reverse()
		 * - add(index, value);
		 */
		
		
		DoublyLinkedListNode n1 = new DoublyLinkedListNode();
		DoublyLinkedListNode n2 = new DoublyLinkedListNode();
		DoublyLinkedListNode n3 = new DoublyLinkedListNode();
		DoublyLinkedListNode n4 = new DoublyLinkedListNode();
		DoublyLinkedListNode n5 = new DoublyLinkedListNode();
		DoublyLinkedListNode n6 = new DoublyLinkedListNode();
		
		
		n1.value = 1;
		n2.value = 2;
		n3.value = 3;
		n4.value = 4;
		n5.value = 5;
		n6.value = 6;
		
		n1.setPrev(null);
		n1.setNext(n2);
		
		n2.setPrev(n1);
		n2.setNext(n3);
		
		n3.setPrev(n2);
		n3.setNext(n4);
		
		n4.setPrev(n3);
		n4.setNext(n5);
		
		n5.setPrev(n4);
		n5.setNext(n5);
		
		n6.setPrev(n5);
		n6.setNext(null);
		
		
		DoublyLinkedList array = new DoublyLinkedList();
		
		System.out.println("------------push 1,2,3,4,5,6-----------");
		System.out.println(array.push(1));		
		System.out.println(array.push(2));		
		System.out.println(array.push(3));	
		System.out.println(array.push(4));
		array.push(5);
		System.out.println(array.push(6));
		System.out.println("------------unshift(1)-----------");
		System.out.println(array.unshift(1));
		System.out.println("------------push(7)-----------");
		System.out.println(array.push(7));
		System.out.println("------------shift()-----------");
		System.out.println(array.shift());
		
		System.out.println("-------------array.reverse()-----------");		
		System.out.println("Object before");
		System.out.println(array);
		System.out.println("Object after");		
		System.out.println(array.reverse());		
		
		//System.out.println("-------------array._reverse( dieser script  von Herrn S. Frank, modifiziert für doublyLinkedList aus singlyLinkedList)-----------");
		System.out.println("Object before");
		System.out.println(array);
		System.out.println("Object after");		
		System.out.println(array.reverse());
		
		//System.out.println(array.add2(3, 55));
		System.out.println(array.add(4, 34));
		System.out.println(array.add(0, 45));
		
		//for (int i = -2; i < 8; i++) {
		//	array.add(i, i);
		//	System.out.println(array.getValue(i));
		//}
		
		//System.out.println(array.add(-1, 56));
		
		//System.out.println(array.add(10, 78));		
		
		
		/*
		System.out.println("------------add (3, 55)-----------");
		System.out.println("Object before");
		System.out.println(array);
		System.out.println("Object after");
		System.out.println(array._add(3, 55));		
		System.out.println("------------add (1, 11)-----------");
		System.out.println(array.add(1, 11));
		*/
		
		/*
		System.out.println("-----------------------------------");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		int index = 0, val = 0;
		
		System.out.print("Input index int:");
		try{
            index = Integer.parseInt(br.readLine());
        }catch(NumberFormatException nfe){
            System.err.println("Invalid Format!");
        }						
		System.out.println("-----------------------------------");
        System.out.print("Input value Integer:");
        try{
            val = Integer.parseInt(br.readLine());
        }catch(NumberFormatException nfe){
            System.err.println("Invalid Format!");
        }
        System.out.println(String.format("--------add( %s, %s)----------", index, val ));
        System.out.println(array.add2(index, val));		
        */
        
		return;
		
	
	}

}
