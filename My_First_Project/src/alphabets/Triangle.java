package alphabets;
import java.util.Scanner;
public class Triangle {
   
	private static Scanner sc;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        sc = new Scanner(System.in);
        System.out.println("enter triangle char pattern rows=");
        int rows = sc.nextInt();
        System.out.println("printing triangle char alpha");
        for(int i=0; i<rows; i++) {
        	int alphabet=65;
        	for(int j=rows; j>i; j--)
        	{
        	 System.out.println(" ");
        	}
        	for(int k=0; k<=i; k++) {
        		System.out.println( (char)(alphabet + k) +" ");
        	}
        		System.out.println();
        	}
        
	}

}
