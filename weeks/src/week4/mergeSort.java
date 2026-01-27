public class mergeSort {
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void mergeSort(int inicio, int fin, int[] v) {
		// divide
		if (inicio < fin) {
			// punto medio
			int mitad = (inicio + fin) / 2;

			// Llamadas recursivas para ordenar cada mitad
			mergeSort(inicio, mitad, v);
			mergeSort(mitad + 1, fin, v);

			// Unir las dos mitades ordenadas
			merge(inicio, mitad, fin, v);
		}
	}

	public static void merge(int inicio, int mitad, int fin, int[] v) {
		// Tamaño de los subarrays
		int n1 = mitad - inicio + 1;
		int n2 = fin - mitad;

		// Arrays temporales
		int[] vectorIzquierdo = new int[n1];
		int[] vectorDerecho = new int[n2];

		// Copiar datos a los arrays temporales
		for (int i = 0; i < n1; i++)
			vectorIzquierdo[i] = v[inicio + i];
		for (int i = 0; i < n2; i++)
			vectorDerecho[i] = v[mitad + 1 + i];

		// Mezclar los arrays temporales
		int i = 0, k = 0, index = inicio;
		while (i < n1 && k < n2) {
			if (vectorIzquierdo[i] <= vectorDerecho[k]) {
				v[index] = vectorIzquierdo[i];
				i++;
			} else {
				v[index] = vectorDerecho[k];
				k++;
			}
			index++;
		}

		// Copiar elementos restantes de los arrays temporales
		while (i < n1) {
			v[index] = vectorIzquierdo[i];
			i++;
			index++;
		}

		while (k < n2) {
			v[index] = vectorDerecho[k];
			k++;
			index++;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 38, 27, 43, 3, 9, 82, 10 };
		System.out.println("Arreglo original:");
		printArray(arr);

		mergeSort(0, arr.length - 1, arr);

		System.out.println("Arreglo ordenado:");
		printArray(arr);
	}
}
