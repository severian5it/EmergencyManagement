import Manager.Patient;

public class Node {
	
	private Patient element;
	private Node next;
	private Node previous;
	private Integer priority;
	
	// Node is including priority, to be set up from form
	public Node(Patient element, Node next, Node previous,int priority) {
		this.element = element;
		this.next = next;
		this.previous = previous;
		this.priority = priority;
	}

	public Patient getElement() {
		return element;
	}

	public void setElement(Patient element) {
		this.element = element;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	public Node getPrevious() {
		return previous;
	}

	public void setPrevious(Node previous) {
		this.previous = previous;
	}
	
	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}	
}
