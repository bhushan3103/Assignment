package assignment;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {    
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
        String string = sc.next();    
         
        String reverseString = "";    
            
        for(int i = string.length()-1; i >= 0; i--){    
        	reverseString = reverseString + string.charAt(i);    
        }    
            
        System.out.println("Original string: " + string);    
        System.out.println("Reverse of given string: " + reverseString);    
    }    

}
