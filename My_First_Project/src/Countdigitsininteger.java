import java.util.Scanner;

public class Countdigitsininteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int Count=0;
		System.out.println("enter a number::");
		int num=sc.nextInt();
		while(num!=0) {
			num=num/10;
			Count++;
		}
		System.out.println("no of digits in the entered digits are::"+Count);

	}

}
