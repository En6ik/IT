package cz.spsejecna.vanecek;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		int choose = 0;
		int h;
		do {
			System.out.println("I'm thinking about a number");
			System.out.println("3...  the number is in the ranges from 0 to 1000");
			System.out.println("2... the number is in the ranges from 0 to 100");
			System.out.println("1... the number is in the ranges from 0 to 10");
			try {
				choose = sc.nextInt();
			}
			catch (Exception e) {
				sc = new Scanner(System.in);
				choose = 0;
			}
		}

		while (choose > 3 || choose < 1);

		switch (choose) {

		case 3:

			int c1 = rnd.nextInt(1000);
			System.out.println(
					"Type a number that is in the range you choosed. If you type a letter the program will automaticly set the number you typed in to 500");

			try {
				h = sc.nextInt();
			} 
			catch (Exception e) {
				sc = new Scanner(System.in);
				h = 500;
				System.out.println("The choosing number is " + h + "!");
			}

			while (h > 1000) {
				System.out.println("The range is 0 - 1000!");
				System.out.println("Try again!");
				try {
					h = sc.nextInt();
				} 
				catch (Exception e) {
					sc = new Scanner(System.in);
					System.err.println("Number not letter!");
					h = 500;
					System.out.println("Your number is now" + h + "!");
				}
			}

			while (h != c1 && h <= 1000 || h > 1000) {
				if (h > c1) {
					System.out.println("The number is lower! Try again.");
				}
				if (h < c1) {
					System.out.println("The number is larger! Try again.");
				}
				try {
					h = sc.nextInt();
				}
				catch (Exception e) {
					sc = new Scanner(System.in);
					h = 500;
					System.out.println("The choosing number is " + h + "!");
				}
			}

			System.out.println("Great work, you made it!");
			break;
		case 2:

			int c2 = rnd.nextInt(100);
			System.out.println(
					"Type a number that is in the range you choosed. If you type a letter the program will automaticly set the number you typed in to 50");

			try {
				h = sc.nextInt();
			} 
			catch (Exception e) {
				sc = new Scanner(System.in);
				h = 50;
				System.out.println("The choosing number is " + h + "!");
			}

			while (h > 100) {
				System.out.println("The range is 0 - 100!");
				System.out.println("Try again!");
				try {
					h = sc.nextInt();
				} 
				catch (Exception e) {
					sc = new Scanner(System.in);
					System.err.println("Number not letter!");
					h = 50;
					System.out.println("Your number is now " + h + "!");
				}
			}

			while (h != c2 && h <= 100 || h > 100) {
				if (h > c2) {
					System.out.println("The number is lower! Try again.");
				}
				if (h < c2) {
					System.out.println("The number is larger! Try again.");
				}
				try {
					h = sc.nextInt();
				} 
				catch (Exception e) {
					sc = new Scanner(System.in);
					h = 50;
					System.out.println("The choosing number is " + h + "!");
				}
			}

			System.out.println("Great work, you made it!");
			break;

		case 1:

			int c3 = rnd.nextInt(10);
			System.out.println(
					"Type a number that is in the range you choosed. If you type a letter the program will automaticly set the number you typed to 5");

			try {
				h = sc.nextInt();
			} 
			catch (Exception e) {
				sc = new Scanner(System.in);
				h = 5;
				System.out.println("The choosing number is " + h + "!");
			}

			while (h > 10) {
				System.out.println("The range is 0 - 10!");
				System.out.println("Try again!");
				try {
					h = sc.nextInt();
				} 
				catch (Exception e) {
					sc = new Scanner(System.in);
					System.err.println("Number not letter!");
					h = 5;
					System.out.println("Your number is now" + h + "!");
				}
			}

			while (h != c3 && h <= 10 || h > 10) {
				if (h > c3) {
					System.out.println("The number is lower! Try again.");
				}
				if (h < c3) {
					System.out.println("The number is larger! Try again.");
				}
				try {
					h = sc.nextInt();
				} 
				catch (Exception e) {
					sc = new Scanner(System.in);
					h = 5;
					System.out.println("The choosing number is " + h + "!");
				}
			}
			System.out.println("Great work, you made it!");

			break;

		default:
			System.out.println("If you somehow end up with this, you are a genius!");

		}

	}

}