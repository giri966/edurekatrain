package com.service.clent;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.service.calculatorservice;

public class calculatorclient {
	public static void main(String[] args) {
		try {
			URL url=new URL("http://localhost:8001/calculator?wsdl");
			
			QName qName=new QName("http://impl.service.com/", "implementationService");
			Service service=Service.create(url, qName);
			calculatorservice cs=service.getPort(calculatorservice.class);
			System.out.println("Addition "+cs.add(100, 90));
			System.out.println("Subtraction "+cs.subtract(100, 90));
			System.out.println("Multiply "+cs.multiply(100, 90));
			System.out.println("Divide "+cs.divide(100, 90));
		} catch (MalformedURLException e) {
			System.out.println("Exception with URL "+e.getMessage());
		}

	}

	

}
