package aop.test;

public class RunTest {
	public static void main(String[] args){
		IHello temp = new HelloProxy(new Hello());
		
		temp.sayHello("zhasen");
	}
}
