import java.util.ArrayList;
import java.util.Arrays;

public class Gonna {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.addAll(Arrays.asList(7, 7, 5, 6, 8, 9, 1, 3, 3, 9, 6, 8, 1));
		System.out.println(arr.size() + " first size");
		
		int answer = 0;

		boolean nope = false;
		while(nope != true) {
			int x = arr.get(0);
			int temp = arr.size();
			
			for(int i = 1; i < arr.size(); i++) {
				if(x == arr.get(i)) {
					arr.remove(x);
					arr.remove(i);
					System.out.println(arr.size() + " current size");
					System.out.println(temp + " original size");
				}
				if(temp == arr.size()) {
					answer = x;
					nope = true;
				}
			}

		}

		System.out.println(answer + " is the odd man out.");
	}

}
