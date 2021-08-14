package calculator;


public class StringCalculator {

	public int add(String number1) {
		if(number1.isEmpty()) {
			return 0;
		}
		else if(number1.length()==1){
              return Integer.parseInt(number1);
		}
		else {
		String[] s = number1.split(",");
		return Integer.parseInt(s[0]) + Integer.parseInt(s[1]);	
		}
	}
		
}


	
