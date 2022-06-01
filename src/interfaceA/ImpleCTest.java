package interfaceA;

public class ImpleCTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImpleC impl= new ImpleC();
		
		interfaceA ia = impl;//자동 타입 변환
		ia.methodA();
		System.out.println();
		
		interfaceB ib = impl;//자동 타입 변환
		ib.methodB();
		System.out.println();
		
		interfaceC ic = impl;//자동 타입 변환
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
