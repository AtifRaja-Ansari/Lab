package com.demo.demo1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.demo.Entity.MCQ;


public class Demo1Application {

	public static void main(String[] args) {

		Resource reso = new ClassPathResource("ApplicationContext.xml");
		BeanFactory bf = new XmlBeanFactory(reso);
		
		MCQ m =(MCQ) bf.getBean("M");
		m.display();
	}

}
