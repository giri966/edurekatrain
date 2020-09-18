package observer;

import java.util.List;
import java.util.Iterator;

public class Station implements Obseravable {
	private List<Weatherobserver> observers;
	private int temparature;
	
	
	public void setTemparature(int temparature) {
		System.out.println("weatherstation updating temparature to"+ temparature);
		this.temparature= temparature;
		donotify();
	}
	
	public void addobserver(Weatherobserver obs) {
		observers.add(obs);
		
		
	}
	public void removeobserver(Weatherobserver obs) {
		observers.remove(obs);
		
	}
	public void donotify() {
		Iterator<Weatherobserver> iterator = observers.iterator();
		while(iterator.hasNext()) {
			Weatherobserver obs=iterator.next();
			obs.doupdate(temparature);
		}
		
		
	}

}
