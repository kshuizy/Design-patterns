
public class BenzDriver implements DriverFactory {

	public Car creatCar() {
		return new Benz();
	}

}
