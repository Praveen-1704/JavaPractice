package program;

public class Remove_Duplicate_From_Array {
	
	public static void main(String[] args) {
		
		int arr[]= {1,1,3,5,2,3,2,4,2,7};
		
		for(int i=0;i<arr.length;i++)
		{
			int j=0;
			for(;j<i;j++)
			{
				if(arr[i]==arr[j])
				{
					break;
				}
			}
			
			if(i==j)
			{
				System.out.println(arr[i]);
			}
		}
	}

}
