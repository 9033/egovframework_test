package polymorphism;

public class TVUser{
	public static void main(String[] args){
//		SamsungTV tv = new SamsungTV();
//		tv.turnOn();
//		tv.soundUp();
//		tv.soundDown();
//		tv.turnOff();
		LgTV tv = new LgTV();
		tv.turnOn();
		tv.soundUp();
		tv.soundDown();
		tv.turnOff();
	}	
}
