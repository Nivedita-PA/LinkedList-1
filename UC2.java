public class UC2 {
	
	public static void main(String[] args) {
		
	    LinkedList ll = new LinkedList();
		ll.push(70);
		ll.push(30);
		ll.push(56);
		ll.printList();
		
	}
}


//defining our linkedlist class
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

		// method to push values one by one
		public void push(int data) {
			
			//1. Create new Node using data

			Node newNode = new Node(data);
			
			newNode.next = head;
			
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


