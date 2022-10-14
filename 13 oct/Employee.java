package Assignments;

class Employee {
	static String emp_name;
	static int emp_Id;
	
	
	static void print(int id, String name) {
		emp_name=name;
		emp_Id = id;
		System.out.println(emp_Id +" "+ name);
	}
}
class tryEmployee {
	public static void main(String[] args) {
		Employee.print(01,"AAAA");
		Employee.print(02,"BBBB");
		Employee.print(03,"CCCC");
		Employee.print(04,"DDDD");
		Employee.print(05,"EEEE");
	}
}
