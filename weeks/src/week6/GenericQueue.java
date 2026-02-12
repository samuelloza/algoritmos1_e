public class GenericQueue<T> {
    private Node<T> first;
    private Node<T> last;
    private int size;

    private static class Node<E> {
        E data;
        Node<E> next;

        Node(E data) {
            this.data = data;
        }
    }

    public GenericQueue() {
        first = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    
    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Cola Vacia");
        }

        T data = first.data;
        first = first.next;

        size --;
        return data;
    }

    public int size() {
        return size;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Cola Vacia");
        }
        return first.data;
    }

}
