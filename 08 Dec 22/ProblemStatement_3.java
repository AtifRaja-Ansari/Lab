package collecion;
import java.util.*;

public class ProblemStatement_3 {
	public static void main(String[] args) {
		System.out.println("Problem Statement 3:\n");
		List<String> L1 = new ArrayList<String>();//Declaring Array list
		//Adding element to the Array List
		L1.add("Red");
	//	L1.add("Blue");
		L1.add("Green");
		L1.add("Black");
		L1.add("White");
		L1.add("Pink");
		System.out.println("Color_list = "+L1);
		List<String> L2 = new ArrayList<String>();//Declaring 2nd Array list
		L2.add("Red");
		L2.add("Green");
		L2.add("Black");
		L2.add("Pink");
		System.out.println("\nNew Color_list = "+L2);
		
		//Comparing both the List
		if(L1.equals(L2)==true) {
			System.out.println("\nArray Lists are equal.");
		}
		else {
			System.out.println("\nArray Lists are not equal.");
		}  
	}
}





/*List<String> L3= new ArrayList<String>();  
//iterator using for-each loop  
for(String tempList : L1)    //tempList is  a variable  
L3.add(L2.contains(tempList) ? "Yes" : "No");  
System.out.println("\n\t\t  "+L3);  */