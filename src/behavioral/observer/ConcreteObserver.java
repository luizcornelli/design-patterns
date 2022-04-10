package behavioral.observer;

public class ConcreteObserver extends Observer {

	private ConcreteSubject concreteSubject;

	public ConcreteObserver(ConcreteSubject subject) {

		this.concreteSubject = subject;
		this.concreteSubject.attatch(this);
	}

	@Override
	public void update() {

		System.out.println("Object notify ! | Estate = " + this.concreteSubject.getState());
	}

}
