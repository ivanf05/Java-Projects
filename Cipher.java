
//*************************************************************************
// Ivan Fonseca
// CS 210 Fall 2015 Programing Assignment 1
// This program encrypts the total of five numbers using the Caesar Cipher.
//*************************************************************************

import java.util.Scanner;
import java.util.Random;

public class Cipher {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int first_num, sec_num, third_num, fourth_num, fith_num;

		System.out.println("CS 210, Fall 2015");
		System.out.println("NAME: Ivan Fonseca");
		System.out.println("PROGRAMMING ASSIGNMENT 1");
		System.out.println("");
		System.out.println("Welcome to the Cipher program.");
		System.out.println("Please enter 5 numbers between 0 and 19");


		//saves value of first number.
		System.out.print("1st number: ");
		first_num = scan.nextInt();
		if (first_num > 19){
			System.out.println("Please read the instructions and try again!");
			System.exit(0);
		}
		else
			first_num = first_num;
		if (first_num < 0){
			System.out.println("Please read the instructions and try again!");
			System.exit(0);
		}
		else
			first_num = first_num;


		//saves value of second number.
		System.out.print("2nd number: ");
		sec_num = scan.nextInt();
		if (sec_num > 19) {
			System.out.println("Please read the instructions and try again!");
			System.exit(0);
		} else
			sec_num = sec_num;
		if (sec_num < 0){
			System.out.println("Please read the instructions and try again!");
			System.exit(0);
		}
		else
			sec_num = sec_num;

		//saves value of third number.
		System.out.print("3rd number: ");
		third_num = scan.nextInt();
		if (third_num > 19){
			System.out.println("Please read the instructions and try again!");
			System.exit(0);
		}
		else
			third_num = third_num;
		if (third_num < 0){
			System.out.println("Please read the instructions and try again!");
			System.exit(0);
		}
		else
			third_num = third_num;

		//saves value of fourth number.
		System.out.print("4th Number: ");
		fourth_num = scan.nextInt();
		if (fourth_num > 19){
			System.out.println("Please read the instructions and try again!");
			System.exit(0);
		}
		else
			fourth_num = fourth_num;
		if (fourth_num < 0){
			System.out.println("Please read the instructions and try again!");
			System.exit(0);
		}
		else
			fourth_num = fourth_num;


		//saves value of fith number.
		System.out.print("5th number: ");
		fith_num = scan.nextInt();
		if (fith_num > 19){
			System.out.println("Please read the instructions and try again!");
			System.exit(0);
		}
		else
			fith_num = fith_num;
		if (fith_num < 0){
			System.out.println("Please read the instructions and try again!");
			System.exit(0);
		}
		else
			fith_num = fith_num;

		//Total of all five numbers.
		int total_num = first_num + sec_num + third_num + fourth_num + fith_num;
		System.out.println();
		System.out.println("Total = " + total_num);

		//Random Key
		int random_key, random_key_;
		Random generator = new Random();
		random_key = generator.nextInt(10);
		System.out.println("Your random key is " + random_key);

		//Seperates and encrypts each individual digit.

		int encode_firstdig, encode_secdig;
		encode_firstdig = (total_num / 10) + random_key;
		encode_secdig = (total_num % 10) + random_key;

		if (encode_firstdig > 9){
			encode_firstdig = encode_firstdig % 10;
		}
		else
			encode_firstdig = encode_firstdig;
		if (encode_secdig > 9){
			encode_secdig = encode_secdig % 10;
		}
		else
			encode_secdig = encode_secdig;

		//Displays the final encrypted number.
		System.out.print("Your encoded number is " + encode_firstdig + encode_secdig);

	}
}
