
public class Node {
	private int value;
	private Node next;
	private Node before;

	public Node() {
	}

	public Node getBefore() {
		return before;
	}

	public void setBefore(Node before) {
		this.before = before;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public boolean hasNext() {
		return next != null;
	}

	@Override
	public String toString() {
		return "Node [value=" + value + (next!=null?", next=" + next.getValue():"") + (before!=null?", before=" + before.getValue():"") + "]";
	}

}
