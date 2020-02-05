package aplication;

import java.util.Scanner;

import entidades.Conta;
import entidades.ContaMax;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		Conta contasimples = new Conta();
		ContaMax contamax;
		double depI;
		System.out.println("Informe dados para abrir sua conta: ");
		System.out.println("Nome: ");
		String nome = leia.nextLine();
		int contaN = 6969;
		System.out.println("Deseja fazer um deposito inicial? S/N ");
		char resp = leia.next().charAt(0);
		if (resp == 'S') {
			System.out.println("Informe deposito Inicial");
			depI = leia.nextDouble();

		} else {
			depI = 0;
		}

		System.out.println("Deseja criar uma conta simples (1) ou max (2)?");
		int tipoConta = leia.nextInt();
		if (tipoConta == 1) {
			contasimples = new Conta(nome, depI, contaN);
			System.out.println(contasimples.toString());

		} else {
			contamax = new ContaMax(nome, depI, contaN, 1000);

			System.out.println("Deseja realizar um emprestimo? S/N ");
			resp = leia.next().charAt(0);
			if (resp == 'S') {
				System.out.println("Informe o valor de emprestimo: ");
				depI = leia.nextDouble();
				contamax.emprestimo(depI);
			} else {
			}
			System.out.println(contamax.toString());
		}

	}

}
