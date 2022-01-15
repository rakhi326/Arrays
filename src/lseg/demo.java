package lseg;

public class demo {

	public static void main(String[] args) {
		//Find the intersection of the given arrays and print the resulting array.
		int arr1[] = {7, 1, 5, 2, 3, 6};
		int n=arr1.length;
		int arr2[] = {3, 8, 6, 20, 7};
		int s=arr2.length;
		int a[]=new int[5];
		int k=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<s;j++)
			{
				if(arr1[i]==arr2[j])
				{
					a[k++]=arr1[i];
				}
			}
		}

		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
