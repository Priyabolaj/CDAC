//Array Inplemention of stack
class Stack{
	static final int MAX = 10;
	int top;
	int arr[] = new int[MAX]; 
	Stack(){
		top = -1;
	}
	//Underflow
	boolean isEmpty()
	{
		return(top<0);
	}
	//insert in stack
	boolean push(int x) // insert hoga ya nhi hoga
	{
		if(top >= (MAX-1))
		{
			System.out.println("Stack Overflow");
			return false;	//can't insert bcoz satck is overflow
		}
		arr[++top] = x;
		return true; //insertion successful
	}
	//delete elemet from satck
	int pop()
	{
		if(top<0)
		{
			System.out.println("Stack Underflow");
			return 0;
		}
		return arr[top--];
	}
	//getting top element
	int peek()
	{
		return (top < 0) ? -1 : arr[top];
						//true false
	}
	void display()
	{
		if(isEmpty())
		{
			System.out.println("Stack Underflow");
		}
		else
			System.out.println("Stack elements are: ");
			show(top);
			System.out.println();
	}
	void show(int index){
		if(index < 0)  //base cond
			return ;
		System.out.println(arr[index]+" ");
		show(index-1); //recursive call
	}
	public static void main(String[] args)
	{
		Stack s1 = new Stack();
		s1.push(10);
		s1.push(20);
		s1.push(30);
		
		s1.display();
		
		s1.pop();
		s1.display();
		 
		System.out.println("peek: "+s1.peek());
		
	}
}
/* when we are deleting top means we are decrementing top 
....when we are again insert the element already deleted element will get overlap*/ 