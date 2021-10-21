package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int totalTemporary = 0;
		
		System.out.print("Digite um número inteiro: ");
		int randomNumber = sc.nextInt();
		
		sc.nextLine();
		
		if (randomNumber % 2 == 0 && randomNumber != 0 && randomNumber > 0) {
			totalTemporary += randomNumber;
		}

		while(randomNumber != 0) {
			System.out.print("Digite outro número: ");
			randomNumber = sc.nextInt();
			
			sc.nextLine();
			
			if (randomNumber % 2 == 0 && randomNumber != 0 && randomNumber > 0) {
				totalTemporary *= randomNumber;
			}
			else {
				continue;
			}
		}
		
		System.out.printf("Produto dos pares: %d", totalTemporary);;
		
		sc.close();
	}

}
