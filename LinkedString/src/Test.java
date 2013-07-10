
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Tanes";
		LinkedString aString = new LinkedString(name);
		System.out.println(aString);
		LinkedString bString = new LinkedString();
		System.out.println(bString);
	
		char a = '1';
		
		char b = '2';
		System.out.println(Character.getNumericValue(a)+Character.getNumericValue(b));
	}

}
