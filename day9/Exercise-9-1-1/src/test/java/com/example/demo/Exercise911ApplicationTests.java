package com.example.demo;



import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.Employee;
import com.example.demo.EmployeeRepo;


@SpringBootTest
class Exercise911ApplicationTests {
	
	@Autowired
	EmployeeRepo employeeRepository;
	
	@Test
	public void shouldInsertEmployee() {
		Employee firstemployee = Employee.builder()
				.id(1)
				.fName("John")
				.lName("Lee")
				.build();
		employeeRepository.save(firstemployee);
		
		Optional<Employee> secondEmployee1 = employeeRepository.findById(1);
		Assertions.assertThat(secondEmployee1.isPresent()).isTrue();
		Assertions.assertThat(secondEmployee1.get()).isEqualTo(firstemployee);
	}	

	

}
