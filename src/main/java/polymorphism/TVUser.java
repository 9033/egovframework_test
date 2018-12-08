package polymorphism;

public class TVUser{
	public static void main(String[] args){
//		SamsungTV tv = new SamsungTV();
//		tv.powerOn();
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.powerOff();
		LgTV tv = new LgTV();//결합도가 높아서 코드 대부분을 수정해야 된다.
		tv.turnOn();
		tv.soundUp();
		tv.soundDown();
		tv.turnOff();
	}	
}
