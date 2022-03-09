import java.util.Scanner;

public class Demoofmethods {
	private String email;
	public String display1 (String name)
	{
		String s="welcome to java"+ name;
		return s;
	}
	public void display2 (long contact)
	{
		System.out.println("my contact number is:"+ contact);
	}
    public String display3()
    {
    	String em=email+"@gmail.com";
    	return em;
    }
    public void display4() {
    	System.out.println("my details::");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sn = new Scanner(System.in);
        Demoofmethods obj=new Demoofmethods();
        obj.display4();
        String s=obj.display1("TEJASWINI");
        System.out.println(s);
        obj.display2(90365880);
        String em=obj.display3();
        System.out.println(em);
        
        }

}
