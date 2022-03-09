package basic_concepts;

public class Staticdemo {
   static String s2;
   String s1;
   final static int x;
   static {
	   x=100;
	   System.out.println("static blow " + x);
   }
   public Staticdemo(String s1,String s2) {
	   this.s1 = s1;
	   this.s2 = s2;
   }
   static void display() {
	   System.out.println(s2);
   }
   void show() {
	   System.out.println(s2 + "is a" + s1);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Staticdemo obj = new Staticdemo("programming language","java");
       Staticdemo obj1 = new Staticdemo("programming language","python");
       
       obj1.show();
       obj.show();
       display();
       
       
	}

}
