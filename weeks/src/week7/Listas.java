class ListaSimple<T> {

    private Node<T> first;
    private Node<T> last;

    private static class Node<E> {
        E data;
        Node<E> next;

        public Node(E data) {
            this.data = data;
        }
    }

    public ListaSimple() {
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
            last.next = newNode; // last.next = 3
            last = newNode; //
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
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

}

public class Listas {
    public static void main(String[] args) {
        ListaSimple<Integer> lista = new ListaSimple();
        lista.insert(1);
        lista.insert(2);
        lista.insert(3);
        lista.insert(4);
        lista.insert(5);

        lista.showList();

        System.out.println("Eliminando 4");
        lista.delete(4);
        lista.showList();
        /*
        lista.delete(40);
        
        System.out.println("Eliminando 40");
        lista.showList();*/

        //System.out.println("Insertando el 0");
        //lista.insertFirst(0);
        //lista.insertFirst(100);

        lista.showList();


        System.out.println("Busca el 3 e inserta el 500");
        lista.insertAfter(3, 500);
        lista.showList();

        System.out.println("Busca el 500 e inserta el 1000");
        lista.insertAfter(500, 1000);
        lista.showList();

    }
}
