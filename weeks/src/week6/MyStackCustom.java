import java.util.ArrayList;

public class MyStackCustom {
    private ArrayList<String> array;

    public MyStackCustom() {
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