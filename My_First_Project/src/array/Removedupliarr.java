package array;

public class Removedupliarr<duplicate> {
    
	public static int  removeduplicateelements(int arr[],int n)
	{
		if(n==0 || n==1)
		{
			return n ;
		}
		int[] temp = new int[n];
		int j=0;
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]!=arr[i+1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n-1];
		for(int i=0;i<j;i++)
		{
			arr[i] = temp[i];
		}
		return j;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[] = {10,20,30,40,50,50};
        int length = arr.length;
        length = removeduplicateelements(arr,length);
         for(int i=0;i<length;i++)
        	 System.out.println(arr[i]+"");
	}

}
