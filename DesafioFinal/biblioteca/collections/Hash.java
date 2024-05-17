package biblioteca.collections;

public class Hash<T>  extends Collections<T>{
    
    private LinkedList<T>[] data;

    Hash()
    {
        data = (LinkedList<T>[])(new Object[256]);
    }

    Hash(Integer capacity)
    {
        data = (LinkedList<T>[])(new Object[capacity]);
    }

    void add(Integer key,T value)
    {
        int index = key % data.length;

        if(getSize() == (data.length) * 0.7)
        {
            LinkedList<T>[] copy = (LinkedList<T>[])(new Object[2 * data.length]); 
            
            for(int i = 0; i < data.length; i++)
            {
                copy[i] = data[i];
            }
            data = copy;
        }

        if(data[index] == null)
        {
            data[index] = new LinkedList<T>();
            setSize(getSize()+1);
        }

        data[index].add(key, value);

    }


    // public T get(int key)
    // {
    //     int index = key % data.length;

    //     return variavel;
    // }

}
