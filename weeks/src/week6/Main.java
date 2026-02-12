import java.util.ArrayList;
import java.util.Scanner;

class MyStack {
    private ArrayList<String> array;

    public MyStack() {
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

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        String line = "";
        for (int i = 0; i < n; i++) {
            line = sc.next();
            MyStack stack = new MyStack();
            for (int j = 0; j < line.length(); j++) {
                char character = line.charAt(j);

                if (character == '*' || character == '+' || character == '-' || character == '/' || character == '^') {
                    stack.push(character + "");
                } else if (character == ')') {
                    System.out.print(stack.pop());
                } else if (character >='a' && character <= 'z') {
                    System.out.print(character);
                }
            }

            System.out.println();
        }
    }
}
