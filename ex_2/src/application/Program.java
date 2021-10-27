package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int totalVotesForCandidate1 = 0;
		int totalVotesForCandidate2 = 0;
		int totalVotesForCandidate3 = 0;
		int totalVotesForCandidate4 = 0;
		int totalNullVotes = 0;
		int totalBlankVotes = 0;
		int numberChoice = 0;

		do {
			System.out.println("Digite: 1 - candidato 1 | 2 - candidato 2 | "
					+ "3 - candidato 3 | 4 - candidato 4 | 5 - voto nulo | " + "6 - voto em branco");
			numberChoice = sc.nextInt();
			sc.nextLine();
			
			if(numberChoice <= 0 || numberChoice > 6) {
				System.out.printf("Opção inválida.%n");
				break;
			}
			else if(numberChoice == 1) {
				totalVotesForCandidate1 += 1;
			}
			else if (numberChoice == 2) {
				totalVotesForCandidate2 += 1;
			}
			else if (numberChoice == 3) {
				totalVotesForCandidate3 += 1;
			}
			else if (numberChoice == 4) {
				totalVotesForCandidate4 += 1;
			}
			else if (numberChoice == 5) {
				totalNullVotes += 1;
			}
			else if(numberChoice == 6){
				totalBlankVotes += 1;
			}
		}while(numberChoice != 0);
			
		
		System.out.printf("Total de votos para o candidato 1: %d%n", totalVotesForCandidate1);
		System.out.printf("Total de votos para o candidato 2: %d%n", totalVotesForCandidate2);
		System.out.printf("Total de votos para o candidato 3: %d%n", totalVotesForCandidate3);
		System.out.printf("Total de votos para o candidato 4: %d%n", totalVotesForCandidate4);
		System.out.printf("Total de votos nulos: %d%n", totalNullVotes);
		System.out.printf("Total de votos em branco: %d%n", totalBlankVotes);
		
		sc.close();
	}
}
