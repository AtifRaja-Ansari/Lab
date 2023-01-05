package com.Employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{//main class
    public static void main(String[] args) {// main method
    //buildSessionFactory-from configuration object it takes JDBC information and create a JDBC connection
    SessionFactory s = new Configuration().configure().buildSessionFactory();
    //opens an connection with database and session object perform CRUD
    Session ses = s.openSession();
    // operation performed in database,save permanent
    Transaction t = ses.beginTransaction();
    
    //create object of persistence class Employee
    Employees E1 =new Employees();
    // use object to enter data in table setter method
    E1.setEmpId(101);
    E1.setEmpName("Avi");
    E1.setEmpEmail("atifansari83@gmail.com");
    E1.setEmpDepartment("CBI");
    E1.setEmpDesignation("Senior-Inspector");
    E1.setEmpPhone(123456789);
    E1.setEmpAddr("Meghalaya");
    E1.setEmpSalary(58000.25);
    ses.save(E1);
    // session object is used to save the persistence object

    Employees E2 =new Employees();
    //use object to enter data in table setter method
    E2.setEmpId(102);
    E2.setEmpName("Banti");
    E2.setEmpEmail("banti45@gmail.com");
    E2.setEmpDepartment("CBI");
    E2.setEmpDesignation("Head Officer");
    E2.setEmpPhone(123556789);
    E2.setEmpAddr("Meghalaya");
    E2.setEmpSalary(75000.25);
    ses.save(E2);
    // session object is used to save the persistence object

    Employees E3 =new Employees();
    //use object to enter data in table setter method
    E3.setEmpId(103);
    E3.setEmpName("Montu");
    E3.setEmpEmail("Monty54@gmail.com");
    E3.setEmpDepartment("CBI");
    E3.setEmpDesignation("junior-Inspector");
    E3.setEmpPhone(123656789);
    E3.setEmpAddr("Meghalaya");
    E3.setEmpSalary(50000.25);
    ses.save(E3);
    // session object is used to save the persistence object
    
    Employees E4 =new Employees();
    //use object to enter data in table setter method
    E4.setEmpId(104);
    E4.setEmpName("Birbal");
    E4.setEmpEmail("Bir66@gmail.com");
    E4.setEmpDepartment("CBI");
    E4.setEmpDesignation("Senior-Inspector");
    E4.setEmpPhone(123756789);
    E4.setEmpAddr("Meghalaya");
    E4.setEmpSalary(58000.25);
    ses.save(E4);
    // session object is used to save the persistence object
    
    Employees E5 =new Employees();
    //use object to enter data in table setter method
    E5.setEmpId(105);
    E5.setEmpName("Akbar");
    E5.setEmpEmail("Aka77@gmail.com");
    E5.setEmpDepartment("CBI");
    E5.setEmpDesignation("Sub-Inspector");
    E5.setEmpPhone(123856789);
    E5.setEmpAddr("Meghalaya");
    E5.setEmpSalary(5800.25);
    ses.save(E5);
    // session object is used to save the persistence object

    t.commit();
    // transaction object to commit changes
    ses.close();
    // close the session
	}
}