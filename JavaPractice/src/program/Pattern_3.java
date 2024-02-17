package program;

public class Pattern_3 {
	
	/*
	 *      1
	 *      3 2
	 *      6 5 4
	 *      10 9 8 7
	 */
	
	public static void main(String[] args) {
		
		int rows = 4; // Adjust this for the desired number of rows

        // Outer loop iterates through rows
        for (int i = 1; i <= rows; i++) {
            // Calculate the starting number for each row
            int startNum = (i * (i + 1)) / 2;

            // Inner loop prints numbers in decreasing order within each row
            for (int j = 1; j <= i; j++) {
                System.out.print(startNum - j + 1 + " ");
            }

            System.out.println(); // Move to the next line after each row
	
	}

}
}
