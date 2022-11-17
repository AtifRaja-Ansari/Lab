package Lab;
import java.util.Scanner;

/*Problem code 2:
Take two numbers x and y. Throw the exception if the two numbers are negative else print the 
Product of x and y.
Input Format
The only line of input consists of two integers, x and y.
Constraints   -----      -20<= x, y <=20
Output Format
Print the product if both are positive else print the output as below:
java.lang.Exception: x and y should not be zero.
*/

public class Problem__2 {
	
	public static void main(String[] args) throws Exception {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the two numbers=");
	int x=sc.nextInt();
	int y=sc.nextInt();
	if(x<0||y<0)
	
		throw new Exception("Both are negative Nos. ");
	else
		System.out.println("Product of x and y: "+(x*y));
		}

}
