package basic_concepts;
import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,y,x,reverse=0;
		Scanner Sc = new Scanner(System.in);
		System.out.println("enter a num to check it is armstrong or not");
		num = Sc.nextInt();
		x=num;
		When(num!=0);
		{
			y=num%10;
			reverse = reverse+(y*y*y);
			num=num/10;
			
			
		}
		if(x==reverse)
		{
			System.out.println("num is Armstrong");
		}
		else
		{
			System.out.println("num is not Armstrong");
		}
		
		
		
		
		
		
		

	}

	private static void When(boolean b) {
		// TODO Auto-generated method stub
		
	}

}
