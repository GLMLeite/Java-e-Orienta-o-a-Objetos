package aula03;

import java.util.Scanner;


public class pessoa {

	public static void main(String[] args) {
		
		
		 	System.out.println("Qual o seu nome?");
	        Scanner leitor;
	        leitor = new Scanner (System.in);
	        String nome;
	        nome = leitor.nextLine();
	        System.out.println("Seu nome é: " + nome);

	}

}
