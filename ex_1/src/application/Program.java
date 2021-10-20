package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double totalSum = 0.0;
		int count = 0;
		
		System.out.print("Digite um n�mero: ");
		double randomNumber = sc.nextDouble();
		
		totalSum += randomNumber;
		count += 1;
		
		sc.nextLine();
		
		while (randomNumber >= 0) {
			System.out.print("Digite outro n�mero: ");
			randomNumber = sc.nextDouble();
			if(randomNumber < 0) {
				break;
			}
			sc.nextLine();
			totalSum += randomNumber;
			count += 1;
		}
		
		double avg = totalSum / count;
		
		System.out.printf("M�dia dos valores digitados: %.2f", avg);
		
		sc.close();
	}

}
