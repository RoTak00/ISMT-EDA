public class Queue<T extends Comparable<? super T>> {
  LinkedList<T> elements;

  public Queue() {
    elements = new LinkedList<T>();
  }
}
