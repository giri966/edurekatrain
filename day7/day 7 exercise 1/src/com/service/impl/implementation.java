package com.service.impl;
import javax.jws.WebService;

import com.service.calculatorservice;
@WebService(endpointInterface = "com.service.calculatorservice")
public class implementation implements calculatorservice {
	@Override
	public int add(int a, int b) {
		
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		
		return a-b;
	}

	@Override
	public int multiply(int a, int b) {
		
		return a*b;
	}

	@Override
	public int divide(int a, int b) {
		
		return a/b;
	}

	

}
