public class LL {
	Node head;
	private int size;
	
	LL(){
		int size=0;
	}
	
	class Node{
		String data;
		Node next;
		
		Node(String data){
			this.data= data;
			this.next= null;
			size++;
		}
	}
	
	public void addFirst(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		newNode.next=head;
		head = newNode;
	}
	
	public void addLast(String data) {
		Node newNode = new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		Node currNode= head;
		while(currNode.next!=null) {
			currNode = currNode.next;
		}
		currNode.next=newNode;
	}
	
	public void printList() {
		if (head==null) {
			System.out.println("List Empty");
			return;
		}
		Node currNode= head;
		while(currNode!=null) {
			System.out.print(currNode.data+ " ->");
			currNode= currNode.next;
		}
		System.out.println(" NULL");
	}
	
	public void deleteFirst() {
		if(head==null) {
			System.out.println("List Empty");
			return;
		}
		size--;
		head=head.next;
	}
	
	public void deleteLast() {
		if(head==null) {
			System.out.println("List Empty");
			return;
		}
		size--;
		 if(head.next==null) {
			 head= head.next;
			 return;
		 }
		 
		 Node secondLast= head;
		 Node lastNode = head.next;
		 
		 while(lastNode.next!=null) {
			 lastNode = lastNode.next;
			 secondLast= secondLast.next;
		 }
		 
		 secondLast.next=null;
		 
	}
	
	public void reverseIterate() {
		if(head==null || head.next==null) {
			return;
		}
		
		Node prevNode = head;
		Node currNode= head.next;
		
		while(currNode!=null) {
			Node nextNode = currNode.next;
			currNode.next= prevNode;
			prevNode= currNode;
			currNode= nextNode;
		}
		
		head.next=null;
		head= prevNode;
	}
	
	public Node reverseListRecursive(Node head) {
		
		if(head==null || head.next==null) {
			return head;
		}
		
		Node newHead = reverseListRecursive(head.next);
		
		head.next.next = head;
		head.next= head;
		return newHead;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LL list= new LL();
		list.addFirst("1");
		list.addLast("2");
		list.addLast("3");
		list.addLast("4");
		list.printList();
		list.reverseIterate();
		list.printList();
		//list.reverseListRecursive(list.head);
		//list.printList();
	}

}
