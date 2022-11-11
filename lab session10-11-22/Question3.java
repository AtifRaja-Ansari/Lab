/*
Q.3
Write a Java program to remove duplicate characters from a given string presents in another given string. 
Sample Output: 
The given String is: Anudip Foundation Skill & career development centre.
The given mask string is – Famous
The new string is: Without all letters 
*/

package Lab;

import java.util.*;

public class Question3 {
	

	 public static void main(String[] args) {
	  String str1 = "Anudip Foundation Skill & career development";
	  
	  
	  System.out.println("The given string is: " + str1);
	  String str2 = "Famous";
	  System.out.println("\nString to check and remove the latters: " + str2);
	  
	  
	  char arr[] = new char[str1.length()];
	  char[] m = new char[256];
	  for (int i = 0; i < str2.length(); i++)
	   m[str2.charAt(i)]++;
	  System.out.println("\nThe new string is: ");
	  for (int i = 0; i < str1.length(); i++) {
	   if (m[str1.charAt(i)] == 0)
	    System.out.print(str1.charAt(i));
	  }
	 }
}

