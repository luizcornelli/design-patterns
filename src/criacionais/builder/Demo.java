package criacionais.builder;

public class Demo {

	public static void main(String[] args) {

		Director director = new Director();
		CarBuilder builder = new CarBuilder();

		director.constructSUV(builder);

		Car car = builder.getResult();

		System.out.println("Car built:\n" + car.getCarType());

		CarManualBuilder manualBuilder = new CarManualBuilder();

		director.constructSUV(manualBuilder);

		Manual carManual = manualBuilder.getResult();

		System.out.println("\nCar manual built:\n" + carManual.print());
	}

}
