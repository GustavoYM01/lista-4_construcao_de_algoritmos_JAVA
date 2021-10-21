package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double newPrice = 0.0;
		double sumOldProductValue = 0.0;
		double sumNewProductValue = 0.0;
		int count = 0;
		
		System.out.print("Informe um c�digo de um produto: ");
		int randomProductCode = sc.nextInt();
		sc.nextLine();
		
		System.out.println();
		
		System.out.printf("C�digo do produto: %d%n", randomProductCode);
		
		while(randomProductCode > 0) {
			
			System.out.print("Informe o pre�o de custo do c�digo do produto "
					+ "informado anteriormente: R$");
			double productPrice = sc.nextDouble();
			sc.nextLine();
			
			sumOldProductValue += productPrice;
			
			newPrice = productPrice + (productPrice * 0.2);
			
			sumNewProductValue += newPrice;
			
			count += 1;
			
			System.out.println();
			
			System.out.print("Informe outro c�digo de um produto: ");
			randomProductCode = sc.nextInt();
			sc.nextLine();
			
			System.out.println();
			System.out.printf("C�digo do produto: %d%n", randomProductCode);
		}
		
		double avgNewProductValue = sumNewProductValue / count;
		double avgOldProductValue = sumOldProductValue / count;
		
		System.out.println();
		
		System.out.printf("M�dia dos pre�os sem aumento: %.2f%n", avgOldProductValue);
		System.out.printf("M�dia dos pre�os com aumento: %.2f%n", avgNewProductValue);
		
		sc.close();
	}

}