package generice.test;

public class InfoRun {
	public static void main(String[] args) {
		InfoImpl<String> info1 = new InfoImpl<String>();
		InfoImpl info2 = new InfoImpl();
		info1.setVar("1");
		info2.setVar(12);

		// 通配符？
		InfoRun.fun(info1);
		InfoRun.fun(info2);

		// fun1 指定类型了。受限泛型
		InfoRun.fun1(info2);
		InfoRun.fun2(info1);

		Info<String> info3 = new InfoImpl<String>();
		info3.setVar("test");
		InfoRun.fun2(info3);

		InfoImpl<String> info4 = new InfoImpl<String>();
		System.out.println(info4.test("zhasen"));
		System.out.println(info4.test1("zhasen"));

		Info<Integer> info5 = fun3(432);
		System.out.println(info5.getVar());
		
		InfoImpl<Integer> info6 = new InfoImpl<Integer>();
		InfoImpl<String> info7 = new InfoImpl<String>();
		InfoImpl<Integer> info8 = new InfoImpl<Integer>();
		info6.setVar(123);
		info7.setVar("zhasen");
		info8.setVar(321);
		
		//InfoRun.add(info6, info7);
		InfoRun.add(info6, info8);
	}

	public static void fun(Info<?> temp) {
		System.out.println(temp.getVar().getClass().getName());
		System.out.println(temp.toString());
	}

	public static void fun1(Info<? extends Number> temp) {
		System.out.println(temp.getVar().getClass().getName());
		System.out.println(temp.toString());
	}

	public static void fun2(Info<? super String> temp) {
		System.out.println(temp.getVar().getClass().getName());
		System.out.println(temp.toString());
	}

	public static <T extends Number> Info<T> fun3(T temp) {
		Info<T> param = new InfoImpl<T>();
		param.setVar(temp);
		return param;
	}
	
	public static <T extends String> Info<T> fun4(T temp) {
		Info<T> param = new InfoImpl<T>();
		param.setVar(temp);
		return param;
	}
	
	public static <T> void add(Info<T> info1,Info<T> info2){
		System.out.println(info1.getVar() + ":" + info2.getVar());
	}
	
//	public static <T> T[] listFun(T... arg){
//		
//	}
}
