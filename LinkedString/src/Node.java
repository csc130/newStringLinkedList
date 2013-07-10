
public class Node {
	char element;
	Node link;
	
	public Node(char element) {
		this.element = element;
		link = null;
	}

	public char getElement() {
		return element;
	}

	public void setElement(char element) {
		this.element = element;
	}

	public Node getLink() {
		return link;
	}

	public void setLink(Node link) {
		this.link = link;
	}
}
