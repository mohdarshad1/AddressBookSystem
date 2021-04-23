package com.AddressBook;
import java.util.ArrayList;
import java.util.Scanner;


public class AddressBook {
									
	
	private ArrayList<PersonDetails> adrbook= new ArrayList<PersonDetails>();
	
	public void setDetails() {
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter your First Name");
		String first_name=sc.nextLine();
		System.out.println("Enter your Last Name");
		String last_name=sc.nextLine();
		System.out.println("Enter your Address");
		String address=sc.nextLine();
		System.out.println("Enter your City");
		String city=sc.nextLine();
		System.out.println("Enter your State");
		String state=sc.nextLine();
		System.out.println("Enter your Zip/Pincode");
		Long zip=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter your Phone Number");
		String phone_number=sc.nextLine();
		System.out.println("Enter your email_id");
		String email_id=sc.nextLine();
		
		PersonDetails p=new PersonDetails(first_name, last_name, address, city, state, zip, phone_number,email_id);
		
		adrbook.add(p);
		System.out.println("Person Details Added Successfully");
		
	}
	
	
public void editDetails(String name) {
		
		Scanner sc=new Scanner(System.in);
		String fname;
		int i=0;
		for(PersonDetails per:adrbook) {
			
			fname=per.getFirst_name();
			if(name.equals(fname)) break;
			i++;
		}
		
		if((i)==adrbook.size()) {
			System.out.println("No Record found with such Name");
			
		}
		
		else {
				
				System.out.println("Edit the First Name");
				String first_name=sc.nextLine();
				System.out.println("Edit the Last Name");
				String last_name=sc.nextLine();
				System.out.println("Edit the Address");
				String address=sc.nextLine();
				System.out.println("Edit the City");
				String city=sc.nextLine();
				System.out.println("Edit the State");
				String state=sc.nextLine();
				System.out.println("Edit the Zip/Pincode");
				Long zip=sc.nextLong();
				sc.nextLine();
				System.out.println("Edit the Phone Number");
				String phone_number=sc.nextLine();
				System.out.println("Edit the email_id");
				String email_id=sc.nextLine();
				
				PersonDetails newPerson=new PersonDetails(first_name, last_name, address, city, state, zip, phone_number, email_id);
				adrbook.remove(i);
				adrbook.add(i, newPerson);
				
			System.out.println("Person Details Edited Successfully");
		
		}
		
	}


public void removeRecord(String name) {
	
	Scanner sc=new Scanner(System.in);
	String fname;
	int i=0;
	for(PersonDetails per:adrbook) {
		
		fname=per.getFirst_name();
		if(name.equals(fname)) break;
		i++;
	}
	
	if((i)==adrbook.size()) {
		System.out.println("No Record found with such Name");
		
	}
	
	else {
			
			
			adrbook.remove(i);
			
			
		System.out.println("Person Details Removed Successfully");
		}
	
}

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Address Book System\n");
		UserInterface UIntFace = new UserInterface();
		UIntFace.UserInterfaceFunction();		
	}
	
}

class UserInterface {
	
public  void UserInterfaceFunction() {
		
		Scanner sc=new Scanner(System.in);
		
		AddressBook AddressBookRecord = new AddressBook();
		int choice;
		String name;
		
		do {
		System.out.println("1.Add a Entry to Address Book");
		System.out.println("2.Edit a entry of Address Book");
		System.out.println("3. Delete a entry of Address Book");
		System.out.println("4. Exit");
		System.out.println("Enter your Choice"); 
		 choice=sc.nextInt();
		 sc.nextLine();
		
		switch (choice) {
		case 1: {
			AddressBookRecord.setDetails();
			break;
		}
		
		case 2: {
			System.out.println("Enter First Name of Person whose record is to be Edited");
			name=sc.nextLine();
			AddressBookRecord.editDetails(name);
			break;
		}
		
		case 3: {
			System.out.println("Enter First Name of Person whose record is to be Remove");
			name=sc.nextLine();
			AddressBookRecord.removeRecord(name);
			break;
		}
		
		}
		
		}while(choice!=4);
		
	}
}