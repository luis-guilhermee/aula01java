package aulaJPA.aula1;

import java.util.Scanner;

public class Exercício01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome, nomeidade;
		int idade;
		
		Scanner ler = new Scanner (System.in) ;
		
		System.out.println("Informe seu nome: ");
		nome = ler.next();
		
		System.out.println("Informe sua idade: ");
		idade = ler.nextInt();
		
		
		System.out.println("Seu nome e idade: " + nome+", "+idade+" anos");
	}

}
