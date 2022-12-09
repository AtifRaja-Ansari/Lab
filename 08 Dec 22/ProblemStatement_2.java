package collecion;

import java.util.*;

public class ProblemStatement_2 {
	public static void main(String[] args) {
		System.out.println("Problem Statement 2:\n");
		List<String> L1 = new ArrayList<String>();//Declaring Array list
		//Adding element to the Array List
		L1.add("Red");
		L1.add("Green");
		L1.add("Orange");
		L1.add("White");
		L1.add("Black");
		System.out.println("Original Color_list = "+L1);
		System.out.println("\nNew Color_list = "+L1.subList(0, 3));//Extracting only 3
		//from position index(0,2)
	}

}
