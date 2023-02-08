package CodingInterview;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// To check the common numbers in an array //
		
		int array1[] = {0, 3, 5, 7, 9, 12, 15};
		int array2[] = {3, 7, 10, 11, 5, 13, 12};
		
		int i,j;
		
		for(i=0; i<array1.length; i++) {
			
			for (j=0; j<array2.length; j++) {
				
				if(array1[i] == array2[j]) {
					
					System.out.println(array1[i]+" ");
				}
			}
		}
	}

}
