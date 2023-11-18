class LibStack {
  public static <T extends Comparable<? super T>>
  boolean isEmpty(Stack<T> s) {
    return LibLinkedList.empty(s.elements);
  }
  public static <T extends Comparable<? super T>>
  int size(Stack<T> s) {
    return LibLinkedList.size(s.elements);
  }
  public static <T extends Comparable<? super T>>
  T pop(Stack<T> s) {
    T value = LibLinkedList.get(s.elements, 0);
    LibLinkedList.removeFirst(s.elements);
    return value;
  }
  public static <T extends Comparable<? super T>>
      void push(Stack<T> s, T value) {
    LibLinkedList.addFirst(s.elements, value);
  } 
  public static <T extends Comparable<? super T>>
  T top(Stack<T> s) {
    return LibLinkedList.get(s.elements, 0);
  }
  public static <T extends Comparable<? super T>>
  String toString(Stack<T> s) {
    return LibLinkedList.toString(s.elements);
  }
}
