package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;
import entities.Individual;
import entities.Company;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<TaxPayer> list = new ArrayList<TaxPayer>();

		System.out.print("Enter the number of tax payers: ");
		int qtdPayers = sc.nextInt();

		for (int i = 1; i <= qtdPayers; i++) {

			System.out.println("Tax payer #" + i + " data: ");
			System.out.print("Individual or company (i/c)? ");
			char ic = sc.next().charAt(0);
			
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();

			
			if (ic == 'i') {
				System.out.print("Health expenditures: ");
				double healExpend = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healExpend));

			} else {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new Company(name, anualIncome, numberOfEmployees));
			}
		}
		System.out.println();
		System.out.println("TAXES PAID: ");
		for (TaxPayer payer : list) {
			System.out.printf("The tax of %s: $ %.2f%n", payer.getName(), payer.tax());
		}

		sc.close();
	}

}
