package com.demo.demo1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.demo.Entity.Emp;
import com.demo.Entity.Student;

public class Test_Student {
	public static void main(String[] args) {
		Resource reso = new ClassPathResource("ApplicationContext.xml");
		BeanFactory bf = new XmlBeanFactory(reso);
		
		Student stu =(Student) bf.getBean("S");
		stu.display();
	}

}
