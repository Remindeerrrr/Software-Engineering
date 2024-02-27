package obsever_pattern;

import java.util.ArrayList;

public class Cook implements Subject {
    private ArrayList<Observer> observers;
	private String name;

	public Cook(String name) {
		observers = new ArrayList<Observer>();
		this.name = name;
	}

	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

    public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

    public void notifyObservers(String location, String description, ArrayList<String> accomplices) {
		for (Observer observer : observers) {
			observer.update(location, description, accomplices);
		}
	}
	public void enterSighting(String location, String description, String accomplices) {
		ArrayList<String> people = new ArrayList<String>();

		String[] accomplicesList = accomplices.split(",");
		for (String person : accomplicesList) {
			people.add(person);
		}
		notifyObservers(location, description, people);
	}


	public String getName() {
		return name;
	}

}