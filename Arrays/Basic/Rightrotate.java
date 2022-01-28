

public class Rightrotate {
	public static void main(String args[])
	{
		//n- no of times to rotate
		int n,i,j,last;
		n=3;
		int arr[]={1,2,3,4,5};
		for(i=0; i<n; i++)
		{
			last=arr[arr.length-1];
			for(j=arr.length-1; j>0; j--)
			{
				arr[j]=arr[j-1];
			}
			arr[0]=last;
		}
		for(i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}

}
