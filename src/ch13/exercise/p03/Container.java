package ch13.exercise.p03;

public class Container<T, T1> {

    private T Key;
    private T1 Value;

    public T getKey() {
        return Key;
    }

    public void setKey(T key) {
        Key = key;
    }

    public T1 getValue() {
        return Value;
    }

    public void setValue(T1 value) {
        Value = value;
    }

    public void set(T key, T1 value) {
        this.Key = key;
        this.Value = value;
    }
}


