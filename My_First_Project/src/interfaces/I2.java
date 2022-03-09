package interfaces;

public interface I2 {
	int s=100;
	void show();
	public static void display() {
		System.out.println("belongs to I2");
	}
	default void display1() {
		System.out.println("default mrthod from I2");
	}
}

