#include <iostream>
using namespace std;
class Node{
    public : int data;
    Node *next;
    
    Node(int data)
    {
        this->data=data;
        this->next=next;
    }
    
    ~Node(){
		int value = this->data;
		if(this->next != NULL){
			delete next;
			this->next = NULL;
		}
		cout<<"Memory is free"<<endl;
	}
};

void AddFirst(Node* &head, int d){
	Node* temp = new Node(d);
	temp->next = head;
	head = temp;
}

void AddLast(Node* &tail, int d){
	Node* temp = new Node(d);
	tail->next = temp;
	tail = tail->next;	

}

void AddAtIndex(Node* &tail, Node* & head,int position, int d){
	//insert at start
	if(position ==1){
		AddFirst(head,d);
		return;
	}
	
	
	Node* temp = head;
	int c=1;
	
	while(c<position-1){
		temp = temp->next;
		c++;
	}
	
	//end tail
	if(temp->next == NULL){
		AddLast(tail,d);
		return;
	}
	
	Node*  nodetoinsert = new Node(d);
	nodetoinsert->next = temp->next;
	temp->next = nodetoinsert;
	
}
void deleteNode(int position, Node* &head){
	if(position == 1){
		Node* temp = head;
		head = head->next;
		temp->next = NULL;
		delete temp;
	}
	else{
		Node* curr = head;
		Node* prev = NULL;
		int c=1;
		while(c< position){
			prev = curr;
			curr = curr->next;
			c++;
		}
		prev->next = curr->next;
		curr->next = NULL; 
		delete curr; 
		
	}
}

void print(Node* &head){
	Node* temp = head;
	while(temp != NULL){
		cout<<temp->data<< " ";
		temp = temp->next;
	}	
	cout<<endl;	
}

int main() {
  


Node* node1 = new Node(12);
	cout<< node1->data <<endl;
	
	// head pointedd to node1
	Node* head = node1;
	Node* tail = node1;
	AddFirst(head,11);
	print(head);
AddFirst(head,10);
	print(head);
	
	AddFirst(head,9);
	print(head);
	
	AddLast(tail,14);
	print(head);
	AddLast(tail,15);
	print(head);
	
	AddAtIndex(tail,head,5,13);
	print(head);
	
	cout<<"Head "<<head->data <<endl;
	cout<<"Tail "<<tail->data <<endl;
	
	deleteNode(1,head);
	print(head);
	
	deleteNode(3,head);
	print(head);
	
	cout<<"Head "<<head->data <<endl;
	cout<<"Tail "<<tail->data <<endl;

    return 0;
}