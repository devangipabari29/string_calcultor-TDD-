package calculator;


public class StringCalculator {

	public int add(String number1) {
		if(number1.isEmpty()) {
			return 0;
		}
		
		String[] s = number1.split(",");
		int sum=0;
		for(int i=0;i<s.length;i++) {
			sum+=Integer.parseInt(s[i]);
		}
		return sum;	
		
		
	}
}