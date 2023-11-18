public class TestQueue {
  public static void main(String args[]) {
    Queue<Integer> q = new Queue<Integer>();
    for(int i = 8 ; i > 0 ; i--) {
      LibQueue.add(q, new Integer(i));
      System.out.println(LibQueue.toString(q));
    }
    System.out.println("queue size: " + LibQueue.size(q));
    System.out.println(LibQueue.toString(q));
    LibQueue.remove(q);
    LibQueue.remove(q);
    System.out.println(LibQueue.toString(q));
    LibQueue.add(q,new Integer(12));
    LibQueue.remove(q);
    LibQueue.remove(q);
    LibQueue.remove(q);
    LibQueue.remove(q);
    LibQueue.remove(q);
    LibQueue.remove(q);
    System.out.println(LibQueue.toString(q));
  }
}
