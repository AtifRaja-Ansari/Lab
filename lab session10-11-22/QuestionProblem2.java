package Lab;

public class QuestionProblem2 {
	public static void main(String[] args) {// main method
		// string buffer
		StringBuffer s = new StringBuffer("This is StringBuffer"); // object of String buffer-class
		s.append("- This is a sample program");
		System.out.println("String is: " + s);
		s.insert(21, "Object");// int off set,string s
		System.out.println("Insert is: " + s);
		s.replace(14, 20, "Builder");// (begin with, ends with, string s)
		System.out.println("Replace is: " + s);
		s.reverse(); // reversing he whole string
		System.out.println("Reverse is: "+s);

	}
}