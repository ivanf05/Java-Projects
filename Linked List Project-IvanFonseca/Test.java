//CS 210, Fall 2015
//Ivan Fonseca
//Programming Assignment 5
//December 11, 2015

import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		System.out.println("CLASS: 70-210, Lewis University");
		System.out.println("NAME: Ivan Fonseca");
		System.out.println("PROGRAMMING ASSIGNMENT 5 - SET");
		System.out.println();

		Set set = new Set();//creates set object
		String add = "add";
		String del = "del";
		String exists = "exists";
		Scanner scan = new Scanner(System.in);

		//Loops infinitely
		while(true){
			try{
				//Asks user to enter a command and an int of x
				System.out.print("Enter a command: ");
				String num = scan.nextLine();
				String [] parts = num.split(" ");//splits input
				String part1 = parts[0];//command
				String part2 = parts[1];//x
				String command = part1;//command
				int x = Integer.parseInt(part2);//Converts String to int

				//User is asked to reenter a command if a negative int is inputed
				while(x < 0){
					System.out.print("Enter a command: ");
					num = scan.nextLine();
					parts = num.split(" ");
					part1 = parts[0];
					part2 = parts[1];
					command = part1;
					x = Integer.parseInt(part2);
				}

				//Calls add method if add command is inputed
				if (command.equals(add)){
					set.add(x);
					System.out.println(set.toString());
				}

				//Calls delete method if del command is inputed
				if (command.equals(del)){
					set.delete(x);
					System.out.println(set.toString());
				}

				//Calls exists method if exists command is inputed
				if (command.equals(exists)){
					System.out.println(set.exists(x));
				}

			}
			//Catches any incorrect input
			catch(ArrayIndexOutOfBoundsException exception){
				System.out.println(set.toString());
			}
			catch(NumberFormatException exception){
				System.out.println(set.toString());
			}

		}
	}

}
