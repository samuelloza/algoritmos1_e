import java.util.ArrayList;
import java.util.Scanner;

class MyStack2 {
    private ArrayList<String> array;

    public MyStack2() {
        this.array = new ArrayList<>();
    }

    // Inserta
    public void push(String value) {
        array.add(value);
    }

    // Extrae
    public String pop() {
        // Sca el ultimo elemento del array
        String value = array.get(array.size() - 1);
        array.remove(array.size() - 1);
        return value;
    }

    // Peek
    public String peek() {
        return array.get(array.size() - 1);
    }

    public boolean isEmpty() {
        return array.isEmpty();
    }
}

public class uva673 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String line = "";
        MyStack2 stack;
        for (int i = 0; i < n; i++) {
            line = sc.next();
            stack = new MyStack2();
            boolean sw = true;
            for (int j = 0; j < line.length(); j++) {
                char character = line.charAt(j);

                if (character == '(' || character == '[') {
                    stack.push(character + "");
                } else {
                    if (stack.isEmpty()) {
                        sw = false;
                        break;
                    }
                    String lastElement = stack.peek();
                    if (lastElement.equals("[") && character == ']') {
                        stack.pop();
                    } else if (lastElement.equals("(") && character == ')') {
                        stack.pop();
                    }
                }
            }

            if (stack.isEmpty() && sw) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
