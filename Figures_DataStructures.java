//CS 210, Fall 2015
//Ivan Fonseca
//Programming Assignment 3
//November 6, 2015

import java.util.InputMismatchException;//Importing the InputMismatchException.
import java.util.Scanner;
public class Figures{

	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("CS 210, Fall 2015");
		System.out.println("NAME: Ivan Fonseca");
		System.out.println("PROGRAMMING ASSIGNMENT 3");

		int choice = 0;
		int size;

		while (choice != 4){//loops until the user inputs 4 to quit.
			try{
				System.out.println();
				System.out.print("Enter the size of the figure (odd number): ");
				size = scan .nextInt();

				while (size  <= 0){//Checks to make sure user doesn't enter a negative number.
					System.out.print("Enter the size of the figure (odd number): ");//Asks user to reenter.
					size = scan .nextInt();
				}

				while (size % 2 == 0){//Checks to make sure user entered odd number.
					System.out.println("Invalid figure size - must be an odd number");
					System.out.println();
					System.out.print("Renter the size of the figure: ");//Asks user to reenter if number isn't odd
					size = scan .nextInt();
				}

				while(choice != 4){//loops until the user inputs 4 to quit.
					System.out.println();
					System.out.println("MENU:");//Prints a menu to choice what figure to print.
					System.out.println("1. Print box");
					System.out.println("2. Print diamond ");
					System.out.println("3. Print X");
					System.out.println("4. Quit program");
					System.out.println();
					System.out.print("Please select an option: ");
					choice = scan .nextInt();

					if (choice == 1){//Calls the printBox method.
						System.out.println();
						printBox(size);	
					}
					else if (choice == 2){//Calls the printDiamond method.
						System.out.println();
						printDiamond(size);	
					}
					else if (choice == 3){//Calls the printX method.
						System.out.println();
						printX(size);	
					}
					else if (choice == 4){//Terminates the program.
						System.out.println();
						System.out.print("Good bye!");
					}
				}
			}
			catch(InputMismatchException exception){//Catches the users incorrect input.
				String num = scan.next();
			}
		}
	}

	public static void printBox(int size){//Prints a box when called.
		for(int row = 0; row < size ; row++){//Rows
			for(int col = 0; col < size; col++)//Columns
				System.out.print("X");
			System.out.println();
		}
	}

	public static void printDiamond(int size){//Prints a diamond when called.
		for(int row = 0; row < size ; row++){
			for(int col =0; col < size+1; col++){
				if ((size / 2 - row ) == (col)){//Prints top left of Diamond.
					System.out.print("X");
				}
				else if ((size / 2 + row + 1 ) == (col)){//Prints top right of Diamond.
					System.out.print("X");
				}
				else if ((size / 2 + col ) == (row)){//Prints bottom left of Diamond.
					System.out.print("X");
				}
				else if ((size - row) == (col - size /2)){//Prints bottom right of Diamond.
					System.out. print("X");
				}	
				else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");//Moves onto next row after columns are printed.
		}
	}

	public static void printX(int size){//prints a X when called.
		for(int row = 1; row < size + 1; row++){
			for(int col = 0; col < size + 1; col++){
				if ((row + col) == (size + 1)){
					System.out.print("X");//Prints one diagonal 
				}
				else if (row == col)
					System.out.print("X");//Prints the opposite diagonal.
				else {
					System.out.print(" "); 
				}
			}
			System.out.println(" ");
		}
	}
}
