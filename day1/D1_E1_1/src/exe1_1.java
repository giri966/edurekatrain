

class Area{
	double length,width;
	double radius;
	double side;
	
	Area(double l, double w){
		length=l;
		width=w;
	}
	
	double arearect() {
		return length*width;
	}
	
	
	Area(double s){
		side=s;
	}
	
	double areasquare() {
		return side*side;
	}
	
	Area(double r, char s){
		radius=r;
	}
	
	double areacircle() {
		return 3.14*radius*radius;
	}
}


public class exe1_1 {
	
	public static void main(String args[]) {
		Area rectangle= new Area(11,12);
		Area square= new Area(10);
		Area circle= new Area(2.5, 'c');
		
		System.out.println("area of rectangle:"+ rectangle.arearect());
		System.out.println("area of square:"+ square.areasquare());
		System.out.println("area of circle:"+ circle.areacircle());
		
		
	}
	

}
