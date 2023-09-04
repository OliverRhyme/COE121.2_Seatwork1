package problem2;

public class InfiniteArray<T> {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] array;

    private int size;

    public InfiniteArray(int initialCapacity) {
        array = new Object[initialCapacity];
    }

    public InfiniteArray() {
        this(DEFAULT_CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index < 0 && index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " is out of bounds");
        }
        return (T) array[index];
    }

    public void add(T element) {
        ensureCapacity();
        array[size] = element;
        size++;
    }

    private void ensureCapacity() {
        int targetSize = size + 1;
        if (targetSize > array.length) {
            // Grow array to 1.5 times its current size
            int newSize = array.length + (array.length >> 1);
            Object[] newArray = new Object[newSize];

            //noinspection ManualArrayCopy
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size - 1; i++) {
            sb.append(array[i]).append(", ");
        }
        if (size > 0) {
            sb.append(array[size - 1]);
        }
        sb.append("]");
        return sb.toString();
    }
}
