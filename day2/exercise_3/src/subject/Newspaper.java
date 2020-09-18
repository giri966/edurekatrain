package subject;
import observer.Weatherobserver;

public class Newspaper implements Weatherobserver {
	public void doupdate(int tempa) {
		System.out.println("news papers are updating temparature as "+ tempa);
	}

}
