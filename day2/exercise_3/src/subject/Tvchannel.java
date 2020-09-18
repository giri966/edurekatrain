package subject;
import observer.Weatherobserver;

public class Tvchannel implements Weatherobserver {
	public void doupdate(int tempa) {
		System.out.println("Tv channels are updating temparature as "+ tempa);
	}
}