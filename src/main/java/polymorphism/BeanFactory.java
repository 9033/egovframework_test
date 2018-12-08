package polymorphism;

public class BeanFactory{
	public Object getBean(String beanName){//요청받은 객체를 생성해서 리턴
		if(beanName.equals("samsung")){
			return new SamsungTV();
		}
		else if(beanName.equals("lg")){
			return new LgTV();
		}
		return null;
	}
}
