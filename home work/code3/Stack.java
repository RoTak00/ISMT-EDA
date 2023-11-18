class Stack<T extends Comparable<? super T>> {
  LinkedList<T> elements;

  public Stack() {
    elements = new LinkedList<T>();
  }
}
