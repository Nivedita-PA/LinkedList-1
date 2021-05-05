public class UC3 {

public static void main(String[] args) {
		
	    LinkedList ll = new LinkedList();
		ll.append(56);
		ll.append(30);
		ll.append(70);
		ll.printList();
		
	}
}


class LinkedList {
	
	//1st node
	Node head;
	
	class Node {
		
		int data;
		
		//2nd node
		Node next;
		
		//node constructor
		Node(int data){
			this.data = data;
			next =  null;
		}
	}
	
public void append(int data) {
	//1, create 
	Node newNode = new Node(data);
	
	if(head == null) {
		head  = newNode;
		return;
	}
	
	//head -> n1 -> n2 -> n3 -> newNode
	
	Node last = head;
	while(last.next != null) {
		last = last.next;
	}
	
	last.next = newNode;
}

public void printList() {
	System.out.println("List : ");
	Node temp = head;
	
	while(temp != null) {
		System.out.print(temp.data+ "->");
		temp = temp.next;
	}
}
}
