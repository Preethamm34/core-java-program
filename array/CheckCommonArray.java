package array;

public class CheckCommonArray {
	
	public static void main(String [] args) {
		

	int array1[] = {20, 30, 2, 23, 56, 15, 61, 77, 75, 99, 100}; 
	int array2[] = {2, 10, 23, 67, 56, 65, 99, 75, 34, 20};
	
	int i, j;
	
	for (i=0; i<array1.length; i++) {
		for (j=0; j<array2.length; j++) {
			if (array1[i]==array2[j]) {
				System.out.println(array1[i]);
			}
			
		}
	}
	
}
}
