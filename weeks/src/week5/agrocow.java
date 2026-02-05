public class agrocow {

    public static void main(String[] args) {
        int[] vec = { 1, 2, 4, 8, 9};
        int vacas = 3;
        int distancia = binarySearch(vec, vacas);
        System.out.println(distancia);
    }

    public static int binarySearch(int[] vec, int vacas) {
        int low = 1;
        int high = vec[vec.length - 1] - vec[0];
        int distancia = 0;

        int distancia_maxima = 0;
        while (low <= high) {
            distancia = (low + high) / 2; //distancia

            if (es_posible(vec, distancia, vacas)) {
                low = distancia + 1; //probamos con una distancia mayor
                distancia_maxima = Math.max(distancia, distancia_maxima);
            } else {
                high = distancia - 1; //probamos con una distancia menor
            }
        }
        return distancia_maxima;
    }

    private static boolean es_posible(int[] vec, int distancia, int vacas) {
        int count = 1;
        int pos = vec[0];

        for (int i = 1; i < vec.length; i++) {
            if (vec[i] - pos >= distancia) {
                pos = vec[i];
                count++;
            }

            if (count == vacas){
                return true;
            }
        }
        return false;
    }
}