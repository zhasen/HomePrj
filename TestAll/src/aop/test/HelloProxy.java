package aop.test;

public class HelloProxy implements IHello {

	public IHello hello;
	
	public HelloProxy(IHello temp){
		this.hello = temp;
	}
	
	@Override
	public void sayHello(String name) {
		// TODO Auto-generated method stub
		System.out.println("start...");
		this.hello.sayHello(name);
		System.out.println("end...");
	}

}
