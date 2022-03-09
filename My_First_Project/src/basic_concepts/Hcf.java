package basic_concepts;

import java.util.Scanner;

public class Hcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		int num1,num2;
		;
		System.out.println("enter two numbers");
		num1 = Sc.nextInt();
		num2 = Sc.nextInt();
		int temp2=num2;
		while(temp2!=0)
		{
			int temp=temp2;
			temp2=num1%temp2;
			num1=temp;
			System.out.println("Hcf of:"+num1+" and "+num2+"is:"+num1);
			
	
		}

	}

}
