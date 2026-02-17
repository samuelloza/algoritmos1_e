import java.util.PriorityQueue;

class Paciente implements Comparable<Paciente> {
    private String nombre;
    private int prioridad;

    public Paciente(String nombre, int prioridad) {
        this.nombre = nombre;
        this.prioridad = prioridad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrioridad() {
        return prioridad;
    }

    @Override
    public int compareTo(Paciente pacienteExterno) {
        // 0 si son iguales
        // < 0 El objeto actual es menor que la prioridad del pacienteExterno
        // > 0 El objeto actual es mayor que la prioridad del pacienteExterno
        if (pacienteExterno.prioridad < this.prioridad) {
            return 1;
        } else if (pacienteExterno.prioridad == this.prioridad) {
            //return 0;// this.nombre.compareTo(pacienteExterno.nombre);
            //-------------------
            //Ordena segun el Alfabeto
            // A es el mas pequeño de todos
            // Z es el mas grande 
            return this.nombre.compareTo(pacienteExterno.nombre);
        }
        return -1;
    }
}

public class EjemploPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Paciente> queue = new PriorityQueue<Paciente>();
        queue.add(new Paciente("Armando Fuentes", 0));
        queue.add(new Paciente("Armando Guerra", 0));
        queue.add(new Paciente("Armando Alvarez", 0));
        queue.add(new Paciente("Armando Za", 0));

        queue.add(new Paciente("A", 1));

        while (!queue.isEmpty()) {
            Paciente aux = queue.poll();
            System.out.println(aux.getNombre() + " " + aux.getPrioridad());
        }
    }
}
