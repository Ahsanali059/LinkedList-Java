class Node
{
    int data;
    Node next;

    public Node(int data)
    {
       this.data = data;
       this.next = null;
    }
}

class SinglyLinkedList
{
    private Node head;
    private Node tail;
    private int size;

    public SinglyLinkedList()
    {
        this.head = null;
        this.size=0;
    }

    // Add Start of LinkedList
    public void insertAtStart(int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // Insert at end 
    public void insertAtEnd(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    //Insert At Position 
    public void insertAtPosition(int index,int data)
    {
        if(index==0 || index > size)
        {
            System.out.println("Invalid argument");
        }

        if(index==0)
        {
            insertAtStart(data);
            return;
        }
        if(index==size)
        {
            insertAtEnd(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = head;
        int i=0;
        while(i < index - 1)
        {
           current = current.next;
           i++;
        }

        newNode.next = current.next;
        current.next = newNode;
        size++;
    }

    // delete at start 
    public void deleteAtStart()
    {
        if(head==null)
        {
            System.out.print("LinkedList is empty");
        }
        head = head.next;
        size--;
    }
    public void deleteAtEnd()
    {
        if(head==null)
        {
            System.out.print("LinkedList is empty");
        }

        if(head.next==null)
        {
            head=tail=null;
        }
        else
        {
            Node current = head;
            while (current!=tail) 
            {
                current=current.next;
            }
            current.next = null;
            tail = current;
        }

    }

    //Delete at specific position 
    public void deleteAtPosition(int index)
    {
        if (index<0 || index >=size)  
        {
            System.out.println("Invalid Index");
        }
        if (index==0) 
        {
            deleteAtStart();
            return;
        }
        Node current = head;
        int i=0;
        while (i<index-1) 
        {
            current = current.next;
            i++;
        }
        Node toDelete = current.next;
        current.next = toDelete.next;

        if (toDelete==tail) {
            tail=current;
        }
        size--;
    }

   public void traverse()
   {
      Node temp = head;
      while (temp!=null) 
      {
         System.out.print(" -> "+temp.data);
         temp = temp.next;
      }
   }
}
class SingleLLImpl
{
    public static void main(String[] args) 
    {
        SinglyLinkedList list = new SinglyLinkedList();
         list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.traverse(); // 10 -> 20 -> 30 -> null

        list.deleteAtStart();
        list.traverse(); // 20 -> 30 -> null

        list.deleteAtEnd();
        list.traverse(); // 20 -> null

        list.insertAtEnd(40);
        list.insertAtEnd(50);
        list.deleteAtPosition(1);
        list.traverse(); // 20 -> 50 -> null

        
    }
}