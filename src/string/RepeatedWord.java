package string;

public class RepeatedWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hello How are you Hello I am fine";
		String strcmp = s.toUpperCase();
		String words[] = strcmp.split(" ");

		int len = words.length;

		for (int i = 0; i < len; i++) {

			int count = 1;
			for (int j = i+1; j < len; j++) {
				if (words[i].equals(words[j])) {
					count++;
					words[j] = "0";
				}
			}

			if (words[i] != "0" && count > 1) {
				System.out.println("Duplictae values :-" +words[i]);

			}
			
		}

	}
}