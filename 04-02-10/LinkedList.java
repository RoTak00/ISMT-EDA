import java.util.EmptyStackException;
import java.lang.IndexOutOfBoundsException;

public class LinkedList<T> 
{
    private Node<T> head;
    private int size; 

    public LinkedList()
    {
        head = null;
        size = 0;
    } 

    public LinkedList(LinkedList<T> l)
    {
        head = l.getFirst();
        size = l.getSize();
    }

    public int getSize()
    {
        return size;
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    public Node<T> getFirst() throws EmptyStackException
    {
        if(isEmpty())
        {
            throw new EmptyStackException();
        }

        return head;
    }

    public void print()
    {
        Node<T> p = head;
        while(p != null)
        {
            System.out.println(p.value);
            p = p.next;
        }
    }

    public int indexOf(T v)     
    {
        
        Node<T> p = head;
        int index = 0;
        while(p != null)
        {
            if(p.value.equals(v))
            {
                return index;
            }
            index++;
            p = p.next;
        }
        return -1;
    }

    public void addFirst(T v)
    {
        Node<T> n = new Node<T>(v);
        n.next = head;
        head = n;
        size++;
    }

    public void addIndex(T v, int index) throws IndexOutOfBoundsException
    {
        if(index < 0 || index > size)
        {
            throw new IndexOutOfBoundsException();
        }

        if(index == 0)
        {
            addFirst(v);
            return;
        }

        Node<T> n = new Node<T>(v);
        Node<T> p = head;
        int i = 0;
        while(p != null)
        {
            if(i == index)
            {
                n.next = p.next;
                p.next = n;
                size++;
                return;
            }
            i++;
            p = p.next;
        }

    }

    public void removeFirst() throws EmptyStackException
    {
        if(isEmpty())
        {
            throw new EmptyStackException();
        }
        head = head.next;
        size--;
    }

    public void removeIndex(int index) throws EmptyStackException
    {
        if(isEmpty())
        {
            throw new EmptyStackException();
        }
        if(index == 0)
        {
            removeFirst();
            return;
        }
        Node<T> p = head;
        for(int i = 0; i < index - 1; i++)
        {
            p = p.next;
        }
        p.next = p.next.next;
        size--;
    }

    public T getAtIndex(int index) throws IndexOutOfBoundsException
    {
        if(index < 0 || index >= size)
        {
            throw new IndexOutOfBoundsException();
        }
        Node<T> cursor = head;
        for(int i = 0; i < index; i++)
        {
            cursor = cursor.next;
        }
        return cursor.value;
    }


}