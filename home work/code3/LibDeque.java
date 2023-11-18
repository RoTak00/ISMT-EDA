public class LibDeque {

  public static <T extends Comparable<? super T>>
  boolean isEmpty(Deque<T> d) {
    return LibDoubleLinkedList.empty(d.elements);
  }

  public static <T extends Comparable<? super T>>
  int size(Deque<T> d) {
    return LibDoubleLinkedList.size(d.elements);
  }

  public static <T extends Comparable<? super T>>
  void addFirst(Deque<T> d, T value) {
    LibDoubleLinkedList.addFirst(d.elements, value);
  } 

  public static <T extends Comparable<? super T>>
  void addLast(Deque<T> d, T value) {
    LibDoubleLinkedList.addLast(d.elements, value);
  } 

  public static <T extends Comparable<? super T>>
  T peekFirst(Deque<T> d) {
    return LibDoubleLinkedList.get(d.elements, 0);
  }

  public static <T extends Comparable<? super T>>
  T peekLast(Deque<T> d) {
    return LibDoubleLinkedList.get(d.elements, size(d) - 1);
  }

  public static <T extends Comparable<? super T>>
  T removeFirst(Deque<T> d) {
    T value = LibDoubleLinkedList.get(d.elements, 0);
    LibDoubleLinkedList.removeFirst(d.elements);
    return value;
  }

  public static <T extends Comparable<? super T>>  
  T removeLast(Deque<T> d) {
    T value = LibDoubleLinkedList.get(d.elements, size(d) - 1);
    LibDoubleLinkedList.removeLast(d.elements);
    return value;
  }

  public static <T extends Comparable<? super T>>
  String toString(Deque<T> d) {
    return LibDoubleLinkedList.toString(d.elements);
  }
}
