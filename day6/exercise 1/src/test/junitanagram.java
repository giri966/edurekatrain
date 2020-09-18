package test;
import ana.anagram;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class junitanagram {
	
	public static anagram a1;

	@BeforeEach
	public  void setUp() {
		a1= new anagram();
		System.out.println("before testcase");
	}

	@AfterEach
	public  void tearDown()  {
		System.out.println("after testcase");
	}

	@Test
	public void testanagram() {
		String s1="got";
		String s2="tog";
		Assertions.assertEquals(true, a1.checkanagram(s1, s2));
		
	}

}
