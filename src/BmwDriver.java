
public class BmwDriver implements DriverFactory {

	public Car creatCar() {
		return new Bmw();
	}

}
