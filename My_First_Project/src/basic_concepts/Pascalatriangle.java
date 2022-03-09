package basic_concepts;
import java.util.Scanner;
public class Pascalatriangle {
	
	public static void main(String args[]) 
	{
		int num;
		Scanner Sn = new Scanner(System.in);
		
		System.out.print("enter the row size of pascal triangle:");
		int row = Sn.nextInt();
		
		for(int i=0; i<row; i++)
		{
			for(int space=row; space>i; space--)
				System.out.print(" ");
			
			num=1;
			for(int j=0; j<=i; j++)
			{
				System.out.print(num+ " ");
				num = num*(i-j)/(j+1);
			}
			System.out.print("\n ");
		}
		
		}
		

}


