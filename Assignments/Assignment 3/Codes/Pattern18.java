class Pattern18  
{  
	public static void main(String args[])  
	{  
		int n= 4, m = 1;   
		m = n - 1;  
		for (int j = 1; j<= n; j++)  
		{  
			for (int i = 1; i<= m; i++)  
			{  
				System.out.print(" ");  
			}  
			m--;  
			for (int i = 1; i <= 2 * j - 1; i++)  
			{  
				System.out.print("*");  
			}  
			System.out.println("");  
		}  
		m = 1;  
		for (int j = 1; j<= n - 1; j++)  
		{  
			for (int i = 1; i<= m; i++)  
			{  
				System.out.print(" ");  
			}  
			m++;  
			for (int i = 1; i<= 2 * (n - j) - 1; i++)  
			{  
				System.out.print("*");  
			}  
			System.out.println("");  
		}  
	}  
}  