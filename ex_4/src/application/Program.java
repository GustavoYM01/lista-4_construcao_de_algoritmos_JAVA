package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = 0;
		int count2 = 0;
		int totalNumbers = 0;
		double totalSum = 0.0;
		double avgTotalSum = 0.0;

		System.out.print("Digite um número: ");
		double randomNumber = sc.nextDouble();

		sc.nextLine();

		double verifyDecimal = givesItBackDecimal(randomNumber, 2);

		for (int i = 1; i <= 1; i++) {

			if (verifyDecimal <= 0.54) {
				randomNumber = Math.floor(randomNumber);
			} else if (verifyDecimal >= 0.55) {
				randomNumber = Math.round(randomNumber);
			} else {
				System.out.println("ERRO");
			}
		}

		if (randomNumber % 2 == 0) {
			
			count += 1;
			totalSum += randomNumber;
			
			while (randomNumber != 0) {
				System.out.print("Digite outro número: ");
				randomNumber = sc.nextDouble();
				sc.nextLine();

				verifyDecimal = givesItBackDecimal(randomNumber, 2);

				for (int j = 1; j <= 1; j++) {

					if (verifyDecimal <= 0.54) {
						randomNumber = Math.floor(randomNumber);
					} else if (verifyDecimal >= 0.55) {
						randomNumber = Math.round(randomNumber);
					} else {
						System.out.println("ERRO");
					}
				}

				if (randomNumber % 2 == 0) {
					count += 1;
					totalSum += randomNumber;
				} else {
					continue;
				}
			}
		} 
		
		else {
			count2 += 1;
			
			while (randomNumber != 0) {
				System.out.print("Digite outro número: ");
				randomNumber = sc.nextDouble();
				sc.nextLine();

				verifyDecimal = givesItBackDecimal(randomNumber, 2);

				for (int j = 1; j <= 1; j++) {

					if (verifyDecimal <= 0.54) {
						randomNumber = Math.floor(randomNumber);
					} else if (verifyDecimal >= 0.55) {
						randomNumber = Math.round(randomNumber);
					} else {
						System.out.println("ERRO");
					}
				}

				if (randomNumber % 2 == 0) {
					count += 1;
					totalSum += randomNumber;
				} else {
					continue;
				}
			}
		}

		avgTotalSum = totalSum / count; // O "0" sempre será incluso no count, pois trata-se de um par também.
		totalNumbers = count + count2;

		System.out.printf("Média dos números pares digitados: %.2f%n", avgTotalSum);
		System.out.printf("Total de número digitados: %d", totalNumbers);

		sc.close();
	}

	public static double givesItBackDecimal(double x, int n) {
		double p = Math.pow(10.0, n);
		int dec = (int) (x * p - ((int) x) * p);
		return dec / p;
	}

}
