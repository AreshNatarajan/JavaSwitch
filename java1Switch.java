package org.loop;

import java.util.Scanner;

public class java1Switch {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // scanner for user input!
		System.out.println("Enter number 1 ");
		int a = scanner.nextInt();
		System.out.println("Enter number 2 ");
		int b = scanner.nextInt();
		System.out.println("Enter -> / + / , / - / , / % / , / * /");
		char operator = scanner.next().charAt(0);   // charAt is used to scan the char datatype !
		
		switch(operator) {
		case'+':
			System.out.println(" number ->" + (a+b));
			break;
		case'-':
			System.out.println(" number ->" + (a-b));
			break;
		case'%':
			System.out.println(" number -> " + (a%b));
			break;
		case'*':
			System.out.println(" number ->" + (a*b));
			break; 
			
		default:
			System.out.println("Please enter valid 'Operator !'");
			
		
		}
	}

}
