package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int allInhabitantsOfTheResearch = 1000;
		int numberOfSsurveysAmongInhabitants = 1;
		int count1 = 0; // contador para o sexo f.
		int count2 = 0; // contador para o sexo m.
		int count3 = 0; // contador para idades entre 18 e 35
		int allGenders = 0;
		int age = 0;
		int sumTotalAge = 0;
		int manAge = 0;
		int genderChoice = 0;
		double height = 0.0;
		double womanHeight = 0.0;
		double avgOfGroup = 0.0;
		double avgWomanHeight = 0.0;
		double avgManAge = 0.0;
		double percentAgeOfPeopleAgedBetweenEighteenAndThirtyFiveYearsOld = 0.0;
		
		while(numberOfSsurveysAmongInhabitants <= allInhabitantsOfTheResearch) {
			
			System.out.println("Informe o sexo: 0 - Feminino | 1 - Masculino");
			genderChoice = sc.nextInt();
			sc.nextLine();
			
			if(genderChoice < 0 || genderChoice > 1) {
				System.out.print("ERRO");
				break;
			}
			else if(genderChoice == 0) {
				count1 += 1;
			}
			else if(genderChoice == 1) {
				count2 += 1;
			}
			
			System.out.println();
			
			System.out.print("Informe a idade: ");
			age = sc.nextInt();
			sc.nextLine();
			
			System.out.println();
			
			if(genderChoice == 1 && age != 0) {
				manAge += age;
				if(age == 18 || age == 35) {
					count3 += 1;
				}
			}
			else {
				if(age == 18 || age == 35) {
					count3 += 1;
				}
			}
			
			sumTotalAge += age;
			
			System.out.print("Informe a altura (em m): ");
			height = sc.nextDouble();
			sc.nextLine();
			
			System.out.println();
			
			if(genderChoice == 0 && height != 0) {
				womanHeight += height;
			}
			
			numberOfSsurveysAmongInhabitants++;
		}
		
		allGenders = count1 + count2;
		
		avgOfGroup = sumTotalAge / allGenders;
		
		avgWomanHeight = womanHeight / count1;
		
		avgManAge = manAge / count2;
		
		percentAgeOfPeopleAgedBetweenEighteenAndThirtyFiveYearsOld = (count3 / allInhabitantsOfTheResearch) * 100;
		
		System.out.printf("Média da idade do grupo: %.2f%n", avgOfGroup);
		System.out.printf("Média de altura das mulheres: %.2f%n", avgWomanHeight);
		System.out.printf("Média da idades dos homens: %.2f%n", avgManAge);
		System.out.printf("Percentual de pessoas com idade entre 18 e 35 anos: %.2f%n", percentAgeOfPeopleAgedBetweenEighteenAndThirtyFiveYearsOld);
	
		sc.close();
	}
}