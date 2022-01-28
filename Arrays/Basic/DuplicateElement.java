
public class DuplicateElement {
	public static void main(String args[])
	{
		int arr[]= {1,1,2,2,3,4,5};
		
		int i,j,l;
		l=arr.length;
		for(i=0; i<l; i++)
		{
			for(j=i+1; j<l; j++)
			{
				if(arr[i]==arr[j])
					System.out.println(arr[j]);
			}
		}
	}

}
