import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class cf271A {

	public static void main(String[] args) throws IOException {
		int y = 1993;
		int year_aux = y;
		while (true) {
			year_aux = y; //guarda el year
			Map<Integer, Boolean> map = new HashMap<>();
			boolean esDuplicado = false;
			while (y != 0) {
				int temp = y % 10;
				// Comprobar si existe el digito
				if (map.containsKey(temp)) {
					esDuplicado = true;
					break;
				} else {
					//No se encontro digitos duplicados entonces lo guardamos
					map.put(temp, true);
				}
				y = y / 10; //se sobre escribe, se pierde
			}

			y = year_aux; //restauramos el valor original
			if (esDuplicado) {
				y++;
			} else {
				System.out.println(y);
				break;
			}
		}

	}
}
