package annotation.test;

@TestA(gid = Long.class,id=3,name="zhasentest",testType=TestType.B)
public class UserAnnotation {
	@TestA(gid = Long.class,id=55,name="4321",testType=TestType.D)
	private int temp;
	
	@TestA(gid = Long.class,id=55,name="4321",testType=TestType.D)
	protected int temp1;
	
	@TestA(gid = Long.class,id=55,name="4321",testType=TestType.D)
	int temp2;
	
	@TestA(gid = Long.class,id=2,name="fdsa",testType=TestType.C)
	private int age;
	
	@TestA(gid = Long.class,id=4,name="341",testType=TestType.D)
	public UserAnnotation(){}
	
	@TestA(gid = Long.class,id=5,name="fdsa",testType=TestType.E)
	public void a(){}
	
	@TestA(gid = Long.class,id=6,name="grew",testType=TestType.F)
	protected void b(){}
	
	@SuppressWarnings("unused")
	@TestA(gid = Long.class,id=1,name="uytr",testType=TestType.A)
	private void c(){}
	
	@TestA(gid = Long.class,id=9,name="iuty",testType=TestType.D)
	public void d(int a){}

	@TestA(gid = Long.class,id=7,name="gfsd",testType=TestType.E)
	public int getAge() {
		return age;
	}

	@TestA(gid = Long.class,id=45,name="rewqr",testType=TestType.C)
	public void setAge(int age) {
		this.age = age;
	}
}
