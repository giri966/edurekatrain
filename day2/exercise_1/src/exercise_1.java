class Singleton{
	private static Singleton ins;
	private Singleton() {
		
	}
	
	public static synchronized Singleton getinstance() {
		if(ins==null) {
			ins= new Singleton();
		}
		return ins;
	}
}



public class exercise_1 {
	public static void main(String args[]) {
		Singleton s1=Singleton.getinstance();
		System.out.println(s1.hashCode());
		Singleton s2=Singleton.getinstance();
		System.out.println(s2.hashCode());
		
		if(s1==s2) {
			System.out.println("same");
		}
		else
			System.out.println("notsame");
		
	}
	


}
