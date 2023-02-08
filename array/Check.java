package array;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[] = {8, 15, 6, 21, 25, 20};
		int arr2 []	= {3, 8, 9, 15, 21, 25, 30};
		
		int i, j;
		
		for(i=0; i<arr1.length; i++) {
			
			for (j=0; j<arr2.length; j++) {
				
				if (arr1[i] == arr2[j]) {
					
					System.out.println(arr1[i]+" ");
				}
			}
		}
		
	}

}
