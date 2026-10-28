package tugas.pb.model;

public class Box<T> implements Comparable<Box<T>> {

    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @Override
    @SuppressWarnings("unchecked")
    public int compareTo(Box<T> other) {

        if (value instanceof Comparable
                && other.value instanceof Comparable) {

            return ((Comparable<T>) value)
                    .compareTo(other.value);
        }

        return 0;
    }
}
