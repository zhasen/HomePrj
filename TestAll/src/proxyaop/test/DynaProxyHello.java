package proxyaop.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynaProxyHello implements InvocationHandler {

//	public DynaProxyHello(Object delegate) {
//		this.delegate = delegate;
//	}

	/**
	 * 要处理的对象(也就是我们要在方法的前后加上业务逻辑的对象,如例子中的Hello)
	 */
	public Object delegate;

	public Object bind(Object delegate) {
		this.delegate = delegate;
		return Proxy.newProxyInstance(
				this.delegate.getClass().getClassLoader(), this.delegate.getClass()
						.getInterfaces(), this);
	}

	/**
	 * 要处理的对象中的每个方法会被此方法送去JVM调用,也就是说, 
	 * 要处理的对象的方法只能通过此方法调用 此方法是动态的,不是手动调用的
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] arg)
			throws Throwable {
		Object result = null;
		try {
			System.out.println(method.getName() + "Method end ...");
			result = method.invoke(this.delegate, arg);
			System.out.println(method.getName() + "Method start ...");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
