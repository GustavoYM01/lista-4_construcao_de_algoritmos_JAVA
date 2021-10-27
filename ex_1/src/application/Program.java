package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double totalSum = 0.0;
		int count = 0;
		
		System.out.print("Digite um número: ");
		double randomNumber = sc.nextDouble();

		if(randomNumber < 0) {
			System.out.print("1° número negativo, algoritmo interrompido.");
			System.exit(0);
		}
		else {
			totalSum += randomNumber;
			count += 1;
		}
		
		sc.nextLine();
		
		while (randomNumber >= 0) {
			System.out.print("Digite outro número: ");
			randomNumber = sc.nextDouble();
			if(randomNumber < 0) {
				break;
			}
			sc.nextLine();
			totalSum += randomNumber;
			count += 1;
		}
		
		double avg = totalSum / count;
		
		System.out.printf("Média dos valores digitados: %.2f", avg);
		
		sc.close();
	}
}
