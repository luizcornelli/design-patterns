package criational.abstractfactory;

public class Application {

	private Button button;
	private CheckBox checkbox;

	public Application(GUIFactory guiFactory) {

		button = guiFactory.createButton();
		checkbox = guiFactory.createCheckbox();
	}

	public void paint() {

		button.paint();
		checkbox.paint();
	}

}
