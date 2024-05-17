package biblioteca.collections;

public class Node<Integer, T> {
    
    private Node<Integer, T> next = null;
    private T value;
    private Integer key;

    Node(Integer key, T value){
        this.value = value;
        this.key = key;
    }

    public Node<Integer, T> getNext() {
        return next;
    }

    public void setNext(Node<Integer, T> next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    
}
