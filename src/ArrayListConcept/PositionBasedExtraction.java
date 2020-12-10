package ArrayListConcept;

import java.util.ArrayList;

public class PositionBasedExtraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arr = new ArrayList<Integer>();

		arr.add(12);
		arr.add(89);
		arr.add(76);
		arr.add(65);
		arr.add(34);
		arr.add(13);

		arr.stream().forEach(element -> System.out.println(element));

		for (Integer arrlist : arr) {
			System.out.println(arrlist);
		}
	}

}
