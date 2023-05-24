package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Entre com número da conta: ");
		int number = sc.nextInt();
		System.out.print("Entre com Titular da conta: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Tem deposito inicial (s/n)? ");
		char response = sc.next().charAt(0);
		if (response == 's' ) {
			System.out.print("Entre com o valor do deposito inicial: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		} else {
			account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Informações da conta: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Entre com valor de deposito: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Status atual da conta: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Entre do saque: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Status atual da conta: ");
		System.out.println(account);
		
		 
		
		sc.close();

	}

}
