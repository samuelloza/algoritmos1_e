import java.util.Scanner;

public class uva10935 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 0) {
            GenericQueue<Integer> queue = new GenericQueue<>();
            for (int i = 1; i <= n; i++) {
                queue.push(i);
            }

            System.out.print("Discarded cards:");
            while (queue.size() > 1) {
                System.out.print(" " + queue.pop() + ",");
                int tmp = queue.pop();
                queue.push(tmp);
            }
            System.out.println();
            System.out.println("Remaining card:" + queue.peek());
            n = sc.nextInt();
        }
    }
}