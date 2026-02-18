package aulaJPA.aula1;

import java.util.Scanner;

public class calculadorav1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variáveis
		double a, b, som, sub, div, mul, por1, por2, pot1, pot2;
		// Instaciar classe Scanner
		Scanner ler = new Scanner(System.in);

		// Etrada de dados
		System.out.println("Informe valor 1: ");
		a = ler.nextDouble();

		System.out.println("Informe valor 2: ");
		b = ler.nextDouble();

		// Processamento
		som = a + b;
		sub = a - b;
		div = a / b;
		mul = a * b;
		por1 = a / b * 100;
		por2 = b / a * 100;
		pot1 = a * a;
		pot2 = b * b;
		// Saída
		System.out.println("O resultado da soma é: " + som);
		System.out.println("O resultado da subtração é: " + sub);
		System.out.println("O resultado da divisão é: " + div);
		System.out.println("O resultado da multiplicação é: " + mul);
		System.out.println("A porcentagem do primeiro valor em relação ao segundo valor é: " + por1 + " %");
		System.out.println("A porcentagem do segundo valor em relação ao primeiro valor  é: " + por2 + " %");
		System.out.println("O primeiro número elevado ao quadrado, " + a + "², é: " + pot1);
		System.out.println("O segundo número elevado ao quadrado, " + b + "², é: " + pot2);
	}
}
