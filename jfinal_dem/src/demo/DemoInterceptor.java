package demo;

import com.jfinal.aop.Interceptor;
import com.jfinal.core.ActionInvocation;



public class DemoInterceptor implements Interceptor{

	public void intercept(ActionInvocation ai) {
		// TODO Auto-generated method stub
		System.out.println("before action invoking");
		ai.invoke();
		System.out.println("after action invoking");
	}
	

}
