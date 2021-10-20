package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double notes = 0.0;
		double sumNotes = 0.0;
		double avgNotes = 0.0;
		
		System.out.print("Digite o código do aluno: ");
		int studentCode = sc.nextInt();
		
		while(studentCode != 0) {
			
			System.out.print("Digite a 1° nota do aluno: ");
			notes = sc.nextDouble();
			sc.nextLine();
			
			sumNotes += notes;
			
			System.out.print("Digite a 2° nota do aluno: ");
			notes = sc.nextDouble();
			sc.nextLine();
			
			sumNotes += notes;
			
			System.out.print("Digite a 3° nota do aluno: ");
			notes = sc.nextDouble();
			sc.nextLine();
			
			sumNotes += notes;
			
			avgNotes = sumNotes / 3.0;
			
			System.out.printf("Média das notas do aluno %d: %.2f%n", studentCode, avgNotes);
			
			System.out.println();
			
			sumNotes = 0.0;
			avgNotes = 0.0;
			
			System.out.print("Digite outro código de aluno: ");
			studentCode = sc.nextInt();
		}
		
		sc.close();
	}

}
