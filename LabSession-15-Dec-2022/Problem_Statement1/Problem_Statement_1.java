package labSession;
import java.util.*;


public class Problem_Statement_1 {
	ArrayList<Integer> A1 = new ArrayList<Integer> ();
	ArrayList<Integer>StoreEvenNumbers(int N) {
		A1 = new ArrayList<Integer>();
		
		for (int i = 2; i <= N; i++) {
			if (i % 2 == 0) A1.add(i);
		}
		System.out.println("Even Nos. stored: "+A1);
		return A1;
	}
	
ArrayList<Integer> printEvenNumbers() {
		ArrayList<Integer> A2 = new ArrayList<Integer>();
		
		for (int item : A1) {
			A2.add(item * 2);
			//System.out.println(item * 2);
		}
		System.out.println("Even nos. stored * 2 = "+A2);
		return A2;
	}

int retrieveEvenNumber(int N) {
	for(int i=0;i<A1.size();i++) {
		if(A1.get(i)==N) {
			return N;
			}
		}
	return 0;
}

public static void main(String args[]) {
	Problem_Statement_1 p1=new Problem_Statement_1();
	System.out.println("Enter the Last (Nth) even number for ArrayList(A1):");
	Scanner sc = new Scanner(System.in);
	int N=sc.nextInt();
	
	p1.StoreEvenNumbers(N);
	p1.printEvenNumbers();
	System.out.println("Enter even number to search in arrayList(A1)");
	int n = sc.nextInt();
	System.out.println(p1.retrieveEvenNumber(n));
	}
}
