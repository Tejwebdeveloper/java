
public class Findelemnt {
    
	static void findMissing(int a[], int b[],int n, int m)
    {
      for (int i = 0; i < n; i++)
  {
     int j;

    for (j = 0; j < m; j++)
    if (a[i] == b[j])
	break;

    if (j == m)
    System.out.print(a[i] + " ");
      }
        }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5,6,7,10 };
		int b[] = { 2, 3, 1, 0,5 };
		
		int n = a.length;
		int m = b.length;
		
		findMissing(a, b, n, m);
	}
	}


