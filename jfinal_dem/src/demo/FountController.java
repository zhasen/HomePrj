package demo;

import com.jfinal.aop.Before;
import com.jfinal.aop.ClearInterceptor;
import com.jfinal.aop.ClearLayer;
import com.jfinal.core.Controller;

public class FountController extends Controller{
	
	@Before(Demo2Interceptor.class)
	public void test(){
		renderText("test111");
		new User().set("name", "zhasen").set("age", "29").set("sex", "男").set("hobby", "guniang").save();
	}
	
	@ClearInterceptor(ClearLayer.ALL)
	public void index(){
		renderText("ttttt");
	}
}
