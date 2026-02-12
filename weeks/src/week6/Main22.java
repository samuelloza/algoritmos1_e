public class Main22 {
    public static void main(String args[]) {
        MyStack stack = new MyStack();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");

        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }
}
