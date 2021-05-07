public class UC7 {
	public static void main(String[] args) {
	  LinkedList3 ll = new LinkedList3();
			ll.push(56);
			ll.push(30);
			ll.push(70);
			ll.deleteElement(30);
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
	
	public void push(int data) {
		
		//1. Create new Node using data

		Node newNode = new Node(data);
		
		newNode.next = head;
		System.out.println(newNode.next);
		head = newNode;
	}
	
	public void printList() {
		System.out.println("List : ");
		Node temp = head;
		
		while(temp != null) {
			System.out.print(temp.data+ "->");
			temp = temp.next;
		}
	}
public void deleteElement (int data) {
 	  Node temp=head;
 	  Node prev=null;
 	  
 	  if (temp != null && temp.data == data) {
 		  head=temp.next;
 	
 	  }
 	  
 	  while(temp != null && temp.data != data) {
 		  prev = temp;
 		  temp = temp.next;
 	  }	  
 	  
 	  if (temp != null) {
 		  prev.next =temp.next;
 	  }
 	  
 	  if (temp == null) {
 		  System.out.println(data);
 	  }
 	  
  }
}
