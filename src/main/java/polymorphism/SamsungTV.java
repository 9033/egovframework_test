package polymorphism;

public class SamsungTV implements TV{
	private Speaker speaker;
	private int price;
	
	//setter injection : property 엘리먼트를 사용하거나 p namespace사용
	public void setSpeaker(Speaker speaker) {
		System.out.println("setSpeaker 호출");
		this.speaker = speaker;
	}
	public void setPrice(int price) {
		System.out.println("setPrice 호출");
		this.price = price;
	}
	
	public SamsungTV(){//생성자
		System.out.println("SamsungTV 생성");
	}
	public SamsungTV(Speaker speaker){//constructor injection : constructor-arg엘리먼트 사용
		System.out.println("SamsungTV 생성(Speaker)");
		this.speaker=speaker;
	}
	public SamsungTV(Speaker speaker, int price){//constructor injection - mapping
		System.out.println("SamsungTV 생성 (생성자 인젝션) price : "+price);
		this.speaker=speaker;
		this.price=price;
	}
	public void initMethod(){//bean 엘리먼트 속성 - init-method 속성 : 객체를 생성한 이후에 호출
		System.out.println("SamsungTV initMethod");
	}
	public void destroyMethod(){//bean 엘리먼트 속성 - destroy-method 속성 : 객체를 생성한 이후에 호출
		System.out.println("SamsungTV destroytMethod");
	}
	
	//TV interface에 맞는 메소드
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
