public class LinkedList<T extends Comparable<? super T>> {  
  Node<T> first; 
  int     size;  
                         
  public LinkedList() {    
    first = null; 
    size  = 0; 
  }
  public LinkedList(LinkedList<T> l) {  
    first = l.first;
    size  = l.size; 
  }
}
