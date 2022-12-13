/**
 * Author: Opeyemi Ajisegiri
 * Class: CMSC 335 - Object-Oriented and Concurrent Programming
 * Project: 1
 * Date: November 1st, 2021
 * File: Menu.java
 * Purpose: This is the main class of the program, it interacts with the user using a command line menu.
 *    It shows the user a group of menu, accepts the user's input, error checks the input and acts based 
 *    on the input accepted from the user.
 */

import java.util.Scanner;
import java.util.Date;

public class Menu {
	static Scanner input = new Scanner(System.in);
	
	private static void menuDisplay() {
		System.out.println("Select from the menu below:");
		System.out.println("1. Construct a Circle");
		System.out.println("2. Construct a Rectangle");
		System.out.println("3. Construct a Square");
		System.out.println("4. Construct a Triangle");
		System.out.println("5. Construct a Sphere");
		System.out.println("6. Construct a Cube");
		System.out.println("7. Construct a Cone");
		System.out.println("8. Construct a Cylinder");
		System.out.println("9. Construct a Torus");
		System.out.println("10. Exit the program");
	}
	public static float Check(/*float num*/) {
		float num;
		do{
			System.out.println("Enter a positive number");
			while(!input.hasNextFloat()) {
			System.out.println("Enter a number.");
			input.next();
			}
			num = input.nextFloat();
		}while(num <= 0);
		return num;
	}
	
	public static void main(String args[]) {
		int option;
		//Scanner input = new Scanner(System.in);
		System.out.println("**********Welcome to the Java OO Shapes Program **********");
		//Somehow, answering "Y" bypasses the loop
		/*System.out.println("Do you want to construct a shape?(Y or N)");
		String proceed = input.next();
		System.out.println(proceed);
		while(proceed == "Y") {*/
		menuDisplay();
		option = input.nextInt();
		while(option > 0 && option <= 10) {
			/* Initializing the common variables to 0s with each iteration */
			float radius = 0, outRadius = 0, height = 0, base = 0;
			float width = 0, length = 0;
			switch(option) {
				case 1:
					System.out.println("You selected a Circle");
					System.out.println("What is the radius of the circle?");
					radius = Check();
					Circle tempC = new Circle(radius);
					//Circle tempC = new Circle(Check(radius));
					System.out.println("The area of the circle is "+ tempC.CalculateArea());
					System.out.println();
					break;
				case 2:
					System.out.println("You selected a Rectangle");
					System.out.println("What is the length of the Rectangle?");
					length = Check();
					System.out.println("What is the width of the Rectangle?");
					width = Check();
					Rectangle tempR = new Rectangle(length,width);
					System.out.println("The area of the Rectangle is "+ tempR.CalculateArea());
					System.out.println();
					break;
				case 3:
					System.out.println("You selected a Square");
					System.out.println("What is the length of the Square?");
					length = Check();
					Square tempS = new Square(length);
					System.out.println("The area of the square is "+ tempS.CalculateArea());
					System.out.println();
					break;
				case 4:
					System.out.println("You selected a Triangle");
					System.out.println("What is the height of the Triangle?");
					height = Check();
					System.out.println("What is the base of the triangle?");
					base = Check();
					Rectangle tempT = new Rectangle(base,height);
					System.out.println("The area of the Triangle is "+ tempT.CalculateArea());
					System.out.println();
					break;
				case 5:
					System.out.println("You selected a Sphere");
					System.out.println("What is the radius of the Sphere?");
					radius = Check();
					Sphere tempSp = new Sphere(radius);
					System.out.println("The area of the Sphere is "+ tempSp.CalculateVolume());
					break;
				case 6:
					System.out.println("You selected a Cube");
					System.out.println("What is the length of a side in the cube?");
					length = Check();
					Cube tempCube = new Cube(length);
					System.out.println("The area of the Cube is "+ tempCube.CalculateVolume());
					System.out.println();
					break;
				case 7:
					System.out.println("You selected a Cone");
					System.out.println("What is the radius of the base of the cone?");
					radius = Check();
					System.out.println("What is the height of the cone?");
					height = Check();
					Cone tempCone = new Cone(radius,height);
					System.out.println("The area of the Cone is "+ tempCone.CalculateVolume());
					System.out.println();
					break;
				case 8:
					System.out.println("You selected a Cylinder");
					System.out.println("What is the radius of the base of the cylinder?");
					radius = Check();
					System.out.println("What is the height of the cylinder?");
					height = Check();
					Cylinder tempCylinder = new Cylinder(radius, height);
					System.out.println("The area of the Cylinder is "+ tempCylinder.CalculateVolume());
					System.out.println();
					break;
				case 9:
					System.out.println("You selected a Torus");
					System.out.println("What is the radius of the inner circle of the torus?");
					radius = Check();
					System.out.println("What is the radius of the outer circle of the torus");
					outRadius = Check();
					Torus tempTorus = new Torus(radius, outRadius);
					System.out.println("The area of the Torus is "+ tempTorus.CalculateVolume());
					System.out.println(tempTorus.getVolume());
					System.out.println();
					break;
				default:
					System.out.println("Thank you for using the application. Today is"+ new Date());
					System.exit(0);
			}
			
			//Somehow using "Y" exists the loop even with "proceed == "Y" as the condition.
			/*System.out.println("Do you want to continue? (Y or N)");
			proceed = input.next();
			while(!proceed.equals("Y") && !proceed.equals("N")) {
				System.out.println("Sorry I do not understand. Enter Y or N");
				proceed = input.next();
			}*/
			menuDisplay();
			option = input.nextInt();
		}
		input.close();
		System.out.println("Thank you for using the application.");
	}  
}
