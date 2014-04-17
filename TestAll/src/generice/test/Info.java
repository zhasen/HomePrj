package generice.test;

public interface Info<T> {
	String toString();
	T getVar();
	void setVar(T temp);
}
