package basic_concepts;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=0,sum=0,temp;
		int n=45;
		temp=n;
		while(n>0) {
		sum = (sum*10)+r;
			n = n/10;
		}
		if(temp==sum)
		{
			System.out.println("the num is palindrome");
		}
		else {
			System.out.println("the num is not palindrome");
		}

	}

}
