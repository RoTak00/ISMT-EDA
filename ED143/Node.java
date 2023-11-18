public class Node<T extends Comparable<? super T>> {
   T    value;
   Node<T> next;

   Node(T v, Node<T> n) {
     value = v;
     next  = n;
   }

   Node(T v) {
     value = v;
     next  = null;
   }
}
