package program;

import java.util.Arrays;

public class Missing_number_2nd_Time {

	public static void main(String[] args) {
		
		int arr[] = {4,5,1,8,10,6};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		// [1, 4, 5, 6, 8, 10]
		int i=arr[0];
		int j=0;
		
		while(j<arr.length)
		{
			if(i==arr[j])
			{
				i++;
				j++;
			}
			else
			{
				System.out.println(i);
				i++;
			}
		}
	}
}
