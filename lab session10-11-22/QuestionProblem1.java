/*Problem Statement 1:
Write a program which creates a String “Welcome to Java World” and performs the following 
*/


package Lab;

import java.util.*;

public class Question {
	public static void main(String[] args) {
		
	System.out.println("Problem-1:\n\n");
		
		String str1 = "Welcome to Java World";
		  System.out.println("Initialized String:\n"+str1);
		 
		  
		 String str2= "Welcome";
		 System.out.println("\nChecking Welcome: "+(str2.compareTo(str1))!=null?"\nyes":"no");
		  
		 String str3= "Let us learn";
		 System.out.println("\nConcantanating str1 and str3: "+str1.concat(str3));
		 
		  //Getting the character at the 5th position 
		  int index1 = str1.charAt(5);
		  System.out.println("\n* The character at position 5th is: " +(char)index1);


		  System.out.print("\n* Index position of the character a is: ");
		  System.out.println(str1.indexOf('a'));
		  
		  System.out.println("\n* Replacing the character 'a' with 'e':");
		  System.out.println(str1.replace('a', 'e'));
	
		 String strnew = str1.substring(4,10);
		 System.out.println("\n* String between 4th and 10 position is:\n" + strnew);
	}
}
