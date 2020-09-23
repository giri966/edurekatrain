package com.example.demo;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Table
@Entity

public class Employee {
	
	@Id
	Integer id;
	
	String fName;
	String lName;
}
