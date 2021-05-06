public class UC4 {
public static void main(String[] args) {
		
	    LinkedList3 ll = new LinkedList3();
		ll.append(56);
		ll.append(70);
		ll.insertAfter(ll.head, 30);
		ll.printList();
		
	}
}
class LinkedList3 {
	
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
	
public void insertAfter(Node prevNode, int data) {
		
		//56 -> 70
		//56 --> 30 -> 70
		
		if(prevNode == null) {
			
			System.out.println("prevoius node should not be null ");
			return;
			
		}
		
		Node newNode = new Node(data);
		
		newNode.next = prevNode.next;
		
		prevNode.next = newNode;
		
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
