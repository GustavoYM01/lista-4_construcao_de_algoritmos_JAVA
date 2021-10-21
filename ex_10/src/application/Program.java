package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int limitOfPeople = 2;
		int people = 1;
		int randomAge = 0;
		int totalAge = 0;
		int count1 = 0;
		int totalPeopleOverNinety = 0;
		double randomWeight = 0.0;
		double avgAgeOflimitOfPeople = 0.0;
		
		while(people <= limitOfPeople) {
			
			System.out.print("Informe uma idade: ");
			randomAge = sc.nextInt();
			sc.nextLine();
			
			System.out.println();
			
			totalAge += randomAge;
			
			System.out.print("Informe um peso: ");
			randomWeight = sc.nextDouble();
			sc.nextLine();
			
			System.out.println();
			
			if(randomWeight > 90) {
				count1 += 1;
			}
			people++;
		}
		
		avgAgeOflimitOfPeople = totalAge / limitOfPeople;
		totalPeopleOverNinety = count1;
		
		System.out.printf("Quantidade de pessoas com mais de 90kg: %d%n", totalPeopleOverNinety);
		System.out.printf("Média de idades das pessoas: %.2f%n", avgAgeOflimitOfPeople);
		
		sc.close();
	}

}
