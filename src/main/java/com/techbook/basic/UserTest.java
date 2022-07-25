package com.techbook.basic;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class UserTest {

	public static void main(String[] args) {
		//User user = new User();
		//user.setName("khagendra");
		//user.displayInfo();
		//System.out.println("=========================");
		ApplicationContext contex = new ClassPathXmlApplicationContext("spring-config.xml");// xml file ko name j xa
																							// tyo....
																							// rakhnae yaha
		User user1 = (User) contex.getBean("u"); // junko object chayiya xa tesko cast garidine
		//user1.setFirstName("nabin");
		user1.displayInfo();

		//System.out.println("======================");
		// BeanFactory factory = new XmlBeanFactory(new
		// ClassPathResource("spring-config.xml"));
		// User user2 = (User) factory.getBean("u");
		// user2.displayInfo();

	}

}
