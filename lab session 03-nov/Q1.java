/*Q.1   Write a Java program 
 to test if an array contains a specific value.
 */

package Lab;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		int[] A = {9,8,7,3,2,1};//initializing the array
		System.out.println("Elements in the array: ");//printing the elements of the array
		for(int i=0;i<A.length;i++) {
		System.out.print(A[i]+" ");}
		
		//taking input to check its presence
		Scanner in = new Scanner(System.in);
	    System.out.print("\nEnter the Number to look for: ");
	    int x = in.nextInt();// taking input(x = " " the number that needed to be searched)
     	boolean b = false;
		for(int n : A) {
			if (n == x) {//comparing if the value is present or not
				b = true;
				System.out.println("True");
				break;
			}
		}
		if(b==false)
			System.out.println("False");	
	}

}
