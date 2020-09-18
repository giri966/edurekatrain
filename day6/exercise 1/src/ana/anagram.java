package ana;
import java.util.Arrays;

public class anagram {
	
	public boolean checkanagram(String str1, String str2) {
		boolean flag;
		if(str1.length()!=str2.length())
			flag=false;
		else {
		     char[] s1=str1.toLowerCase().toCharArray();
		     char[] s2=str2.toLowerCase().toCharArray();
		     Arrays.sort(s1);
		     Arrays.sort(s2);
		     flag=Arrays.equals(s1, s2);
		}
		
		return flag;
	}

}
