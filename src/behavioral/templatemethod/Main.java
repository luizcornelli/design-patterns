package behavioral.templatemethod;

public class Main {

	public static void main(String[] args) {
		
		AbstractClass abstractClass = null; 
		
		abstractClass  = new ConcreteAbstractClass();
		abstractClass.templateMethod();
		
		abstractClass = new ConcreteAbstractClass2();
		abstractClass.templateMethod();
	}

}
