package behavioral.observer;

public class Main {

	public static void main(String[] args) {

		ConcreteSubject subject = new ConcreteSubject();

		new ConcreteObserver(subject);
		new ConcreteObserver(subject);

		subject.setState("New estate");
	}

}
