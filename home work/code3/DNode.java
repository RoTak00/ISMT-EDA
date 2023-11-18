public class DNode<T extends Comparable<? super T>> {
   T    value;
   DNode<T> prev;
   DNode<T> next;

   DNode(T v, DNode<T> p, DNode<T> n) {
     value = v;
     prev  = p;
     next  = n;
   }

   DNode(T v) {
     value = v;
     prev  = null;
     next  = null;
   }
}

