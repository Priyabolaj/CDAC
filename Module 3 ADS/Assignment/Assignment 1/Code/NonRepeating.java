import java.util.*;  
class NonRepeating  
{  
    public static void main(String args[])  
    {  
        Scanner s=new Scanner(System.in);  
        System.out.print("Input :");  
        String word = s.next();  
        boolean flag = true;  
  
        for(char i :word.toCharArray())  
        {  
            if (word.indexOf(i) == word.lastIndexOf(i))  
            {  
                System.out.println("Output: "+ i);  
                flag = false;  
                break;  
            }  
        }  
        if(flag== true){  
            System.out.println("null");  
		}  
    }  
} 
/*
Explanation:

1. Input: The program reads a word from the user.
2. It checks each character and compares its first and last occurrence. If they are the same, it's the first non-repeated character.
3. Output: It prints the first non-repeated character, or "null" if none is found.
*/