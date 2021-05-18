public interface MyList<E>{
    int size();

    boolean isEmpty();

    boolean contains(E o);

    boolean add(E e);

    boolean remove(E e);

    void clear();

    E get(int index);

    E remove(int index);

    int indexOf(E o);
}
