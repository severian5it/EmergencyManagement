import Interfaces.Iaddable;
import Interfaces.Iremovable;
import Manager.Patient;

public class DLL implements Iaddable, Iremovable{

	public Node head;
	public Node tail;
	public int size;
	
	public DLL() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	
	public Node getNode(int position) {
		Node n = null;
		
		for (int i =1 ; i <=position; i++) {
			if (i==1) {
				n = this.head;
			} else {
				n = n.getNext();
			}
		}
		
		return n;
	}
	
	public void add(Patient p) {
		
		Node newNode = new Node(p, null, null, 0);
		
		if (this.head == null) {
			// maintain the chain
			this.head = newNode;
			this.tail = newNode;
		} else {
			
			this.tail.setNext(newNode);
			newNode.setPrevious(this.tail);
			this.tail = newNode;
		}
		this.size ++;
	}
	
	public void printListForward() {
		
		Node tmp = null;
		
		for ( int i=1; i<=this.size; i++) {
			
			if ( i ==1) {
				tmp = this.head;
			} else {
				tmp = tmp.getNext();
			}
			
			System.out.println(tmp.getElement().toString());
		}
	}
	
	public void printListBackward() {
		
		Node tmp = null;
		
		for ( int i=this.size; i>=1; i--) {
			
			if ( i ==this.size) {
				tmp = this.tail;
			} else {
				tmp = tmp.getPrevious();
			}
			
			System.out.println(tmp.getElement().toString());
		}
	}
	
	public void remove(int pos) {
		
		if (pos == 1) {
			Node n = getNode(1);
			Node next = n.getNext();
			this.head = next;
			next.setPrevious(null);
		} else if ( pos == size && size > 1) {
			Node n = getNode(pos - 1);
			n.setNext(null);
		} else {
			Node current = getNode(pos);
			Node previous = getNode(pos - 1);
			Node next = getNode(pos + 1);
			previous.setNext(current.getNext());
			next.setPrevious(current.getPrevious());
		}
		
		size --; //missing in notes
	}
	
	public String toString(){
		
		String output = "";
		
		if (head != null) {
			Node n = head.getNext();
			while (n != null) {
				output += "***" + n.getElement().toString() +  "***";
				n = n.getNext();
			}
			
		}
		
		return output;
	}
	
	public Node getHighestPriority() {
		Node n = null;
		int highestPriority = 0;
		int pos = 0;
		for (int i = 1; i<=size; i++) {
			n = getNode(i);
			if (n.getPriority() > highestPriority) {
				highestPriority = n.getPriority();
				pos = i;
			}	
		}
		System.out.println(pos);	
		n = getNode(pos);
		return n;
	}	
	
	public int getHighestPriorityPosition() {
		Node n = null;
		int highestPriority = 0;
		int pos = 0;
		for (int i = 1; i<=size; i++) {
			n = getNode(i);
			if (n.getPriority() > highestPriority) {
				highestPriority = n.getPriority();
				pos = i;
			}	
		}
		System.out.println(pos);	
		return pos;
	}	
}
