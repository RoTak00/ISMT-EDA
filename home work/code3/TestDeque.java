class TestDeque {
  public static void main(String[] args) {
    final int N = 10;
    Deque<Integer> d = new Deque<Integer>();

    for (int i = N ; i > 0 ; i--) 
      LibDeque.addFirst(d, new Integer(i));
    System.out.println(LibDeque.toString(d));
    for (int i = 0 ; i < N ; i++)
      LibDeque.addLast(d, new Integer(i + 1 + N));
    System.out.println(LibDeque.toString(d));
    for (int i = 0 ; i < N ; i++) {
      Integer j, k;
      j = LibDeque.removeFirst(d);
      k = LibDeque.removeLast(d);
      System.out.printf("(%2d,%2d)%n", j.intValue(), k.intValue());
    }
  }
}
