package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int totalSum = 0;
		
		System.out.print("Digite um n�mero inteiro: ");
		int randomNumber = sc.nextInt();
		
		sc.nextLine();
		
		while(randomNumber != 0) {
			System.out.print("Digite outro n�mero inteiro: ");
			randomNumber = sc.nextInt();
			
			sc.nextLine();
			
			if(randomNumber < 0) {
				totalSum += randomNumber;
			}
			else {
				continue;
			}	
		}
		
		System.out.printf("Somat�rio dos n�meros negativos: %d%n", totalSum);

		sc.close();
	}

}
