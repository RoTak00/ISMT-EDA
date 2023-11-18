import java.util.EmptyStackException;

public class Stack<T>
{
    Node<T> head;
    int size;

    public Stack()
    {
        head = null;
        size = 0;
    }

    public Stack(Stack<T> l)
    {
        
        head = l.getTop();
        size = l.getSize();
    }

    public int getSize()
    {
        return size;
    }
    
    public Node<T> getTop() throws EmptyStackException
    {
        if(isEmpty())
        {
            throw new EmptyStackException();
        }
        return head;
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    public void push(T v)
    {
        Node<T> n = new Node<T>(v);
        n.next = head;
        head = n;
        size++;
    }

    public T pop() throws EmptyStackException
    {
        if(isEmpty())
        {
            throw new EmptyStackException();
        }
        Node<T> p = head;
        head = head.next;
        size--;
        return p.value;
    }

    public T peek() throws EmptyStackException
    {
        if(isEmpty())
        {
            throw new EmptyStackException();
        }
        return head.value;
    }

    public void print()
    {
        if(isEmpty())
        {
            return;
        }

        
        Node<T> p = head;
        while(p != null)
        {
            System.out.print(p.value);
            if(p.next != null)
            {
                System.out.print(" -> ");
            }
            p = p.next;
            
        }
        System.out.println();
    }
    public void print(String name)
    {
        if(isEmpty())
        {
            System.out.println(name + " is empty");
            return;
        }

        
         System.out.print(name + ": ");
        
        Node<T> p = head;
        while(p != null)
        {
            System.out.print(p.value);
            if(p.next != null)
            {
                System.out.print(" -> ");
            }
            p = p.next;
        }
        System.out.println();
    }
}