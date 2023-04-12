# 202203025_oopsq1

class LL {
   Node head;
  class Node{
    int data;
    Node next;
   
    Node(int data){
      this.data=data;
      this.next=null;
    }
    
  }
  
  public void addfirst(int data )
  {Node newNode=new Node(data);
    if(head==null)
    { head=newNode;
    return;}
   newNode.next=head;
   head=newNode;
   
  }
  
  
  public void addlast(int data)
  {
    Node newNode=new Node(data);
    if(head==null)
    {head=newNode;
    return;}
    
    Node curr=head;
    while(curr.next!=null)
    {
      curr=curr.next;
    }
    curr.next=newNode;
    
      
  }
  public void print()
  { if(head==null)
  { System.out.println("List is empty");
   return;
  }
   Node curr=head;
   while(curr!=null)
   {
     System.out.print(curr.data+"->");
     curr=curr.next;
     
   }
   System.out.println("NULL");
   
    
  }
  
  
  public void deletefirst(){
    if(head==null)
    {System.out.println("list is empty");
    return;}
    
    
    head=head.next;
  }
  
  public void deletelast()
  { if(head==null)
    {System.out.println("list is empty");
    return;}
    
   Node curr=head.next;
   Node prev=head;
   if(head.next==null)
   {head=null;
   return;}
   
   while(curr.next!=null)
   {  
     curr=curr.next;
     prev=prev.next;
   }
   prev.next=null;
   
    
  }
  public static void main(String[] args) {
    
  LL list=new LL();
    list.addfirst(10);
    list.print();
    list.addfirst(33);
    list.print();
    list.addlast(3);
    list.addfirst(2);
    list.print();
    list.deletefirst();
    list.print();
    list.deletelast();
    list.print();
  }
}
