package criational.factorymethod;

public class HtmlDialog extends Dialog {

	@Override
	public Button createButton() {

		return new HtmlButton();
	}

}
