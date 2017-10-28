package calc;
	
public class Operations {
	
	private int x;
	private int y;
	
	public Operations(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public Operations(int x){
		this.x = x;
	}
	
	public int add() {
		return x + y;
	}
	
	public int sub() {
			return x - y;
	}
	
	public int mul() {
		return x * y;
	}
	
	public int div() {
		return x / y;
	}
	
	public int mod() {
		return x % y;
	}
	
	public int lessThan () {
		if (x>y)
			return y;
			else
				return x; 
		}
	
	public int greaterThan () {
	if (x<y) {
		return y;
			
	}else{
		return x;
				} 
		}
	
		public int neg() {
			return -x;
		}
	
	}