public class Ordenamiento {
    public static void main(String[] args) {
        int vec [] = { 2, 5, 7, 8, 9, 5, 1 };
        System.out.println("Vector original");
        for (int i = 0; i < vec.length; i++) {
            System.out.print(vec[i] + " ");
        }
        bubbleSort(vec);
        System.out.println("");
        System.out.println("Vector Ordenado");

        for (int i = 0; i < vec.length; i++) {
            System.out.print(vec[i] + " ");
        }
    }

    public static void bubbleSort(int vec[]) {
        int limite = vec.length;        
        for (int i =  limite; i >= 1; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (vec[j] > vec[j + 1]) { //O(n²)
                    //Intercambiamos los elementos
                    int aux = vec[j];
                    vec[j] = vec[j + 1];
                    vec[j + 1] = aux;
                }
            }
        }
    }
}