import java.util.Scanner;

public class MyLinkedList {
	private Node head = null;
	private Node tail = null;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MyLinkedList myList = new MyLinkedList();
		while (true) {
			System.out.print("메뉴 입력 : ");
			switch (sc.nextInt()) {
			case 1:
				myList.insertValue(sc.nextInt());
				break;
			case 2:
				myList.deleteNode(sc.nextInt());
				break;
			case 3:
				System.out.println(myList.searchNode(sc.nextInt()).toString());
				break;
			case 4:
				myList.printAll();
				break;
			case 0:
				return;
			default:
				System.out.println("다시 입력해 ㅅㅂ련아");
				break;
			}
		}
	}

	private void printAll() {
		Node node = head;
		if (head != null) {
			System.out.println(node.toString());
			node = node.getNext();

		}
	}

	public Node insertValue(int value) {
		Node node = new Node();
		node.setValue(value);
		if (head != null) {
			if(tail.getBefore()==null) {
				System.out.println("1회테일");
				tail.setBefore(node);
			}
			head.setBefore(node);
			node.setNext(head);
			head = node;
			
		} else {
			head = node;
			tail = node;
		}
		return node;
	}

	public void deleteNode(int value) {
		Node node = searchNode(value);
		if (node == null) {
			return;
		}
		Node prevNode = null;
		Node searchNode = head;

		while (searchNode != null) {
			if (searchNode.equals(node)) {
				if (searchNode.equals(head)) {
					head = searchNode.getNext();
					searchNode = null;
					if (head == null) {
						tail = null;
					}
				} else if (searchNode.equals(tail)) {
					tail = prevNode;
					tail.setNext(null);
				} else {
					prevNode.setNext(searchNode.getNext());
				}
				break;
			} else {
				prevNode = searchNode;
				searchNode = searchNode.getNext();
			}
		}
	}

	public Node searchNode(int value) {
		Node searchNode = head;
		while (searchNode != null && searchNode.getValue() != value) {
			searchNode = searchNode.getNext();
		}
		return searchNode;
	}
}
