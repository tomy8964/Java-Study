package generic.test;

public class Container<T> {

    private T value = null;

    public boolean isEmpty() {
        return value == null;
    }

    public T getItem() {
        return value;
    }

    public void setItem(T value) {
        this.value = value;
    }
}
