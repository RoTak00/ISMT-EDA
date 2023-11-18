public class TestStack {
  public static void main(String args[]) {
    Stack<Integer> s = new Stack<Integer>();
    for(int i = 8 ; i > 0 ; i--)
      LibStack.push(s, new Integer(i));
    System.out.println("stack size: " + LibStack.size(s));
    System.out.println(LibStack.toString(s));
    LibStack.pop(s);
    LibStack.pop(s);
    LibStack.push(s, new Integer(12));
    System.out.println("stack size: " + LibStack.size(s));
    System.out.println(LibStack.toString(s));
    LibStack.pop(s);
    LibStack.pop(s);
    LibStack.pop(s);
    LibStack.pop(s);
    LibStack.pop(s);
    LibStack.pop(s);
    LibStack.pop(s);
    LibStack.pop(s);
    System.out.println("stack size: " + LibStack.size(s));
    System.out.println(LibStack.toString(s));
  }
}
