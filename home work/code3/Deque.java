public class Deque<T extends Comparable<? super T>> {
  DoubleLinkedList<T> elements;

  public Deque() {
    elements = new DoubleLinkedList<T>();
  }
}
