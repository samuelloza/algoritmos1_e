class SimpleListAux<T> {
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

    public SimpleListAux() {
        first = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void insert(T data) {
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

    public boolean delete(T data) {
        if (isEmpty()) {
            throw new IllegalStateException("Cola Vacia");
        }

        Node current = first;
        Node prev = null;
        while(current != null && !current.data.equals(data)) {
            prev = current;
            current = current.next;
        }

        if (current != null) {
            prev.next = current.next;
            return true;
        
        }
        size--;
        return false;
    }

    public int size() {
        return size;
    }

    public void showList(){
        Node current = first;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

}

public class _a_1 {
    public static void main(String[] args) {
        SimpleListAux<Integer> lista = new SimpleListAux();
        lista.insert(1);
        lista.insert(2);
        lista.insert(3);
        lista.insert(4);
        lista.insert(5);

        lista.showList();

        lista.delete(3);
        lista.delete(4);
        lista.delete(5);
        lista.delete(2);

        lista.showList();



    }
    
}
