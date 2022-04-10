package behavioral.templatemethod;

public abstract class AbstractClass {

	public void templateMethod() {

		primitiveOperationOne();
		primitiveOperationTwo();
	}

	public abstract void primitiveOperationOne();

	public abstract void primitiveOperationTwo();
}
