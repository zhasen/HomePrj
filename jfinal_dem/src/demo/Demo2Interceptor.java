package demo;

import com.jfinal.aop.Interceptor;
import com.jfinal.core.ActionInvocation;

public class Demo2Interceptor implements Interceptor{

	public void intercept(ActionInvocation ai) {
		System.out.println("action before invoking");
		ai.invoke();
		System.out.println("action after invoking");
	}

}
