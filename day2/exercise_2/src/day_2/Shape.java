package day_2;
import color.Color;

public abstract class Shape {
	 protected Color color;
	 public Shape(Color c) {
		 this.color=c;
	 }
	 
	 abstract public void applyColor();

}
