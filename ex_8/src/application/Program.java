package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double newPrice = 0.0;
		double sumOldProductValue = 0.0;
		double sumNewProductValue = 0.0;
		int count = 0;
		
		System.out.print("Informe um código de um produto: ");
		int randomProductCode = sc.nextInt();
		sc.nextLine();
		
		System.out.println();
		
		System.out.printf("Código do produto: %d%n", randomProductCode);
		
		while(randomProductCode > 0) {
			
			System.out.print("Informe o preço de custo do código do produto "
					+ "informado anteriormente: R$");
			double productPrice = sc.nextDouble();
			sc.nextLine();
			
			sumOldProductValue += productPrice;
			
			newPrice = productPrice + (productPrice * 0.2);
			
			sumNewProductValue += newPrice;
			
			count += 1;
			
			System.out.println();
			
			System.out.print("Informe outro código de um produto: ");
			randomProductCode = sc.nextInt();
			sc.nextLine();
			
			System.out.println();
			System.out.printf("Código do produto: %d%n", randomProductCode);
		}
		
		double avgNewProductValue = sumNewProductValue / count;
		double avgOldProductValue = sumOldProductValue / count;
		
		System.out.println();
		
		System.out.printf("Média dos preços sem aumento: %.2f%n", avgOldProductValue);
		System.out.printf("Média dos preços com aumento: %.2f%n", avgNewProductValue);
		
		sc.close();
	}

}