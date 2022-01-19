package criacionais.factorymethod;

public class WindowsDialog extends Dialog {

	@Override
	public Button createButton() {

		return new WindonwsButton();
	}

}
