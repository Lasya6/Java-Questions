
public class SortAO {
	public static void main(String args[])
	{
		int arr[]= {6,3,2,5,1,2};
		
		int i,j,l,temp=0;
		l=arr.length;
		for(i=0;i<l;i++)
		{
			for(j=i+1; j<l;j++)
			{
				if(arr[i]>arr[j]) {
					temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
		}
		for(i=0; i<l; i++)
			System.out.println(arr[i]);
	}

}
