
public class MainClass {

	public static void main(String[] args) {
		
		//工厂类创建具体工厂角色,具体工厂角色中返回对应的产品
		DriverFactory df = new BenzDriver();
		Car benz = df.creatCar();
		benz.drive();
		
		DriverFactory df2 = new BmwDriver();
		Car bmw = df2.creatCar();
		bmw.drive();
		
		DriverFactory df3 = new AudiDriver();
		Car audi = df3.creatCar();
		audi.drive();
	}

}
