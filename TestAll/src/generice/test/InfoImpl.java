package generice.test;

public class InfoImpl<T> implements Info<T>{
	private T var;

	@Override
	public T getVar() {
		return var;
	}
	
	@Override
	public void setVar(T var) {
		this.var = var;
	}
	
	@Override
	public String toString(){
		return this.var.toString();
	}
	
	public<T> T test(T var){
		return var;
	}
	
	public T test1(T var){
		return var;
	}
}


