package com.example.demo;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.demo.Company;

public class Companytest {
	@Test
	public void shouldAutowireUsingByName() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Companyapplication.xml");
		Company company = applicationContext.getBean("company_with_ByName", Company.class);
		Assertions.assertThat(company.getEmployee()).isNotNull();
	}
	
	@Test
	public void shouldAutowireUsingByType() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Companyapplication.xml");
		Company company = applicationContext.getBean("company_with_ByType", Company.class);
		Assertions.assertThat(company.getEmployee()).isNotNull();
	}
	
	@Test
	public void shouldAutowireUsingByConstructor() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Companyapplication.xml");
		Company company = applicationContext.getBean("company_with_ByConstructor", Company.class);
		Assertions.assertThat(company.getEmployee()).isNotNull();
	}
	

}
