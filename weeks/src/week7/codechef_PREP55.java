import java.util.Scanner;

class ListaSimpleCodeChef<T> {

    private Node<T> first;
    private Node<T> last;

    private static class Node<E> {
        E data;
        Node<E> next;

        public Node(E data) {
            this.data = data;
        }
    }

    public ListaSimpleCodeChef() {
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
        } else {
            if (!last.data.equals(data)) {
                last.next = newNode;
                last = newNode;
            }
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
        }
    }

    public void insertAfter(T dataToSearch, T data) {
        Node<T> newNode = new Node(data);
        Node<T> current = first;
        Node<T> next = null;

        while (current != null && !current.data.equals(dataToSearch)) {
            current = current.next;
            next = current.next;
        }

        if (current != null) {
            current.next = newNode;
            newNode.next = next;
        }
    }

    // Si no encuentra el elemento falta implementar
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

        // Si es diferente de Null encontro elemento
        if (current != null) {
            prev.next = current.next;
            return true;
        }
        return false;
    }

    public void showList() {
        Node current = first;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

class codechef_PREP55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n, tmp;
        ListaSimpleCodeChef<Integer> lista;
        while (t-- > 0) {
            n = sc.nextInt();
            lista = new ListaSimpleCodeChef();
            for (int i = 0; i < n; i++) {
                tmp = sc.nextInt();
                lista.insert(tmp);
            }
            lista.showList();

        }
    }
}