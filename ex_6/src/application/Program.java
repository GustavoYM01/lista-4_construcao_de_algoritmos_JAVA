package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int totalSum = 0;
		
		System.out.print("Digite um número inteiro: ");
		int randomNumber = sc.nextInt();
		
		if(randomNumber < 0) {
			totalSum += randomNumber;
		}
		
		sc.nextLine();
		
		while(randomNumber != 0) {
			System.out.print("Digite outro número inteiro: ");
			randomNumber = sc.nextInt();
			
			sc.nextLine();
			
			if(randomNumber < 0) {
				totalSum += randomNumber;
			}
		}
		
		System.out.printf("Somatório dos números negativos: %d%n", totalSum);

		sc.close();
	}
}
