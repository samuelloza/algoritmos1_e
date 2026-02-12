class QueueMain {
    public static void main(String[] args) {
        GenericQueue<Integer> queue = new GenericQueue<>();
        queue.push(1);
        queue.push(2);
        queue.push(3);

        System.out.println("Ejemplo de cola peek");
        //salida 1
        System.out.println(queue.peek());

        System.out.println("Pop del primer elemento");
        queue.pop(); //eliminando el 1
        //salida 2
        System.out.println(queue.peek());

        System.out.println("Pop del primer elemento");
        queue.pop(); //eliminando 2
        //salida 3
        System.out.println(queue.peek());

    }
}