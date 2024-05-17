package biblioteca.collections;

public class NodeQueue<T> {

    private NodeQueue<T> next;
    private NodeQueue<T> prev;
    private T value;

    NodeQueue(T value)
    {
        this.value = value;
    }

    public NodeQueue<T> getNext() {
        return next;
    }

    public void setNext(NodeQueue<T> next) {
        this.next = next;
    }

    public NodeQueue<T> getPrev() {
        return prev;
    }

    public void setPrev(NodeQueue<T> prev) {
        this.prev = prev;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}