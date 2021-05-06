public class UC5 {
public static void main(String[] args) {
		
	    LinkedList4 ll = new LinkedList4();
		ll.append(56);
		ll.append(30);
		ll.append(70);
		ll.delLast();
		ll.printList();
		
	}
}

class LinkedList4 {
	
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

	public void pop() {
		if(head == null) {
			System.out.println("delete 1st element");

		head = head.next;
		
	}
	}
	public void delLast() {
		if(head == null)
			System.out.println("List is empty");
		Node last = head;
		Node temp = null;
		while(last.next != null) {
			temp = last;
			last = last.next;
		}
		temp.next = null;
		last.next = temp.next;
	}
}
