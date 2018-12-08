package polymorphism;

public class TVUser{
	public static void main(String[] args){
		BeanFactory factory = new BeanFactory();
		TV tv=(TV)factory.getBean(args[0]);
		tv.turnOn();
		tv.soundUp();
		tv.soundDown();
		tv.turnOff();
	}	
}