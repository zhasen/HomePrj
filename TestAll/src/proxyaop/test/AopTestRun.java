package proxyaop.test;


public class AopTestRun {
	
	public static void main(String[] args){
		IHello h = new Hello();
		h.sayHello("zhasen");
		h.sayGoodbye("zhasen");
		
//		ClassLoader classLoader = h.getClass().getClassLoader();
//		Class [] intefaces = h.getClass().getInterfaces();
//		InvocationHandler handler = new DynaProxyHello(h);
//		IHello hello = (IHello)Proxy.newProxyInstance(classLoader, intefaces, handler);
//		
//		hello.sayGoodbye("zhasen");
//		hello.sayHello("zhasen");
		
		
		IHello hello = (IHello)new DynaProxyHello().bind(new Hello());
		
		
		hello.sayHello("zhasen");
		hello.sayGoodbye("zhasen");
	}
}


