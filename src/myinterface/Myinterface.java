package myinterface;

public interface Myinterface {
	public void method1();
	
	public default void method2(){
		System.out.println("Myinterface-method2 ����");
	}
	
}	

