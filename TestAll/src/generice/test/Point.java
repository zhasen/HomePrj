package generice.test;

public class Point<T> {
	private T var;
	
	public T getVar(){
		return this.var;
	}
	
	public void setVar(T var){
		this.var = var;
	}
	
	public static void main(String[] args){
		Point<String> p = new Point<String>();
		p.setVar("zhasen");
		System.out.println(p.getVar());
	}
}
