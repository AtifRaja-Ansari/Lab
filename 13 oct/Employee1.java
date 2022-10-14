package Assignments;

public class Employee1 {
	String employeeName;
	String employeeAddress;
	long employeePhone;
	long employeeId;
	double BasicSalary;
	double SpecialAllowance=250.80;
	double Hra=1000.50;
	public Employee1(String Name, String Address, long Phone, long Id) {
		this.employeeName = Name;
		this.employeeAddress = Address;
		this.employeePhone = Phone;
		this.employeeId = Id;
	}
	void calculateSalary() {
		double salary;
		salary = BasicSalary+(BasicSalary*SpecialAllowance/100)+(BasicSalary*Hra/100);
	System.out.println("Salary ="+salary);
	}
	void calculateTransportAllowance( ) {
		double Transportallowance=10*BasicSalary/100;
		System.out.println("Transport Allowance = "+Transportallowance);
	}
}



class Manager extends Employee1{

	public Manager(String Name, String Address, long Phone, long Id, double Salary) {
		super(Name, Address, Phone, Id);
		// TODO Auto-generated constructor stub
	super.BasicSalary=Salary;
	}
	
	void CalculateTransportAllowance() {
		double TransportAllowance = 45*BasicSalary/100;
		System.out.println("Transport Allowance = "+TransportAllowance);
	}
}



class Traniee extends Employee1{

	public Traniee(String Name, String Address, long Phone, long Id, double Salary) {
		super(Name, Address, Phone, Id);
		// TODO Auto-generated constructor stub
	super.BasicSalary = Salary;
	}
	
}