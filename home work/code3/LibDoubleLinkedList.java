public class LibDoubleLinkedList {

  public static <T extends Comparable<? super T>>
  boolean empty(DoubleLinkedList<T> dl) { 
    return (dl.size == 0); 
  }

  public static <T extends Comparable<? super T>>
  int size(DoubleLinkedList<T> dl) { 
    return dl.size; 
  }

  public static <T extends Comparable<? super T>>
  String toString(DoubleLinkedList<T> dl) {
    if (dl.size == 0) 
      return new String("[]");
    else {
      String  s = new String("[");
      DNode<T> p = dl.first;
      while (p.next != null) {
        s += p.value + ",";
        p = p.next;
      }
      s += p.value + "]";
      return s;
    }
  }

  public static <T extends Comparable<? super T>>
  int indexOf(DoubleLinkedList<T> dl, T value) {
    int     index = 0;
    DNode<T> p    = dl.first;
    while (p != null) {
      T  currVal = p.value;
      if (currVal.compareTo(value) == 0)
        break;
      p = p.next;
      index++;
    } 
    return (p == null)? -1: index;
  }

  public static <T extends Comparable<? super T>>
  void addFirst(DoubleLinkedList<T> dl, T value) {
    if(dl.size == 0) {
      DNode<T> node = new DNode<T>(value);
      dl.first      = node;
      dl.last       = node;
    } else 
      dl.first = new DNode<T>(value, null, dl.first);
    dl.size++;
  }
 
  public static <T extends Comparable<? super T>>
  void add(DoubleLinkedList<T> dl, T value, int index) {
    if ( index < 0 || index > dl.size )  // allow adding at the end: index = dl.size
      throw new IndexOutOfBoundsException();
    if ( index == 0 ) 
      dl.first = new DNode<T>(value, null, dl.first);
    else {
      DNode<T> p = dl.first;
      for( int i = 0 ; i < index - 1 ; i++)
        p = p.next;
      DNode<T> node = new DNode<T>(value, p, p.next);
      p.next.prev  = node;
      p.next       = node; 
    }
    dl.size++;
  } 

  public static <T extends Comparable<? super T>>
  void addLast(DoubleLinkedList<T> dl, T value) {
    if(dl.size == 0) {
      DNode<T> node = new DNode<T>(value);
      dl.first      = node;
      dl.last       = node;
    } else {
      DNode<T> node = new DNode<T>(value, dl.last, null); 
      dl.last.next  = node;
      dl.last       = node;
    }
    dl.size++;
  }
  
  public static <T extends Comparable<? super T>>
  void removeFirst(DoubleLinkedList<T> dl) {
    if (dl.size == 0) 
      throw new IndexOutOfBoundsException();
    if (dl.size == 1) {
      dl.first = null;
      dl.last  = null;
    } else
      dl.first = dl.first.next;
    dl.size--;
  }

  public static <T extends Comparable<? super T>>
  void remove(DoubleLinkedList<T> dl, int index) {
    if (dl.size == 0) 
      throw new IndexOutOfBoundsException();
    if ( index < 0 || index > dl.size - 1 )
      throw new IndexOutOfBoundsException();
    if ( index == 0 ) 
      removeFirst(dl);
    else {
      DNode<T> p = dl.first;
      for ( int i = 0; i < index - 1; i++ ) 
        p = p.next;
      DNode<T> q = p.next.next;
      p.next = q;
      q.prev = p;
    }
    dl.size--;
  }

  public static <T extends Comparable<? super T>>
  void removeLast(DoubleLinkedList<T> dl) {
    if (dl.size == 0) 
      throw new IndexOutOfBoundsException();
    if (dl.size == 1) {
      dl.first = null;
      dl.last  = null;
    } else {
      dl.last = dl.last.prev;
      dl.last.next = null;
    }
    dl.size--;
  }

  public static <T extends Comparable<? super T>>
  T get(DoubleLinkedList<T> dl, int index) {
    if (dl.size == 0) 
      throw new IndexOutOfBoundsException();
    if ( index < 0 || index > dl.size - 1 )
      throw new IndexOutOfBoundsException();
    DNode<T> p = dl.first;
    for ( int i = 0; i < index ; i++ ) 
      p = p.next;
    return p.value;
  }
}
