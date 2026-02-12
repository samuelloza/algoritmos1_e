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

        if (first == null) {
            // COmo es el primer elemento
            // no tiene siguiente
            newNode.next = null;
            // Como es el primer elemnto
            // el primero es el newNode
            first = newNode;
        } else {
            newNode.next = last;
        }

        last = newNode;
        size++;
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Cola Vacia");
        }

        T data = first.data;
        Node<T> tmp = null;
        while (last.next != null) {
            tmp = last.next;
            if (last.next != first) {
                break;
            }
        }
        tmp.next = null;
        //first = first.next;
        first = tmp;
        size--;
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
