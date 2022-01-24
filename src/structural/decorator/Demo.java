package structural.decorator;

public class Demo {

	public static void main(String[] args) {

		String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";

		FileDataSource fds = new FileDataSource("c://out/OutputDemo.txt");

		DataSourceDecorator encodedEncrypt = new EncryptionDecorator(fds);

		DataSourceDecorator encodeCompress = new CompressionDecorator(encodedEncrypt);

		encodeCompress.writeData(salaryRecords);

		DataSource plain = new FileDataSource("c://out/OutputDemo.txt");

		System.out.println("- Input ----------------");
		System.out.println(salaryRecords);
		System.out.println("- Encoded --------------");
		System.out.println(plain.readData());
		System.out.println("- Decoded --------------");
		System.out.println(encodeCompress.readData());
	}
}
