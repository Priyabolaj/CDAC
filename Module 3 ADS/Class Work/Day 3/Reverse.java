//Array Inplemention of stack
class Stack{
	private int max;
	private int top;
	private int s1[]; 
	
	Stack(int s){
		top = -1;
		max = s;
		s1 = new int[max];
	}
	
	//Underflow
	boolean isEmpty()
	{
		return(top<0);
	}
	
	//insert in stack
	boolean push(int x) // insert hoga ya nhi hoga
	{
		if(top >= (max-1))
		{
			System.out.println("Stack Overflow");
			return false;	//can't insert bcoz satck is overflow
		}
		s1[++top] = x;
		return true; //insertion successful
	}
	//delete elemet from satck
	int pop()
	{
		if(top<0)
		{
			System.out.println("Stack Underflow");
			return -1;
		}
		return s1[top--];
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
		System.out.println(s1[index]+" ");
		show(index-1); //recursive call
	}
}
class Reverse{
	static void reverse(StringBuffer str)
		{
			int n = str.length();
			Stack s1 = new Stack(n);
			//push each char in stack
			for(int i=0;i<n;i++)
			{
				s1.push(str.charAt(i)); // separate each character
			}
			//pop each char and print
			for(int i=0;i<n;i++)
			{
				char ch = (char)s1.pop(); //typecast
				str.setCharAt(i,ch);  //(pos,charater) join charater in a string 
			}
		}
	public static void main(String[] args)
	{
		StringBuffer s = new StringBuffer("CDAC Mumbai");
		reverse(s);
		System.out.println("Reverse String: "+s);
		
	}
}
/* when we are deleting top means we are decrementing top 
....when we are again insert the element already deleted element will get overlap*/ 