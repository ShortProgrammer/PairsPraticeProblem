import java.util.Arrays;

public class FindTheSingle {

	public static void main(String[] args) {
		int[] arr = {7, 7, 5, 6, 8, 9, 1, 3, 3, 9, 6, 8, 1};
//		{7, 7, 5, 6, 8, 9, 1, 3, 3, 9, 6, 8, 1
//		1,7,1,5,1,5,7
//		0,0,0,0,0,1,1,4,2,3,2,2,3,3,2,0
		int x = 0;
		
		//Presorted
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		System.out.println("--------------------");
		
		Arrays.sort(arr);
		
		//Postsorted
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		//Finding the odd man out
		for(int i = 0; i < arr.length; i++) {
			if((i < arr.length-1) && (arr[i] != arr[i+1]) && ((i/2) != 1) && (arr[i] != arr[i-1])) {
				x = arr[i];
			}
		}
		
		System.out.println();
		System.out.println("--------------------");
		
		if(x == 0) {
			System.out.println("All are pairs.");
		}
		else {
			System.out.println(x + " does not have a pair.");
		}
	}
}