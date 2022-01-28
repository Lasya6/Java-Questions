
public class LeftRotate {
	public static void main(String args[])
	{
		//n- no of times to rotate
		int n,i,j,first;
		n=3;
		int arr[]={1,2,3,4,5};
		for(i=0; i<n; i++)
		{
			first=arr[0];
			for(j=0; j<arr.length-1; j++)
			{
				arr[j]=arr[j+1];
			}
			arr[j]=first;
		}
		for(i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}

}
