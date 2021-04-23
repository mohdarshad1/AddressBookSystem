package com.AddressBook;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;


public class AddressBook {
									
	
	private TreeMap<String,ArrayList<PersonDetails>> adrbook= new TreeMap<String,ArrayList<PersonDetails>>();
	
	
	public void addressBookManager(String adrbookname,ArrayList<PersonDetails> per) {
		adrbook.put(adrbookname, per);
	}
	
	public ArrayList<PersonDetails> setDetails(ArrayList<PersonDetails> newDetails) {
		
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
		
		newDetails.add(p);
		System.out.println("Person Details Added Successfully");
		return newDetails;
		
	}
	
	
public ArrayList<PersonDetails> editDetails(ArrayList<PersonDetails> editDetails,String name) {
		
		Scanner sc=new Scanner(System.in);
		String fname;
		int i=0;
		for(PersonDetails per:editDetails) {
			
			fname=per.getFirst_name();
			if(name.equals(fname)) break;
			i++;
		}
		
		if((i)==editDetails.size()) {
			System.out.println("No Record Found with such Name");
			
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
				editDetails.remove(i);
				editDetails.add(i, newPerson);
				
			System.out.println("Person Details Edited Successfully");
			
		
		}
		return editDetails;
		
	}
 

public ArrayList<PersonDetails> removeRecord(ArrayList<PersonDetails> removeDetails,String name) {
	
	Scanner sc=new Scanner(System.in);
	String fname;
	int i=0;
	for(PersonDetails per:removeDetails) {
		
		fname=per.getFirst_name();
		if(name.equals(fname)) {break;}
		i++;
	}
	
	if((i)==removeDetails.size()) {
		System.out.println("No Record found with such Name");
		
	}
	
	else {
			
			removeDetails.remove(i);
			
		System.out.println("Person Details Removed Successfully");
		
		}
	return removeDetails;
}

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		System.out.println("Welcome to Address Book System\n");
		UserInterface UIntFace = new UserInterface();
		UIntFace.UserInterfaceFunction();		
		
	}
}

class UserInterface {
	
public  void UserInterfaceFunction() {
		
		Scanner sc=new Scanner(System.in);
		
		ArrayList<PersonDetails> per=new ArrayList<PersonDetails>();
		AddressBook AddressBookRecord = new AddressBook();
		int choice;
		String name,adrbookname;
		do {
		System.out.println("Please Enter Name of the Address Book ");
		adrbookname=sc.nextLine();
		
		
		do {
		System.out.println("1.Add a Entry to Address Book");
		System.out.println("2.Edit a Entry of Address Book");
		System.out.println("3. Delete a Entry of Address Book");
		System.out.println("4. Exit the Address Book");
		System.out.println("Enter your Choice"); 
		 choice=sc.nextInt();
		 sc.nextLine();
		
		switch (choice) {
		case 1: {
			per=AddressBookRecord.setDetails(per);
			break;
		}
		
		case 2: {
			System.out.println("Enter First Name of Person whose record is to be Edited");
			name=sc.nextLine();
			per=AddressBookRecord.editDetails(per,name);
			break;
		}
		
		case 3: {
			System.out.println("Enter First Name of Person whose record is to be Remove");
			name=sc.nextLine();
			per=AddressBookRecord.removeRecord(per,name);
			break;
		}
		
		}
		
		}while(choice!=4);
		
		AddressBookRecord.addressBookManager(adrbookname, per);
		
		System.out.println("1.Create a New Address Book");
		System.out.println("2.Exit the Program");
		System.out.println("Enter the Choice");
		choice=sc.nextInt();
		sc.nextLine();
		} while(choice!=2);
		
	}
}