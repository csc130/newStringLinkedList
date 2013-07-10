
public interface StringInterface {
	public boolean search(String element);
	public boolean search(String element, int index);
	public void insert(char elment, int index);
	public void remove(char element, int index);
	public void clear();
	public int size();
	public String subString(int index);
	public String subString(int startIndex, int endIndex);
	public char charAt(int index);
	public String toString();
}
