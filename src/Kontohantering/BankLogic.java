package Kontohantering;

import java.util.ArrayList;

public class BankLogic {
	//List with all the customers of the bank
	ArrayList<Customer> customers = new ArrayList<Customer>();
	
	public String infoBank(){
//Returnerar en String som innehåller presentation av bankens alla kunder (personnummer och namn)
		StringBuilder stringbuilder = new StringBuilder();
		for (Customer customer : customers) {
			stringbuilder.append(customer.getcName());
			stringbuilder.append(" "); 
			stringbuilder.append(customer.getPersonNumber());
		}
		String presentation = stringbuilder.toString();
		return presentation;
	}
	public boolean addCustomer(String name, long pNr){
		//Skapar upp en ny kund men namnet name samt personnumer pNr, 
		//kunden skapas endast om det inte finns någon kund med personnummer pNr. Returnerar true om kund skapades annars returneras false.
		if (!customers.contains(pNr)) {
			Customer customer = new Customer(name, pNr);
			customers.add(customer);
			return true;	
		}else{
			return false;
		}
	}
	public String infoCustomer(long pNr){
	//Returnerar en String som innehåller presentation av en vald kund (personnummer, namn + eventuella konton)
		String customerPresentation = "ERROR no customer has that person number";
		for (Customer customer : customers) {
			if (customer.getPersonNumber() == pNr){
				//Actual stirng builde in new method in Customer because: makes sense!
				customerPresentation = customer.toString();
			}
		}
		return customerPresentation;
	}
	public boolean changeCustomerName(String name, long pNr){
	//Byter namn på kund med personnummer pNr till name, returnerar true om namnet ändrades annars returnerar false.
		for (Customer customer : customers) {
			boolean nameChanged = false;
			if (customer.getPersonNumber() == pNr){
				customer.setcName(name);
				nameChanged = true;
			}
			return nameChanged;
		}
	}
	public String removeCustomer(long pNr){
	//Tar bort kund med personnummer pNr ur banken, alla kundens eventuella konton tas också 
	//bort och resultatet returneras. Strängen som returneras ska ha innehålla information 
	//om vilka konton som togs bort, saldot som kunden får tillbaka samt vad räntan blev.
		String finalStatement = "ERROR no such person nummber exists";
		for (int i = 0; i < customers.size(); i++) {
			Customer tmpCustomer = customers.get(i);
			if (tmpCustomer.getPersonNumber() == pNr) {
				finalStatement = finalStatement();
				custo
				customers.remove(i);
				
			}
		}
		
	}
/*	
	• 
	public int addSavingsAccount(long pNr)
	• Skapar ett konto till kund med personnummer pNr, returnerar kontonumret som det skapade kontot fick alternativt returneras –1 om inget konto skapades
	public String infoAccount(long pNr, int accountId)
	2
	￼D0018D Objektorienterad programmering i Java, 7.5 hp 2015-01-16
	• Returnerar en String som innehåller presentation av kontot med kontonnummer accountId som tillhör kunden pNr (kontonummer, saldo, kontotyp, räntesats)
	public boolean deposit(long pNr, int accountId, double amount)
	• Gör en insättning på konto med kontonnummer accountId som tillhör kunden pNr, returnerar true om det gick bra annars false
	public boolean withdraw(long pNr, int accountId, double amount)
	• Gör ett uttag på konto med kontonnummer accountId som tillhör kunden pNr, returnerar true om det gick bra annars false
	public String closeAccount(long pNr, int accountId)
	• Stänger ett konto med kontonnummer accountId som tillhör kunden pNr, presentation av kontots saldo samt ränta på pengarna ska genereras.*/
}
