import java.util.Arrays;

public class MyArray<E> implements MyList<E> {
    private int size;
    private E[] elements;

    /**
     * Don't forget to generate the constructor!
     */
    @SuppressWarnings("unchecked")
    public MyArray() {
        this.size = 0;
        Object[] objects = new Object[size+1];
        this.elements = (E[]) objects;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean add(E e) {
        size++;
        elements = Arrays.copyOf(elements, size);
        elements[size-1] = e;
        return true;
    }

    @Override
    public boolean remove(E e) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if(elements[i].equals(e)) {
                index = i;
            }
        }
        try {
            remove(index);
            return true;
        } catch (IndexOutOfBoundsException ex) {
            return false;
        }
    }

    @Override
    public E remove(int index) {
        if (index >= 0 && index < size) {
            E removedObject = elements[index];
            System.arraycopy(elements,index+1, elements, index, size - index - 1);
            size--;
            return removedObject;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++)
            elements[i] = null;
        size = 0;
    }

    @Override
    public E get(int index) {
        if (index < size) {
            return elements[index];
        }
        throw new NullPointerException();
    }

    @Override
    public int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }
}
