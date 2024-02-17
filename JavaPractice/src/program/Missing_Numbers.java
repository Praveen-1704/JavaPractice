package program;


public class Missing_Numbers {
	
	
	public static void main(String[] args) {
		
		int arr[] = {2,6,7,9,3,4};
		
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
		
		int i =arr[0];
		
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
