import java.io.File;
import java.util.Scanner;


public class LinkedString implements StringInterface {

	private Node first,current;
	private Scanner scan;
	
	public LinkedString(String element) {
		this.first = new Node(element.charAt(0));
		this.current = this.first;
		for(int i=1; i<element.length(); i++) {
			this.current.setLink(new Node(element.charAt(i)));
			current = current.getLink();
		}
	}
	
	public LinkedString() {
		String input="";
		System.out.println("Enter string:");
		scan = new Scanner(System.in);
		input = scan.nextLine();
		this.first = new LinkedString(input).getFirst();
	}

	public LinkedString(File file) {
		
	}
	
	public Node getFirst() {
		return first;
	}

	public void setFirst(Node first) {
		this.first = first;
	}
	
	@Override
	public boolean search(String element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean search(String element, int index) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void insert(String elment, int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(String element, int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String subString(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String subString(int startIndex, int endIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public char charAt(int index) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public String toString() {
		String list="";
		this.current = this.first;
		while(current!=null) {
			list += current.getElement() +"\n";
			current = current.getLink();
		}
		return list;
	}

}
