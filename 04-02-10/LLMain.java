public class LLMain
{
    public static void main(String[] args)
    {
        LinkedList<String> l = new LinkedList<String>();

        l.addFirst("a");
        l.addFirst("b");
        l.addFirst("c");

        l.print();

        System.out.println("-----------------");
       System.out.printf("found b at index %d\n", l.indexOf("b")) ;

       

        l.print();
    }
}