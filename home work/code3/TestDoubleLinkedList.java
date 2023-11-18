public class TestDoubleLinkedList {
  public static void main(String args[]) {
    DoubleLinkedList<Integer> dl = new DoubleLinkedList<Integer>();
    for(int i = 8 ; i > 0 ; i--)
      LibDoubleLinkedList.addFirst(dl, new Integer(i));
    LibDoubleLinkedList.add(dl, new Integer(55), 5); 
    System.out.println("list size: " +  LibDoubleLinkedList.size(dl));
    System.out.println(LibDoubleLinkedList.toString(dl));
    LibDoubleLinkedList.removeFirst(dl); 
    LibDoubleLinkedList.remove(dl, 3);
    System.out.println("indexOf(6): " +  LibDoubleLinkedList.indexOf(dl, 6));
    System.out.println(LibDoubleLinkedList.toString(dl));
  }
}
