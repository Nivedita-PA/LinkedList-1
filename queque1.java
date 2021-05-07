public class queque1 {

	public static void main(String[] args) {
		
			Queue q = new Queue(2);
			q.enqueue(10);
			q.enqueue(20);
			q.print();
	}
}
class Queue {
	
	int front, rear, size;
	int que [];
	int capacity;
	int currentSize = 0;
	public Queue(int capacity) {
		this.capacity = capacity;
		this.que = new int[capacity];
	}
	
	public void enqueue(int data) {
		if(isFull()) {
			System.out.println("queue is full");
		}else {
			rear++;
			if(rear == capacity -1) {
				rear = 0;
			}
		  que[rear] = data;
		  currentSize++;
		}
		}
   public boolean isFull() {
	   return this.size == this.capacity;
   }

   public void print() {
	   System.out.println("Elements: ");
	   
	   for(int i = 0; i < this.size; i++) {
		   System.out.println(que[i] +" ");
	   }
	   System.out.println(que[]);
	   }
   }

