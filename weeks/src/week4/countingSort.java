public class countingSort {
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
	}
    
	public static void countingSort(int[] arr) {
		// Hallamos el máximo valor en O(n)
		int max_val = arr[0];
		for (int num : arr) {
			if (num > max_val) {
				max_val = num;
			}
		}

		// Creamos el arreglo count y lo inicializamos en 0 hasta la posicion max_val
		// En Java al crear un arreglo se inicia en 0
		int[] count = new int[max_val + 1];

		// Recorremos el arreglo original y contamos los valores
		for (int num : arr) {
			count[num]++;
		}

		// Vaciamos count para obtener el arreglo ordenado
		int index = 0;
		for (int i = 0; i <= max_val; i++) {
			while (count[i] > 0) {
				arr[index++] = i;
				count[i]--;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 4, 2, 2, 8, 3, 3, 1 };
		System.out.println("Arreglo original:");
		printArray(arr);
		countingSort(arr);

		System.out.println("Arreglo ordenado:");
		printArray(arr);
	}
}
