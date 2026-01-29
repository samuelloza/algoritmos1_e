import java.util.Scanner;

public class A160A {

    public static void bubbleSort(int vec[]) {
        int limite = vec.length;
        for (int i = limite; i >= 1; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (vec[j] < vec[j + 1]) {
                    // Intercambiamos los elementos
                    int aux = vec[j];
                    vec[j] = vec[j + 1];
                    vec[j + 1] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int total = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            total = total + a[i]; // Contando las monedas
        }

        // SOlve
        bubbleSort(a);

        /*
         * for (int i = 0; i < a.length; i++) {
         * System.out.println(a[i] + " ");
         * }
         */

        // System.out.println("Total " + total);
        int moneda_gemelo_1 = 0;
        int ans = 1;
        for (int i = 0; i < a.length; i++) {
            moneda_gemelo_1 = moneda_gemelo_1 + a[i];
            total = total - a[i];

            // System.out.println("Gemelo1.- " + moneda_gemelo_1);
            /// System.out.println("Gemelo2.- " + total);
            if (moneda_gemelo_1 > total) {
                break;
            }

            ans++;
        }

        System.out.println(ans);

    }
}
