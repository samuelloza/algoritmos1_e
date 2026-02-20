class ListaDobleTemplate<T> {

    private Node<T> first;
    private Node<T> last;

    private static class Node<E> {
        E data;
        Node<E> next;
        Node<E> prev;

        public Node(E data) {
            this.data = data;
        }
    }

    public ListaDobleTemplate() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        if (first == null && last == null) {
            return true;
        }
        return false;
    }

    public void insert(T data) {
        Node<T> newNode = new Node(data);
        if (isEmpty()) {
            first = newNode;
            last = newNode;
            newNode.prev = null;
            newNode.next = null;
        } else {
            newNode.prev = last;
            last.next = newNode;
            last = newNode;
        }
    }

    public void insertFirst(T data) {
        Node<T> newNode = new Node(data);
        if (isEmpty()) {
            first = newNode;
            last = newNode;
        } else {
            Node<T> aux = first;
            first = newNode;
            first.next = aux;
            aux.prev = first;

        }
    }

    //Falta implementar
    public void insertAfter(T dataToSearch, T data) {
        Node<T> newNode = new Node(data);
        Node<T> current = first;
        Node<T> next = null;

        while(current != null && ! current.data.equals(dataToSearch)) {
            current = current.next;
            next = current.next;
        }

        if (current != null) {
            current.next = newNode;
            newNode.next = next;
        }
    }

    //Si no encuentra el elemento falta implementar
    //Falta implementar
    public boolean delete(T data) {
        if (isEmpty()) {
            throw new IllegalStateException("Esta vacio");
        }

        Node current = first;
        Node prev = null;

        while (current != null && !current.data.equals(data)) {
            prev = current;
            current = current.next;
        }

        //Si es diferente de  Null encontro elemento
        if (current != null) {
            prev.next = current.next;
            return true;
        }
        return false;
    }

    public void showList() {
        Node current = first;
        while (current != null) {

            if (current.next != null) {
                System.out.println(current.data + " siguiente es " + current.next.data);
            }
            if (current.prev != null) {
                System.out.println(current.data + " el anterior es " + current.prev.data);
            }

            current = current.next;
        }
        System.out.println();
    }

}

public class ListaDoble {
    public static void main(String[] args) {
        ListaDobleTemplate<Integer> lista = new ListaDobleTemplate();
        lista.insert(1);
        lista.insert(2);
        lista.insert(3);
        lista.insert(4);
        lista.showList();

        lista.insertFirst(0);
        lista.showList();


    }
}
