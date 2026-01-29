public class Caminos {
    public static boolean solve(int n){
        if (n == 0) {
            return true;
        }

        if (n < 0 ) {
            return false;
        }

        if(solve(n - 4)) {
            return true;
        }

        if(solve(n - 7)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int n = 11;
        if (solve(n)) {
            System.out.println("Si");
        } else {
            System.out.println("No");
        }
    }
}
