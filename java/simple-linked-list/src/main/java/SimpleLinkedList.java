import java.lang.reflect.Array;
import java.util.NoSuchElementException;

class SimpleLinkedList<T> {
    Node<T> head;
    int size;
    SimpleLinkedList() {
        head = null;
        size = 0;
    }

    SimpleLinkedList(T[] values) {
        Node<T> linkedListIterator = null;
        for(T value: values) {
           if(head == null) {
               head = new Node<T>(value);
               linkedListIterator = head;
           } else {
               linkedListIterator.next = new Node<T>(value);
               linkedListIterator = linkedListIterator.next;
           }
           size++;
        }
    }

    void push(T value) {
        Node<T> linkedListIterator = head;
        /*if(linkedList == null) {
            linkedList = new Node<T>(value);
        } else {
            while(linkedListIterator.next != null ){
                linkedListIterator = linkedListIterator.next;
            }
            linkedListIterator.next = new Node<T>(value);
        }*/
        if(head == null){
            head = new Node<T>(value);
        } else {
            Node<T> newNode = new Node<T>(value);
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    T pop() {
        if(size == 0){
            throw new NoSuchElementException();
        }
        else {
            T element = head.getElement();
            head = head.next;
            size--;
            return element;
        }
    }

    void reverse() {
        Node<T> next = head.next;
        Node<T> prev = null;
        head.next = prev;
        while(next != null){
            prev = head;
            head = next;
            next = next.next;
            head.next = prev;
        }
    }

    T[] asArray(Class<T> clazz) {
        /*
        ArrayList<T> valuesArrayList = new ArrayList<>();
        Node<T> linkedListIterator = linkedList;
        while(linkedListIterator != null) {
            valuesArrayList.add(linkedListIterator.getElement());
            linkedListIterator = linkedListIterator.next;
        }
        System.out.println(valuesArrayList);
        return (T[]) valuesArrayList.toArray();
        */
        T[] valuesArray = (T[])Array.newInstance(clazz, size);
        Node<T> linkedListIterator = head;
        int index = 0;
        while(linkedListIterator != null) {
            valuesArray[index] = linkedListIterator.getElement();
            linkedListIterator = linkedListIterator.next;
            index++;
        }
        return valuesArray;
    }

    int size() {
        return this.size;
    }

}
