package biblioteca.collections;

public class Queue<T> extends Collections<T>{

    NodeQueue<T> head = null;
    NodeQueue<T> tail = null;
    
    
    public void enqueue(T value)
    {
        NodeQueue<T> node = new NodeQueue<T>(value);

        if(head == null){
            head = node;
            tail = node;
            return;
        }

        tail.setNext(node);
        node.setPrev(tail);
        tail = node;

        setSize(getSize() + 1);
    }


    public T dequeue()
    {
        NodeQueue<T> variavel = head;

        head = head.getNext();

        head.setPrev(null);

        return variavel.getValue();
    }

}
