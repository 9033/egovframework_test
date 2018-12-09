package polymorphism;

public class SamsungTV implements TV{
	private SonySpeaker speaker;
	private int price;
	
	public SamsungTV(){
		System.out.println("SamsungTV 생성");
	}
	public SamsungTV(SonySpeaker speaker, int price){
		System.out.println("SamsungTV 생성 (생성자 인젝션)");
		this.speaker=speaker;
		this.price=price;
	}
	public void initMethod(){
		System.out.println("SamsungTV initMethod");
	}
	public void destoryMethod(){
		System.out.println("SamsungTV destorytMethod");
	}
	public void turnOn(){
		System.out.println("SamsungTV 전원 켠다. 가격 : "+price);
	}
	public void turnOff(){
		System.out.println("SamsungTV 전원 끈다.");
	}
	public void soundUp(){
		//speaker =new SonySpeaker();
		speaker.soundUp();
	}
	public void soundDown(){
		//speaker =new SonySpeaker();
		speaker.soundDown();
	}	
}
