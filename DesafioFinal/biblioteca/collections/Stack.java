package biblioteca.collections;

public class Stack<T>  extends Collections<T>{

    private T[] data;

    Stack(Integer capacity)
    {
        data = (T[])(new Object[capacity]);
    }

    Stack()
    {
        data = (T[])(new Object[10]);
    }

    public void push(T value)
    {
        if(getSize() == data.length)
        {
            T[] copy = (T[])(new Object[2 * data.length]); 
            
            for(int i = 0; i < data.length; i++)
            {
                copy[i] = data[i];
            }

            data = copy;
        }

        data[getSize()] = value;

        setSize(getSize() + 1);
    }

    public T pop()
    {
        T variavel = data[getSize()];

        data[getSize()] = null;

        setSize(getSize() -1);

        return variavel;
    }

}

