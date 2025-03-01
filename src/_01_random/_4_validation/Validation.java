//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		Random randomMaker = new Random();

		//System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
		int count = 0;
		while (count < 10) {
			int randomNumber = randomMaker.nextInt(5);
			if (randomNumber == 0) {
				System.out.println("nice shoes");
			} else if (randomNumber == 1) {
				System.out.println("you're funny");
			} else if (randomNumber == 2) {
				System.out.println("nice outfit");
			} else if (randomNumber == 3) {
				System.out.println("you're cool");
			} else {
				System.out.println("you're smart");
			}
			count++;
		}

		// 2. Repeat all the code above 10 times

		// 3. Find someone to test out your program. They will like it :)
	}
}
