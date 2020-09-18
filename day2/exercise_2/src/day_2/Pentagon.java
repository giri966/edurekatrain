package day_2;
import color.Color;
public class Pentagon extends Shape {
	public Pentagon(Color c) {
		super(c);
	}
	
	public void applyColor() {
		System.out.println("pentagon filled with color");
		color.applycolor();
	}
	

}
