package criacionais.factorymethod;

public class Demo {

	public static void main(String[] args) {
		
		boolean isWindonws = System.getProperty("os.name").equals("Windows 10"); 
		Dialog dialog; 
		
		if(isWindonws) {
			
			dialog = new WindowsDialog();
		}
		else {
			dialog = new HtmlDialog();
		}
		
		dialog.renderWindow(); 
	}
	
}
