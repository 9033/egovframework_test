package polymorphism;

public class AppleSpeaker implements Speaker {
	public AppleSpeaker(){
		System.out.println("AppleSpeaker 생성");
	}
	@Override
	public void soundUp() {
		// TODO Auto-generated method stub
		System.out.println("AppleSpeaker 소리 올린다");
	}

	@Override
	public void soundDown() {
		// TODO Auto-generated method stub
		System.out.println("AppleSpeaker 소리 내린다");
	}

}
