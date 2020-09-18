package day_2;
import color.Color;
public class Triangle extends Shape {
	public Triangle(Color c) {
		super(c);
	}
	
	public void applyColor() {
		System.out.println("Triangle filled with color");
		color.applycolor();
	}
	


}
