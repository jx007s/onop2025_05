package lamda_p;

import java.util.ArrayList;

public class CollectionNumMain {

	public static void main(String[] args) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		for (int i : new int[]{13,25,45,67,88,92,14,55,52,54,93,26,38,11,75}) {
			arr1.add(i);
		}
		
		ArrayList<Integer> arr2 = (ArrayList<Integer>)arr1.clone();
		System.out.println(arr1);
		
		
		
		arr1.removeIf(i-> i%2==0 || i %3==0);
		
		System.out.println(arr1);
		System.out.println(arr2);
		
		arr2.removeIf(i-> {
			boolean res = true;
			for (int j = 2; j < i; j++) {
				if(i % j == 0) {
					res = false;
					break;
				}
			}
			return res;
		});

		System.out.println(arr2);
	}

}
