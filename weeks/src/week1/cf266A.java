import java.io.IOException;

public class cf266A {

	public static int duplicado_char(String s, int index) {
		if (index >= s.length() || index + 1 >= s.length()) {
			return 0;
		}

		if (s.charAt(index) == s.charAt(index + 1)) {
			return duplicado_char(s, index + 1) + 1;
		}
		return     duplicado_char(s, index + 1);
	}

	//Sin recursion
	public static void duplicado_array(String s) {
		char[] data = s.toCharArray();
		int count = 0;
		for (int index = 0; index < s.length() - 1 ; index++) {
			if (data[index] == data[index + 1]) {
				count++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) throws IOException {
		int n = 4;
		String s = "RRRRRGG";
		int index = 0;
		//System.out.println(duplicado_char(s, index));

		duplicado_array(s);
	}
}
