package biblioteca.collections;

abstract class List<T> extends Collections<T> {

    public abstract T get(int index);
    
    public abstract void set(int index, T value);

    public abstract void add(T value);

}
