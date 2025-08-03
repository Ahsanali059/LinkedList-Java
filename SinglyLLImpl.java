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

   public void traverse()
   {
      Node temp = head;
      while (temp!=null) 
      {
         System.out.println(" -> "+temp.data);
         temp = temp.next;
      }
   }
}
class SingleLLImpl
{
    public static void main(String[] args) 
    {
        SinglyLinkedList ll = new SinglyLinkedList();
        ll.insertAtStart(1);
        ll.insertAtEnd(2);

        ll.traverse();

        
    }
}