package demo;

import com.jfinal.config.Routes;

public class FrontRoutes extends Routes{

	@Override
	public void config() {
		// TODO Auto-generated method stub
		add("aaa",FountController.class);
	}

}
