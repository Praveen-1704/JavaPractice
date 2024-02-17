package array;


public class Two_D_Array {
	
	
	public static void main(String[] args) {
		
		int arr[][] = new int[2][3];
		
		arr[0][0] = 12;
		arr[1][0] = 2;
		arr[0][1] = 3;
		arr[1][1] = 45;
		arr[0][2] = 21;
		arr[1][2] = 90;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println(arr[i][j]);
			}
		}
		
		
		
	}

}
