package interfaces;

public interface I1 {
	int x=100;
	void show();
	public static void staticdemo() {
		System.out.println("method from I1");
	}
	default void defmethod() {
		System.out.println("my default method from I1");
	}
}
