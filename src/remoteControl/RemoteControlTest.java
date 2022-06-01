package remoteControl;

public class RemoteControlTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RemoteControl rc;
		rc = new Television(); //자동 타입 변환
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);
		rc = new Audio(); //자동 타입 변환
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);
		RemoteControl.changeBattery();
	}

}
