package alphabets;

public class Square_Alphabet {

	public static void main(String[] args) {
	//	square();
		reverse();
	}
	
	public static void square()
	{
		 
		for(int i=1;i<=10;i++)
		{
			int a=64;
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+(char)(a+j));
			}
			System.out.println();
		}
	}
	
	public static void reverse()
	{
		for(int i=5;i>=1;i--)
		{
			for(int j=5;j>=1;j--);
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	

}
