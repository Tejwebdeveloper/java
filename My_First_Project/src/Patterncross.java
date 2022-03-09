
public class Patterncross {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=2;
        int k=n*2-1;
        for(int i=1;i<=k;i++) {
        	for(int j=1;j<=k;j++) {
        		if(j==i || j==k-i+1) {
        			System.out.println("*");
        		}
        		System.out.print(" ");
        	}
        	System.out.println();
        }
	}

}
