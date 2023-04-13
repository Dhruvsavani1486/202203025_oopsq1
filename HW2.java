import java.util.Random;
class HW2 {
  Node head;
  int size;
  static int j=0;
  HW2(){this.size=0;
       }
  
  class Node{
    int data;
    Node next;
    
    Node(int data)
    {
      this.data=data;
      this.next=null;
    }
  }
  
  public void addLast(int data)
  {Node insertNode=new Node(data);
   
   Node curr=head;
   size++;
   if(head==null)
   {head=insertNode;
   return;}
   
   while(curr.next!=null)
     
   {
     curr=curr.next;
     
   }
   curr.next=insertNode;
   
    
  }
  
  public void print()
  {
    Node curr=head;
    if(head==null)
    {System.out.println("List is empty");
    return;}
    
    while(curr!=null)
    {
      System.out.print(curr.data+"->");
      curr=curr.next;
    }
    System.out.println("NULL");
  }
  public int getSize()
  {
    return size;
  }
  
  
  
  public void delete(int m)
  {
    if(m==0)
    {
      if(head.data>25){
        head=head.next;
        size--;
        j--;
      return;}
      else
        return;
    }
    Node curr=head;
  if (m == 1) {
      if (head.data > 25) {
        head.next = head.next.next;
        j--;
        size--;
      }
      return;
    }

    while (m > 2 && curr.next != null) {
      curr = curr.next;
      m--;
    }

    if (curr.next != null && curr.next.data > 25) {
      curr.next = curr.next.next;
      j--;
      size--;
    }
  
    
    
   
  }
  
  public static void main(String[] args) {
    HW2 list =new HW2();
    int n=15;
    
    
   Random random=new Random();
    
  for(int i=0;i<15;i++)
  {
    list.addLast(random.nextInt(51));
  }
    list.print();
    System.out.println(list.getSize());
  
    while(j<=list.getSize())
    {
      list.delete(j);
      j++;
    }
    
    list.print();
    System.out.println(list.getSize());
  }
  
  
}
