public class DoublyLinkedList<T> {

	private Node<T> head;
	private Node<T> tail;

	public void insertFirst(final T value) {
		final Node<T> node = new Node<>(value);
		node.next = head;
		if (head != null) {
			head.previous = node;
		}

		head = node;

		if (tail == null) {
			tail = node;
		}
	}
	public void insertLast(final T value) {
		final Node<T> node = new Node<>(value);
		if (tail != null) {
			tail.next = node;
			node.previous = tail;
		}
		tail = node;

		if (head == null) {
			head = node;
		}
	}
	public T removeFirst() {
		T value = null;
		if (head != null) {
			value = head.value;
			if (head == tail) {
				tail = null;
			}

			head = head.next;
			head.previous = null;
		}

		return value;
	}

	public T removeLast() {
		T value = null;
		if (tail != null) {
			value = tail.value;

			if (tail == head) {
				head = tail = null;
			} else {
				tail = tail.previous;
				tail.next = null;
			}
		}
		return value;
	}
	public T remove(final T value) {
		T deletedObj = null;
		if (head != null) {
			if (head == tail) {
				if (head.value.equals(value)) {
					deletedObj = head.value;
					head = tail = null;
				}
			} else {
				Node<T> node = head;
				do {
					if (node.value.equals(value)) {
						deletedObj = node.value;

						if (node.previous != null) {
							node.previous.next = node.next;

						}
						node.next.previous = node.previous;
						break;
					}
					node = node.next;
				} while (node != null);
			}
		}

		return deletedObj;
	}
	private static class Node<T> {
		T value;
		Node<T> next;
		Node<T> previous;

		private Node(T value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return "Node [value=" + value + "]";
		}
	}

	public static void main(String[] args) {
		final DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<>();

		doublyLinkedList.insertFirst(5);
		doublyLinkedList.insertFirst(1);
		doublyLinkedList.insertFirst(2);
		doublyLinkedList.insertLast(3);
		doublyLinkedList.insertLast(4);
		System.out.println(doublyLinkedList.removeFirst());
		System.out.println(doublyLinkedList.removeFirst());
		System.out.println(doublyLinkedList.removeLast());
		System.out.println(doublyLinkedList.removeLast());
		System.out.println(doublyLinkedList.remove(5));
		System.out.println(doublyLinkedList.remove(2));

	}

}
