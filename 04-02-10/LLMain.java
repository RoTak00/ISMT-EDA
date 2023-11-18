public class LLMain
{
    public static void main(String[] args)
    {
        LinkedList<Integer> l = new LinkedList<Integer>();

        for(int i = 8; i > 0; i--)
        {
            l.addFirst(i);
        }

        System.out.println("l.size: " + l.getSize());
        l.removeFirst();
        l.removeIndex(3);

        int index = l.indexOf(6);
        System.out.println("index: " + index);
       

        l.print();
    }
}