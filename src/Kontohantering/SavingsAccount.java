package Kontohantering;


public class SavingsAccount {
	private static int accountNrTracker = 1000000;
	private static double interestRate = 2;
	private double balance;
	private String accountType;
	private int accountNr;
	
	public SavingsAccount() {
		balance = 0;
		accountType = "Savings account";
		accountNr = accountNrTracker +1;
		//Keep track of accounts created, assuming no reuse of account numbers
		accountNrTracker++;			
	}
	
	//To take money out of account 
	public void withdraw(double amount){
		if(balance-amount > -100){
			balance -= amount;
		}else{
			this.overDraft();
		}
	}
	//Overdraft messege  
	public void overDraft(){
		System.out.print("The balance is currently " + balance + " maximum allowed amount to be withdrawn is " + (balance + 100) + " overdraft fee of 22% will occur");
	}
	//To add money in to account
	public void deposit(double amount){
		balance += amount;
	}
	//Calculate the interest
	public double calcInterest(){
		return balance * interestRate /100;
	}
	public String toString(){
		return    "Bankkonto: " + accountNr + "\n"
				+ "Balance: " + balance + "\n"
				+ "Account type: " + accountType + "\n"
				+ "Interest: " + interestRate;

	}
	
/*	saldo, räntesats, kontotyp (Sparkonto) och kontonummer (det kan inte finnas flera konton med samma kontonummer).
	Man ska till exempel kunna utföra transaktioner (insättning/uttag), hämta kontonummer, beräkna ränta (saldo * räntesats/100) 
	samt presentera kontot (kontonummer, saldo, kontotyp, räntesats).
*/}
