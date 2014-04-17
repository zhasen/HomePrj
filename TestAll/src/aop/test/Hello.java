package aop.test;

public class Hello implements IHello {

	@Override
	public void sayHello(String name) {
		// TODO Auto-generated method stub
		System.out.println("hello:" + name);
	}

}
