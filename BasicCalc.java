/*This Java program performs  basic arithmetic operations
 *addition, subtraction, multiplication and division
 */
 import java.util.Scanner;
public class BasicCalc
{

	public static void main(String[] args)
	{
	  System.out.println("Enter A number : ");
        Scanner c = new Scanner(System.in);
        int number1 = inputN.nextInt();
        int number2 = inputN.nextInt();
		

		//calculating number1 + number2;
		int sum = number1 + number2;

		//calculating number1 - number2;
		int difference = number1 - number2;

		//calculating number1 * number2;
		int product = number1 * number2;

		//calculating number1 / number2;
		int quot = number1 / number2;

		//calculating number1 % number2;
		int rem = number1 % number2;

		//Displaying the values
		System.out.println("number1 : "+number1);
		System.out.println("number2 : "+number2);
		System.out.println("sum : "+sum);
		System.out.println("difference : "+difference);
		System.out.println("product : "+product);
		System.out.println("quot : "+quot);
		System.out.println("rem : "+rem);
	}
}