public class DoubleLinkedList<T extends Comparable<? super T>> {  
  DNode<T> first; 
  DNode<T> last; 
  int      size;  
                         
  public DoubleLinkedList() {    
    first = null; 
    last  = null; 
    size  = 0; 
  }
}

