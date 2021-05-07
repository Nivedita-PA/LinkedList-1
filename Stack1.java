public class Stack {
	public static void main(String[] args) {
		System.out.print("Stack Elements: ");
		Stack1 stack = new Stack1();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		stack.peek();
		System.out.print("Stack after pop:\n");
		stack.pop();
		stack.print();
	}
}

class Stack1{
	
	private int maxSize;
	int top=-1;
	private int stk[];
	
	public Stack1() {
		this.top=-1;
		this.stk=new int[10];
		}
	
	public Stack1(int maxSize) {
		this.top=-1;
		this.stk=new int[maxSize];
		}
	
	public boolean push(int data){
		if(isFull()){
			System.out.print("Stack overFlow");
			return false;
		}else{
			stk[++top]=data;
			System.out.println(data);
			return true;
		}
	}

public boolean isFull(){
		return  this.top >= stk.length -1 ;
	}
public void print(){
		if(isEmpty()){
			System.out.print("Stack underFlow");
		}

		for(int ele=0 ;ele<=this.top ;ele++)
		{
			System.out.print(" "+stk[ele]);
		}
	System.out.println();
	}

public boolean isFull(){
		return  this.top >= stk.length -1 ;
	}
}
