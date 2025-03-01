package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
	public static void main(String[]args) {
		Random randomMaker = new Random();
		
		String lotto = "";
		
		int count=0;
		while(count<5) {
			lotto += randomMaker.nextInt(100)+" "; 
			count++;
		}
		JOptionPane.showMessageDialog(null, lotto);
		
	}
	
}
