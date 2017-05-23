package oo.io;

import java.io.FileOutputStream;
import java.util.Scanner;

public class SumScores {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int score = 0;
		for (int i = 0; i < 3; i++) {
			try {
				score = Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("格式錯誤");
				score = 0;
				i--;
			}
			sum = sum + score;
		}
		System.out.println(sum);

		// FileOutputStream fos = new FileOutputStream("data.txt");

	}

}
