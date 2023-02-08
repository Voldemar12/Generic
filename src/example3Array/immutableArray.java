package example3Array;

public class immutableArray <T>{
    private final T[] items;

    public immutableArray(T[] items) {

        this.items = items.clone();
    }

    public T get(int index) {
        return items[index];
    }

    public int length() {
        return items.length;
    }
}
