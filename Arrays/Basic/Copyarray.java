
public class Copyarray {
	public static void main(String args[])
	{
		int arr[] = new int[5];
		int arr2[] = new int[5];
		int i;
		
		for(i=0; i<5; i++)
		{
			arr[i]=i;
			arr2[i]=arr[i];
		}
		for(i=0; i<5; i++)
		{
			System.out.println(arr2[i]);
		}
	}

}
