
public class student {
	
	public int id;
	public String name;
	student(int i, String n){
		id=i;
		name=n;
	}
	
	void display() {
		System.out.println("Studen Id:"+id+ "\nStudent name:"+ name);
	}
	
	public static void main(String args[]) {
		student s1= new student(1,"giri");
		student s2= new student(2,"dharani");
		s1.display();
		s2.display();
		
	}

}
