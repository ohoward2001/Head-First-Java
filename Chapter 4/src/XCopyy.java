
public class XCopyy {

	public static void main(String[] args) {
		int orig = 42;
		XCopyy x = new XCopyy();
		int y = x.go(orig);
		
		System.out.println(orig + " " + y);

	}
	
	int go (int arg) {
		arg = arg * 2;
		return arg;
	}

}
