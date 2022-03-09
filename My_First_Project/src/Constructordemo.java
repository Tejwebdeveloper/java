
public class Constructordemo {
public Constructordemo(){
	System.out.println("default constructor");
	
}
public Constructordemo(int x) {
	System.out.println("parameterized value is ::"+ x);
}



	public static void main(String args[]) {
		// TODO Auto-generated method stub
	
         new Constructordemo();
         new Constructordemo(10);
	}
}

