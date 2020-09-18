import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class question_1 {
	public static void main (String args[])
	{
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("a");
		arr.add("b");
		arr.add("c");
		arr.add("d");
		arr.add("e");
		arr.add("f");
		System.out.println(arr);
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter two numbers");
		
		int a= s.nextInt();
		int b= s.nextInt();
		Collections.swap(arr, a, b);
		System.out.println(arr);
		
		
	}

}
