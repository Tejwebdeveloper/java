import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Bufferreaderdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader brr = new BufferedReader(r);
		System.out.println("enter your name");
		String name=" ";
		try {
			name = brr.readLine();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("enter your age");
		int x=0;
		try {
			x = Integer.parseInt(brr.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("welcome" + name);
		System.out.println("your lucky age is:"+x);
		

	}

}
