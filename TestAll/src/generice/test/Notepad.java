package generice.test;

public class Notepad<K,V> {
	private K key;
	private V value;
	
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
	public static void main(String[] args){
		Notepad note = new Notepad<String, Integer>();
		note.setKey("test");
		note.setValue(12);
		System.out.println("name:"+note.getKey());
		System.out.println("age:"+note.getValue());
	}
}
