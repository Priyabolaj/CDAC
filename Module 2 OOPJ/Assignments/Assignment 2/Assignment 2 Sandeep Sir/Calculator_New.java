public class Calculator_New {
	public static void main(String args[]){
		int num1 = Integer.parseInt(args[0]);
		System.out.println(num1);
		int num2 = Integer.parseInt(args[2]);
		System.out.println(num2);
		String operator = args[1];
		switch(operator){
			case "+":
					System.out.println("Sum of " + num1 + " and " + num2 + " is " + (num1+num2));
					break;
			case "-":
					System.out.println("Difference of " + num1 + " and " + num2 + " is " +(num1-num2));
					break;
			case "*":
					System.out.println("Product of " + num1 + " and " + num2 + " is " +(num1*num2));
					break;
			case "/":
					System.out.println("Quotient of " + num1 + " and " + num2 + " is " +(num1/num2));
					break;
			default:
					System.out.println("Invalid input");
					break;
		}
	}

}


