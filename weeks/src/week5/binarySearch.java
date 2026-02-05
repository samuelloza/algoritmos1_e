public class binarySearch {

    public static void main(String[] args) {
        int[] vec = { 3, 4, 5, 6, 7, 8, 9 };
        int target = 3;
        int result = binarySearch(vec, target);

        if (result == -1) {
            System.out.println("No se encontro el resultado");
        } else {
            System.out.println("El elemento esta en la posicion " + result);
        }
    }

    public static int binarySearch(int[] vec, int target) {
        int low = 0;
        int high = vec.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;

            if (vec[mid] == target) {
                return mid;
            } else if (target > vec[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}