class Array{
	static int insert(int arr[],int size,int key,int capacity)
	{
		if(size>capacity)
		{
			System.out.println("Array is full");
			return size;
		}
		arr[size] =key; //new element
		return size+1;
	}
	static int search(int arr[],int size,int key)
	{
		
		for(int i=0;i<size;i++){
			if(arr[i] == key)
			{
				return i; //return index
			}
		}
		return -1; //element not found
	}
	
	static int delete(int arr[],int size,int key)
	{
		int pos = search(arr,size,key);
		if(pos==-1)
		{
			System.out.println("Elemenet is not found that you want to delete");
			return size;
		}
		//element is present then delete it and shift other element
		for(int i=pos;i<size-1;i++)
		{
			arr[i] =arr[i+1];
		}
		return size-1;
	}	
	public static void main(String[] args)
	{
		int[] a1 = new int[100];
		int size =10;
		a1[0]=11;
		a1[1]=13;
		a1[2]=15;
		a1[3]=51;
		a1[4]=71;
		a1[5]=56;
		a1[6]=48;
		a1[7]=8;
		a1[8]=99;
		a1[9]=110;
		System.out.println("Old Array: ");
		for(int i=0;i<size;i++)
		{
			System.out.print(a1[i]+" ");
		}
		System.out.println("\n------------------------------------------------\n");
		//searching
		int key = 48;
		/*for(int j=0;j<size;j++)
		{
			if(a[j] == key)
			{
				break;
			}
		}
		if(a[j] == a.lenght)
			System.out.println(key + " is not found");
		else
			System.out.println(key + " is found");
		*/
		int pos = search(a1,size,key);
		if(pos == -1){
			System.out.println(key + " is not found");
		}
		else{
			System.out.println(key + " is found at " + pos);
		}
		int key1 =111;
		size=insert(a1,size,key1,100);
		System.out.println("------------------------------------------------\n");
		System.out.println("New Array after inserting key: ");
		for(int i=0;i<size;i++)
		{
			System.out.print(a1[i]+" ");
		}
		int key2=51;
		int del = delete(a1,key2,size);
		System.out.println("\n------------------------------------------------\n");
		System.out.println("New Array after deletion key: ");
		for(int i=0;i<size-1;i++)
		{
			System.out.print(a1[i]+" ");
		}
				System.out.println("\n------------------------------------------------\n");
		
	}
}