package Thursday11;

import java.util.Scanner;

public class NumbertoLetters {
	static Scanner sc = new Scanner(System.in);

	static void convert(int num) {
		String ones[] = { " ", "One ", "Two ", "Three ", "Four ", "Five ", "Six ", "Seven ", "Eight ", "Nine " };
		String tens[] = { " ", "Ten ", "Twenty ", "Thirty ", "Fourty ", "Fivty ", "Sixty ", "Seventy ", "Eighty ", "Ninty " };
		String hundered[] = { " ", "One Hundered ", "Two Hundered ", "Three Hundered ", "Four Hundered ", "Five Hundered ",
				"Six Hundered ", "Seven Hundered ", "Eight Hundered ", "Nine Hundered " };
		String thounsand[] = { " ", "One Thousand ", "Two Thousand ", "Three Thousand ", "Four Thousand ", "Five Thousand ",
				"Six Thousand ", "Seven Thousand ", "Eight Thousand ", "Nine Thousand " };
		String convert[][] = { ones, tens, hundered, thounsand };
		String teens[] = { "", "Eleven ", "Twelve ", "Therteen ", "Fourteen ", "Fivteen ", "Sixteen ", "Seventeen ",
				"Eighteen", "Nineteen " };
		int n = 0;
		String value2 = "";
		int temp = num;
		while (num > 0) {
			String String1 = "";
			int lasttwo = temp % 100;
			if (lasttwo > 10 && lasttwo < 20) {
				int lasto = lasttwo % 10;
				value2 = teens[lasto];
				num /= 100;
				temp = 0;
				n = 2;
			}
			if (num > 0) {
				int last = num % 10;
				String value[] = convert[n];
				for (int i = 0; i < value.length; i++) {
					if (last == i) {
						String1 += value[i];
						value2 = String1 + value2.toLowerCase();
					}
				}
			}
			n++;
			num /= 10;
		}
		System.out.println(value2);
	}

	public static void main(String[] args) {
		System.out.println("Enter the any number between Four digit ");
		int num = sc.nextInt();
		convert(num);
	}

}
