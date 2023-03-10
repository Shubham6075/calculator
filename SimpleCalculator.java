import java.util.Scanner;
public class SimpleCalculator {
	public static void main(String[] args) {

		float number1,number2 ;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number");
		number1 = scanner.nextFloat();

		System.out.println("Enter the second number");
		number2 = scanner.nextFloat();

		System.out.println("You had entered");
		System.out.print(number1);
		System.out.print(" And ");
		System.out.println(number2);

		String operator = "Enter 0 for addition , 1 for subtraction , 2 for multiplication , 3 for division";

		System.out.println(operator);

		int input = scanner.nextInt();

		switch(input){
			case 0:
				System.out.println("Adding these numbers");
				System.out.print("The result is : ");
				System.out.println(number1 + number2);
				break;

			case 1:
				System.out.println("Subtraction these numbers");
				System.out.print("The result is : ");
				System.out.println(number1 - number2);
				break;

			case 2:
				System.out.println("Multiplying these numbers");
				System.out.print("The result is : ");
				System.out.println(number1 * number2);
				break;

			case 3:
				System.out.println("Division these numbers");
				System.out.print("The result is : ");
				System.out.println(number1 / number2);
				break;

			default:
				System.out.println("Invalid Argument");
		}
	}
}
