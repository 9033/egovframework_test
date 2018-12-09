package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser{
	public static void main(String[] args){
		//스프링 컨테이너를 구동한다
		AbstractApplicationContext factory=new GenericXmlApplicationContext("applicationContext.xml");
		
		//스프링 컨테이너에서 객체를 요청함.
		TV tv=(TV)factory.getBean("tv");
		tv.turnOn();
		tv.soundUp();
		tv.soundDown();
		tv.turnOff();
		
		//객체를 또 요청해도 한번만 생성. bean의 scope가 singletone(기본값)일떄.
		TV tv2=(TV)factory.getBean("tv");
		
		//스프링 컨테이너 종료
		factory.close();
	}	
}
