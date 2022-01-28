
public class frequencyofeach {
	public static void main(String args[])
	{
		int arr[]= {1,2,4,3,2,2,2,3,5,6};
		int i,j,l,count=0;;
		l=arr.length;
		int freq[]=new int[l];
		int visited=-1;
		
		for(i=0; i<l; i++)
		{
			count=1;
			for(j=i+1; j<l; j++)
			{
				if(arr[i]==arr[j]) {
					count++;
				freq[j]=visited;}
			}
			if(freq[i]!=visited)
				freq[i]=count;
		}
		for(i=0; i<freq.length; i++)
			if(freq[i]!=visited)
			System.out.println(arr[i]+" "+freq[i]);
	}

}
