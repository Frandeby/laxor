package Kontohantering;

public class SavingsTest {
	public static void main(String[] args) {
		SavingsAccount arnesKonto = new SavingsAccount();
		System.out.print(arnesKonto.calcInterest());
		arnesKonto.withdraw(1000);
		arnesKonto.withdraw(90);
		System.out.print(arnesKonto.toString());
		arnesKonto.deposit(100);
		System.out.print(arnesKonto.toString());
		arnesKonto.deposit(100);
		System.out.print(arnesKonto.toString());
		arnesKonto.deposit(100);
		System.out.print(arnesKonto.toString());
		arnesKonto.withdraw(90);
		System.out.print(arnesKonto.toString());
		arnesKonto.calcInterest();
		System.out.print(arnesKonto.toString());

		SavingsAccount stigsKonto = new SavingsAccount();
		System.out.print(stigsKonto.calcInterest());
		stigsKonto.withdraw(1000);
		stigsKonto.withdraw(90);
		System.out.print(stigsKonto.toString());
		stigsKonto.deposit(100);
		System.out.print(stigsKonto.toString());
		stigsKonto.deposit(100);
		System.out.print(stigsKonto.toString());
		stigsKonto.deposit(100);
		System.out.print(stigsKonto.toString());
		stigsKonto.withdraw(90);
		System.out.print(stigsKonto.toString());
		stigsKonto.calcInterest();
		System.out.print(stigsKonto.toString());
		


	}

}
