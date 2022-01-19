package criacionais.abstractfactory;

public class Demo {

	public static void main(String[] args) {

		GUIFactory factory;

		String osName = System.getProperty("os.name").toLowerCase();

		if (osName.contains("mac")) {

			factory = new MacOSFactory();

		} else {
			factory = new WindowsFactory();
		}

		Application application = new Application(factory);
		application.paint();
	}
}
