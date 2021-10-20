package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int firstInterval = 0;
		int secondInterval = 0;
		int thirdInterval = 0;
		int fourtyInterval = 0;
		int noBreak = 0; // noBrak = "Sem intervalo"
		
		
		System.out.print("Digite um número: ");
		double randomNumber = sc.nextDouble();
		
		if(randomNumber > 0 && randomNumber <= 25) {
			firstInterval += 1;
		}
		else if (randomNumber >= 26 && randomNumber <= 50) {
			secondInterval += 1;
		}
		else if (randomNumber >= 51 && randomNumber <= 75) {
			thirdInterval += 1;
		}
		else if(randomNumber >= 76 && randomNumber <= 100){
			fourtyInterval += 1;
		}
		else {
			noBreak += 1;
		}
		
		while(randomNumber > 0) {
			System.out.print("Digite outro número: ");
			randomNumber = sc.nextDouble();
			
			if(randomNumber > 0 && randomNumber <= 25) {
				firstInterval += 1;
			}
			else if (randomNumber >= 26 && randomNumber <= 50) {
				secondInterval += 1;
			}
			else if (randomNumber >= 51 && randomNumber <= 75) {
				thirdInterval += 1;
			}
			else if(randomNumber >= 76 && randomNumber <= 100){
				fourtyInterval += 1;
			}
			else {
				noBreak += 1;
			}
		}
		
		System.out.printf("Quantidade de números compreendidos no intervalo [0-25]: %d%n",firstInterval);
		System.out.printf("Quantidade de números compreendidos no intervalo [26-50]: %d%n",secondInterval);
		System.out.printf("Quantidade de números compreendidos no intervalo [51-75]: %d%n",thirdInterval);
		System.out.printf("Quantidade de números compreendidos no intervalo [76-100]: %d%n",fourtyInterval);
		System.out.printf("Quantidade de números não compreendidos nos intervalos anteriores: %d%n",noBreak);

		sc.close();
	}
}
