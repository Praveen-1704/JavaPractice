package program;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		int arr[] = {3,7,4,1,2,5,6,10,8,9};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					
					arr[j]=arr[j+1];
					
					arr[j+1]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Least Number in Array is: "+arr[0]);
		
		System.out.println("Highest Number in Array is: "+arr[arr.length-1]);
	}

}
