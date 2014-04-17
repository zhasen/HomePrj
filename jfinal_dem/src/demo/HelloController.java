package demo;

import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;

public class HelloController extends Controller{
	public void index(){
		renderText("Hello JFinal World.");
	}
	
	public void test(){
		renderText("test action");
		getPara("");
	}
	
	@ActionKey("loginaction")
	public void login(){
		renderText("login");
	}
}
