package myPackage;

public class ThirdLesson {

	/**
	 * @param args
	 */
	private int a = 9;
	private int b = 10;
	private int c = 11;
	private int b2 = 10;
	
	public ThirdLesson(){
		System.out.println("I do boolean!");
	}
	public void equals(){
		if(a  ==  b){
			System.out.println(a + " equals " + b);
		}
		else{
			System.out.println(a + " does not equal " + b);
		}
	}
	public void altIfElse(){
		int max = (a < b) ? b : a;
		System.out.println("the maximum is " + max);
	}
	
	public void altIfElse2(){
		if(a == b)
			System.out.println(a + " is equal to " + b);
		else
			System.out.println(a + " is not equal to " + b);
		System.out.println("Will always show me");
	}
	
	public void notEquals(){
		if(a != b){
			System.out.println(a + " does not equal " + b);
		}
		else{
			System.out.println(a + " equals " + b);
		}
	}
	public void lessThan(){
		if(b2 < b){
			System.out.println(b2 + " is less than or equal to " + b);
		}
		else{
			System.out.println(b2 + " is not less than " + b);
		}
	}
	public void greaterThan(){
		if(a > b){
			System.out.println(a + " greater than " + b);  // code block
		}
		else{
			System.out.println(a + " not greater than " + b);
		}
	}
	
	public void ampere(){
		if(a < b && b < c)
			System.out.println(a < b);
		if(a < b & b < c)
			System.out.println(b < c);
	}
	
	public void orElse(){
		if(a > b || b != b2)
			System.out.println("BBBB");
		else if(a < b)
			System.out.println("AAAA");
		else if(a < b | b == c)
			System.out.println("ACAC");
	}
	public void switchCase(){
		String month = "3t6jhomiojbdef thol";
		switch(month){
		case "January":
			System.out.println("The month is " + month);
			break;
		case "February":
			System.out.println("The month is " + month);
			break;
		case "March":
			System.out.println("The month is " + month);
			break;
		case "April":
			System.out.println("The month is " + month);
			break;
		case "May":
			System.out.println("The month is " + month);
			break;
		case "June":
			System.out.println("The month is " + month);
			break;
		case "July":
			System.out.println("The month is " + month);
			break;
		case "August":
			System.out.println("The month is " + month);
			break;
		case "September":
			System.out.println("The month is " + month);
			break;
		case "October":
			System.out.println("The month is " + month);
			break;
		case "November":
			System.out.println("The month is " + month);
			break;
		case "December":
			System.out.println("The month is " + month);
			break;
		default:
			System.out.println(month + " is not a month.");
				break;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThirdLesson mikey = new ThirdLesson();
		//mikey.equals();
		//mikey.altIfElse();
		//mikey.altIfElse2();
		//mikey.notEquals();
		//mikey.lessThan();
		//mikey.greaterThan();
		//mikey.ampere();
		//mikey.orElse();
		mikey.switchCase();
	}

}
