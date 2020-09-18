package observer;
import subject.Tvchannel;
import subject.Newspaper;

public class mainobserver {
	public static void main(String[] args) {
	     Tvchannel obs1= new Tvchannel();
	     Newspaper obs2= new Newspaper();
	     
	    Station station= new Station();
	    station.addobserver(obs1);
	    station.addobserver(obs2);
	    station.setTemparature(30);
	    station.removeobserver(obs2);
	    station.setTemparature(40);
	}

}
