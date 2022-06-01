package tire;

public class Car {
	/*
	Tire frontLeftTire = new HankookTire();
	Tire frontRihgtTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRihgtTire = new HankookTire();
	*/
	Tire[] tires = {
			new HankookTire(),
			new HankookTire(),
			new HankookTire(),
			new HankookTire(),
	};
	
	void run() {
		/*
		frontLeftTire.roll();
		frontRihgtTire.roll();
		backLeftTire.roll();
		backRihgtTire.roll();
		*/
		for(Tire tire : tires) {
			tire.roll();
		}
		/*
		for(int i=0; i<tires.length; i++) {
			tires[i].roll();
		}
		*/
	}

}


