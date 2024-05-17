package biblioteca.collections;

public class LinkedList<T> extends List<T> {

    private Node<Integer, T> head;

    @Override
    public void add(T value){}

    public void add(int key, T value) {
        
        Node<Integer, T> node = new Node<Integer, T>(key, value);
        Node<Integer, T> atual = head;

        if(head == null){
            head = node;
            return;
        }

        while(atual.getNext()!= null){
            atual = atual.getNext();
        }
        atual.setNext(node);

        setSize(getSize()+1);
        
    }

    @Override
    public T get(int key) {
        
        Node<Integer, T> atual = head;

        while(atual.getNext() != null){
            if(atual.getKey() == key){
                return atual.getValue();
            }

            atual = atual.getNext();
        }

        return null;
    }

    @Override
    public void set(int key, T value) {
        
        Node<Integer, T> atual = head;

        for(int i = 0; i < key; i++)
        {
            atual = atual.getNext();
        }

        atual.setValue(value);
        atual.setKey(key);
    }
    
}
