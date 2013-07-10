
public class Number {
	LinkedString number;
	
	public Number(String num) {
		number = new LinkedString(num);
	}
	
	public Number(int num) {
		number = new LinkedString(Integer.toString(num));
	}
	
	public Number addition(Number num) {
		Number result = new Number(0);
		
		return result;
	}
	
	public Number subtraction(Number num) {
		Number result = new Number(0);
		
		return result;
	}
	
}
