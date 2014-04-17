package proxyaop.test;

public interface IHello {
	
	/**
	 * 业务方法A
	 * @param name
	 */
	void sayHello(String name);
	
	/**
	 * 业务方法B
	 * @param name
	 */
	void sayGoodbye(String name);
}
