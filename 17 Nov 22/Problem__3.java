package Lab;
/*
 Problem code 3: 
Write a method called addTwoPositive that takes two int 
parameters, and if either value is not positive, throw an 
ArithmeticException, passing the string "Non-positive 
integer sent". to the constructor of the exception.if the
values are both positive, then return the sum of them. 
Under what curcumstances will the finally code block be 
executed in a try/catch/finally segments.
*/

public class Problem__3 {
	void addTwoPositive(int a,int b) throws ArithmeticException{
		try {
		if(a<0 && b<0) {
			throw new ArithmeticException("Non-Positive Integer sent");
		}
		else {
			System.out.println("The sum of two is: "+(a+b));
		}
		}finally {
			System.out.println("Final Execution ");
		}
	}
	public static void main(String[] args) {
		Problem__3 obj = new Problem__3();
		obj.addTwoPositive(-30,-45);
	}
}
