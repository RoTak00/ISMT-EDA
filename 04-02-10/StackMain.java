public class StackMain 
{
    public static void main(String[] args)
    {
        Stack<String> s = new Stack<String>();
        s.push("a");
        s.push("b");
        s.push("c");

        System.out.println(s.peek());

        String elem = s.pop();

        System.out.println(elem);

        System.out.println(s.getSize());
    }
}