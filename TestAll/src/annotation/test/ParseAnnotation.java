package annotation.test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ParseAnnotation {
	public static void parseTypeAnnotation() throws ClassNotFoundException{
		Class<?> clazz = Class.forName("annotation.test.UserAnnotation");
		Annotation[] annotations = clazz.getAnnotations();
		for(Annotation annotation : annotations){
			TestA testA = (TestA) annotation;
			System.out.printf("id:%s,name:%s,testType:%s,gid:%s",testA.id(),testA.name(),testA.testType(),testA.gid());
			System.out.println();
		}
	}
	
	public static void parseMethodAnnotation(){
		Method[] methods = UserAnnotation.class.getDeclaredMethods();
		for(Method method:methods){
			boolean hasAnnotation = method.isAnnotationPresent(TestA.class);
			if(hasAnnotation){
				TestA testA = method.getAnnotation(TestA.class);
				System.out.printf("id:%s,name:%s,testType:%s,gid:%s",testA.id(),testA.name(),testA.testType(),testA.gid());
			}
			System.out.println();
		}
	}
	
	public static void parseConstructAnnotation(){
		Constructor[] constructors = UserAnnotation.class.getConstructors();
		for(Constructor constructor: constructors){
			boolean hasAnnotation = constructor.isAnnotationPresent(TestA.class);
			if(hasAnnotation){
				TestA testA = (TestA) constructor.getAnnotation(TestA.class);
				System.out.printf("id:%s,name:%s,testType:%s,gid:%s",testA.id(),testA.name(),testA.testType(),testA.gid());
			}
			System.out.println();
		}
	}
	
	public static void parseFieldsAnnotation(){
		Field[] fields = UserAnnotation.class.getDeclaredFields();
		for(Field field:fields){
			boolean hasAnnotation = field.isAnnotationPresent(TestA.class);
			if(hasAnnotation){
				TestA testA = field.getAnnotation(TestA.class);
				System.out.printf("id:%s,name:%s,testType:%s,gid:%s",testA.id(),testA.name(),testA.testType(),testA.gid());
			}
			System.out.println();
		}
	}
	
	public static void  main(String[] args) throws ClassNotFoundException{
		ParseAnnotation.parseTypeAnnotation();
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		ParseAnnotation.parseMethodAnnotation();
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		ParseAnnotation.parseConstructAnnotation();
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		ParseAnnotation.parseFieldsAnnotation();
		
		
	}
}
