public class Stack1 {

public static void main(String[] args) {
		
	    Stack1 stk = new Stack1();
		stk.push(70);
		stk.push(30);
		stk.push(56);
		stk.printList();
		
	}
	
	
}
class Stack1 {
	
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

	// method to push values one by one
	public void push(int data) {
		
		//1. Create new Node using data

		Node newNode = new Node(data);
		
		newNode.next = head;
		System.out.println(newNode.next);
		head = newNode;
	}
		
//method to print values one by one
	public void printList() {
		System.out.println("List : ");
		Node temp = head;
		
		while(temp != null) {
			System.out.print(temp.data+ "->");
			temp = temp.next;
		}
	}
}
	
