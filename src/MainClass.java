
public class MainClass {

	public static void main(String[] args) {
		
		//�����ഴ�����幤����ɫ,���幤����ɫ�з��ض�Ӧ�Ĳ�Ʒ
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
