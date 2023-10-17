/**
 * 
 */
package com.gqt.calculatorApp.project;
import java.util.Scanner;

/**
 * @author 91939
 *
 */
public class CalculatorApp {
	public static int  n1;
	public static int n2;
	public static void CoIn() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number :");
		n1 =sc.nextInt();
		System.out.println("Enter the  Second Number :");
		n2 =sc.nextInt();

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\t \t Welcome to Calculator!!!");
		System.out.println("---------------------------------------------------------");
		System.out.println();
		System.out.println("Please Select Operation to be Performed : \n "+"1.Addition Operation \n "+
				"2.Subsctraction Operation \n "+"3.Addition Operation \n "+"4.Multiplication Operation \n "+"5.Modulus Operation \n "+"6.Exit \n "+"7.Restart \n ");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:{
			CoIn();
			System.out.println("Addition Operation :");
			System.out.println("The Result of Addition is "+(n1+n2));
			break;
		}
		case 2:{
			CoIn();
			System.out.println("Substraction Operation :");
			System.out.println("The Result of Substraction is "+(n1-n2));
			break;
		}
		case 3:{
			CoIn();
			System.out.println(" Multiplication Operation :");
			System.out.println("The Result of Multiplication is "+(n1*n2));
			break;
		}
		case 4:{
			CoIn();
			System.out.println("Division Operation :");
			System.out.println("The Result of Divion is "+(n1/n2));
			break;
		}
		case 5:{
			CoIn();
			System.out.println("Modulus Operation :");
			System.out.println("The Result of Modulus is "+(n1%n2));
			break;
		}
		case 6:{
			System.out.println("Thank You....");
			System.exit(0);
		}
		case 7:{
			main(null);
		}
		default:
			System.out.println("Entered Choice is Invalid");
			main(null);
		}
		// TODO Auto-generated method stub

	}

}
