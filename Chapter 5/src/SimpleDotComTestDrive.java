
public class SimpleDotComTestDrive {

	public static void main(String[] args) {

		SimpleDotCom dot = new SimpleDotCom();
		
		int[] locations = {2,3,4};
		
		dot.setLocationCells(locations);
		
		String userGuess = "2";
		String result = dot.checkYourself(userGuess);
		
		String testResult = "Failed";
		
		if (result.equals("hit")) {
			testResult = "Passed";
		}
		
		System.out.println(testResult);
		
		userGuess = "1";
		result = dot.checkYourself(userGuess);
		
		testResult = "Failed";
		
		if (result.equals("miss")) {
			testResult = "Passed";
		}
		
		System.out.println(testResult);
		
		userGuess = "3";
		result = dot.checkYourself(userGuess);
		userGuess = "4";
		result = dot.checkYourself(userGuess);
		
		testResult = "Failed";
		
		if (result.equals("kill")) {
			testResult = "Passed";
		}
		
		System.out.println(testResult);
	}

}
