package DailyPractice28112020;

public class RemoveJunkValues {

	public static void main(String args[]) {
		String str = "This#string%contains^special*characters&.";
		System.out.println(str.matches("[^a-zA-Z0-9]"));
		str = str.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(str);
	}
}