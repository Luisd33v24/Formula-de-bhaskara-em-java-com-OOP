package principal;

import Source.Calculos;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scGlobal = new Scanner(System.in);
		char opcao;
		char resposta;

		System.out.println("================================");
		System.out.println("calculadora de baskhara: ");
		System.out.println("================================");

		System.out.println("Deseja prosseguir? (s/n)");
		resposta = scGlobal.next().charAt(0);
		if (resposta != 's' && resposta != 'S') {
			System.out.println("================================");
			System.out.println("================================");
			System.out.println("Programa encerrado");
			System.out.println("================================");
			System.out.println("================================");
		} else {

			do {

				Calculos calculo = new Calculos();
				calculo.setABC(scGlobal);
				calculo.resultado();
				System.out.println("deseja continuar para outro calculo? (s/n)");

				opcao = scGlobal.next().charAt(0);
			} while (opcao == 'S' || opcao == 's');
			System.out.println("================================");
			System.out.println("================================");
			System.out.println("Programa encerrado");
			System.out.println("================================");
			System.out.println("================================");

		}
		scGlobal.close();
	}

}
