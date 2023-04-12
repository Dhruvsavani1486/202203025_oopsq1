class HW1 {
  Node head;
 
  class Node{
    int data;
    Node next;
    
   Node(int data)
    {
      this.data=data;
      this.next=null;
    }
  }
  
 
  public void AddFirst(int data)
  {  Node newNode=new Node(data);
   
   if(head==null)
   {
     head=newNode;
     return;
   }
   
   newNode.next=head;
   head=newNode;
    
  }
  
  public void Addlast(int data)
  {Node newNode=new Node(data);
      if(head==null)
   {
     head=newNode;
     return;
   }
   
   Node curr=head;
   while(curr.next!=null)
   {
     
     curr=curr.next;
   }
   curr.next=newNode;
    
    
  }
  
  public void print(){
    if(head==null)
    {System.out.println("list is empty");
    return;}
    
    Node curr=head;
    
    while(curr!=null)
    {System.out.print(curr.data+"->");
      curr=curr.next;
    }
    System.out.println("NULL");
  }
  
 public  int Search(int key)
 { int k=0;
   Node curr=head;
   while(curr!=null)
   {
     if(curr.data==key)
     {break;
     }
     curr=curr.next;
      k++;
   }
  return k;
 }
 
  public static void main(String[] args) {
    
  HW1 list=new HW1();
    list.Addlast(1);
    list.Addlast(5);
    list.Addlast(7);
    list.Addlast(3);
    list.Addlast(8);
    list.Addlast(2);
    list.Addlast(3);
    list.print();
    System.out.println("index for 7 is: "+ list.Search(7));
   
  
  }
}
