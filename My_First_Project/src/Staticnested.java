
public class Staticnested {
	void outerhello()
	{
		System.out.println("my class1");
	}
	static class innerdemo{
		int x=100;
		void innerhello() {
			Staticnested obj = new Staticnested();
			obj.outerhello();
			System.out.println("my inner class1");
		}
	}
     void demomethod() {
    	 System.out.println("demomethod");
    	 innerdemo obj = new innerdemo();
    	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Staticnested.innerdemo obj1 = new Staticnested.innerdemo();
        obj1.innerhello();
	}

}
