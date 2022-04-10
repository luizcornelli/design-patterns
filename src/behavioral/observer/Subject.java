package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

	private List<Observer> observers = new ArrayList<>();

	public void attatch(Observer o) {
		this.observers.add(o);
	}

	public void datatch(Observer o) {
		this.observers.remove(o);
	}
	
	public void notifyObserveres() {
		
		for (Observer observer : observers) {
			
			observer.update();
		}
	}
}
