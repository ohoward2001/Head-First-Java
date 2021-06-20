
public class GreenBottles {

	public static void main(String[] args) {
		int bottles = 99;
		String word = "bottles";
		
		while (bottles > 0) {
			System.out.println(bottles + " green " + word + " sitting on the wall");
			System.out.println(bottles + " green " + word + " sitting on the wall");
			System.out.println("And if one green bottle should accidentally fall");
			
			bottles = bottles - 1;
			
			if (bottles == 1) {
				word = "bottle";
			}
			
			if (bottles > 0) {
				System.out.println("There'll be " + bottles + " green " + word + " sitting on the wall");
			}
			else {
				System.out.println("There'll be no green bottles sitting on the wall");	
			}
		}
	}

}
