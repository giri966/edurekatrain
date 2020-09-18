package com.service.publisher;
import javax.xml.ws.Endpoint;

import com.service.impl.implementation;
public class publisher {
	public static void main(String[] args) {
		String url="http://localhost:8001/calculator";
		Endpoint.publish(url, new implementation());
		System.out.println("Service is running on url "+url);
		System.out.println("Open your favt browser and append ?wsdl at the end of the url to see the contract");
	}

	

}
