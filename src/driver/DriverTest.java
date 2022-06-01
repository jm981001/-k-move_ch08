package driver;

public class DriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus); //자동 타입 변환
		driver.drive(taxi); //자동 타입 변환

	}

}
