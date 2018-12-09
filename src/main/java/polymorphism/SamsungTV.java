package polymorphism;

public class SamsungTV implements TV{
	private Speaker speaker;
	private int price;
	
	//setter injection
	public void setSpeaker(Speaker speaker) {
		System.out.println("setSpeaker 호출");
		this.speaker = speaker;
	}
	public void setPrice(int price) {
		System.out.println("setPrice 호출");
		this.price = price;
	}
	
	public SamsungTV(){
		System.out.println("SamsungTV 생성");
	}
	public SamsungTV(Speaker speaker){
		System.out.println("SamsungTV 생성(Speaker)");
		this.speaker=speaker;
	}
	public SamsungTV(Speaker speaker, int price){
		System.out.println("SamsungTV 생성 (생성자 인젝션) price : "+price);
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
