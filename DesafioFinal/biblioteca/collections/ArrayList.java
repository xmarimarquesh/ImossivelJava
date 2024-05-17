package biblioteca.collections;

public class ArrayList<T> extends List<T> 
{
    private T[] data;
    
    public ArrayList(int capacity)
    {
        data = (T[])(new Object[capacity]);
    }

    public ArrayList()
    {
        data = (T[])(new Object[10]);
    }

    @Override
    public void add(T value) {
        
        if(getSize() == data.length)
        {
            T[] copy = (T[])(new Object[2* data.length]);
            
            for(int i = 0; i < data.length; i++){
                copy[i] = data[i];
            }
            data = copy;
        }
        data[getSize()] = value;

        setSize(getSize()+1);
    }


    @Override
    public void set(int index, T value) {
        data[index] = value;
    }

    @Override
    public T get(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Integer getSize() {
        // TODO Auto-generated method stub
        return super.getSize();
    }

    @Override
    protected void setSize(int size) {
        // TODO Auto-generated method stub
        super.setSize(size);
    }

}
