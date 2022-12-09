package collecion;

import java.util.*;

public class ProblemStatement_4 {
	public static void main(String[] args) {
		System.out.println("Problem Statement 4:");
		List<String> L1 = new ArrayList<String>();//Declaring Array list
		//Adding element to the Array List
		L1.add("Red");
		L1.add("Green");
		L1.add("Orange");
		L1.add("White");
		L1.add("Black");
		System.out.println("\nOriginal Color_List = "+L1);
		L1.removeAll(L1);//remove all Element from the first List
		System.out.println("\nThe new Color_List = "+L1);
		if(L1.isEmpty())
			System.out.println("\nList is empty now!");
	}
}
