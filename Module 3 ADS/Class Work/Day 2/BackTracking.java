class BackTracking{
	static void display(String str,String res){ //str=Input   res=output
		if(str.length()==0) //str is null
		{
			System.out.println(res+" ");
			return;
		}
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);//return first character from string
			String ros = str.substring(0,i)+str.substring(i+1);//substring(index,value)
			display(ros, res+ch);
		}
	}
	public static void main(String[] args){
		String s ="ABC";
		display(s,"");
	}
}