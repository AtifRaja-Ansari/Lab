package demo;


//Create object without new keyword
class AnotherClass{//another class
	//data members of the another class
	String name;
	int age;
}

public class WithoutNew {// class
	public static void main(String[] args) {
		try {
			//creating objects using newInstance method
			AnotherClass o1 = AnotherClass.class.newInstance();
			AnotherClass o2 = AnotherClass.class.newInstance();
			AnotherClass o3 = AnotherClass.class.newInstance();
			AnotherClass o4 = AnotherClass.class.newInstance();
			AnotherClass o5 = AnotherClass.class.newInstance();
			
			//Initializig data members of objects
			o1.name = "a";
				o1.age=20;
			o2.name = "b";
				o2.age=30;
			o3.name = "c";
				o3.age=40;
			o4.name = "d";
				o4.age=40;
			o5.name = "e";
				o5.age=50;
				
	//printing Statement
				System.out.println("name="+o1.name+" "+"age="+o1.age);
				System.out.println("name="+o2.name+" "+"age="+o2.age);
				System.out.println("name="+o3.name+" "+"age="+o3.age);
				System.out.println("name="+o4.name+" "+"age="+o4.age);
				System.out.println("name="+o5.name+" "+"age="+o5.age);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}