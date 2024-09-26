import java.util.*;
class Duplicate {  
     public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		System.out.print("Input: "); 
        String string1 = sc.nextLine();  
        int count;  
          
        char string[] = string1.toCharArray();  
          
        System.out.print("Duplicate characters in a given string: [");  
       
        for(int i = 0; i <string.length; i++) {  
            count = 1;  
            for(int j = i+1; j <string.length; j++) {  
                if(string[i] == string[j] && string[i] != ' ') {  
                    count++;  
                    
                    string[j] = '0';  
                }  
            }  
             
            if(count > 1 && string[i] != '0')  
                System.out.print(string[i]);  
        }  
		System.out.println(" ]"); 
    }  
}  
/*Explanation:
1. Converts given string into character array  
2. Counts each character present in the string
3. Set string[j] to 0 to avoid printing visited character 
4. A character is considered as duplicate if count is greater than 1 
*/