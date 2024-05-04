import java.lang.reflect.Array;
import java.util.NoSuchElementException;

class SimpleLinkedList<T> {
    private Node<T> head;
    private int length;

    SimpleLinkedList() {
        head = null;
        length = 0;
    }

    SimpleLinkedList(T[] values) {
        Node<T> linkedListIterator = null;
        for (T value : values) {
            if (head == null) {
                head = new Node<T>(value);
                linkedListIterator = head;
            } else {
                linkedListIterator.next = new Node<T>(value);
                linkedListIterator = linkedListIterator.next;
            }
            length++;
        }
    }

    void push(T value) {
        Node<T> linkedListIterator = head;
        if (head == null) {
            head = new Node<T>(value);
        } else {
            Node<T> newNode = new Node<T>(value);
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    T pop() {
        if (length == 0) {
            throw new NoSuchElementException();
        } else {
            T element = head.getElement();
            head = head.next;
            length--;
            return element;
        }
    }

    void reverse() {
        Node<T> next = head.next;
        Node<T> prev = null;
        head.next = prev;
        while (next != null) {
            prev = head;
            head = next;
            next = next.next;
            head.next = prev;
        }
    }

    T[] asArray(Class<T> clazz) {
        T[] valuesArray = (T[]) Array.newInstance(clazz, length);
        Node<T> linkedListIterator = head;
        int index = 0;
        while (linkedListIterator != null) {
            valuesArray[index] = linkedListIterator.getElement();
            linkedListIterator = linkedListIterator.next;
            index++;
        }
        return valuesArray;
    }

    int size() {
        return this.length;
    }
}
