import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class uva12468 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int a, b, max1, max2;
		while (true) {
			String input = reader.readLine();
			String[] array_input = input.split(" ");

			a = Integer.parseInt(array_input[0]);
			b = Integer.parseInt(array_input[1]);

			if (a == -1 && b == -1) {
				break;
			}

			if (b >= a) {
				max1 = b - a;
				max2 = 100 - (b - a);
			} else {
				max1 = a - b;
				max2 = 100 - (a - b);
			}

			writer.write(Math.min(max1, max2) + "\n");
			writer.flush();
		}
		writer.close();
	}
}
