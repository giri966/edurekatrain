import java.util.TreeSet;
import java.util.Collections;
import java.util.Scanner;


public class question_2 {
	public static void main (String args[])
	{
		TreeSet<String> a=new TreeSet<String>();
		a.add("L");
		a.add("M");
		a.add("N");
		a.add("O");
		a.add("P");
		System.out.println("initial treeset"+ a);
		System.out.println("reverse treeset"+ a.descendingSet());
		System.out.println("reverse treeset"+ a.higher("N"));
		
		
	}

	
	
}
