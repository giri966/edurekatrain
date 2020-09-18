package observer;

public interface Obseravable {
	public void addobserver(Weatherobserver obs);
	public void removeobserver(Weatherobserver obs);
	public void donotify();

}
