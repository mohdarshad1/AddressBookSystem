package com.AddressBook;
import java.util.Scanner;

public class AddressBook {
	
	private String first_name;
	private String last_name;
	private String address;
	private String city;
	private String state;
	private Long zip;
	private String phone_number;
	private String email_id;
	
	
	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Long getZip() {
		return zip;
	}

	public void setZip(Long zip) {
		this.zip = zip;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public void setDetails() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your First Name");
		first_name=sc.nextLine();
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
		
		setAddress(address);
		setCity(city);
		setEmail_id(email_id);
		setFirst_name(first_name);
		setLast_name(last_name);
		setPhone_number(phone_number);
		setState(state);
		setZip(zip);
	}
	
	public void editDetails() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Edit the First Name");
		first_name=sc.nextLine();
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
		
		setAddress(address);
		setCity(city);
		setEmail_id(email_id);
		setFirst_name(first_name);
		setLast_name(last_name);
		setPhone_number(phone_number);
		setState(state);
		setZip(zip);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book System\n");
		UserInterface UIntFace = new UserInterface();
		UIntFace.UserInterfaceFunction();		
	}
}

class UserInterface {
	
		public  void UserInterfaceFunction() {
		
		Scanner sc=new Scanner(System.in);
		
		AddressBook AddressBookRecord = new AddressBook();
		int choice;
		
		do {
		System.out.println("1.Add a Entry to Address Book");
		System.out.println("2.Edit a entry of Address Book");
		System.out.println("3. Delete a Entry of Address Book");
		System.out.println("4. Exit");
		System.out.println("Enter your Choice"); 
		 choice=sc.nextInt();
		
		switch (choice) {
		case 1: {
			AddressBookRecord.setDetails();
			break;
		}
		
		case 2: {
			AddressBookRecord.editDetails();
			break;
		}
		
		case 3: {
			AddressBookRecord=null;
			break;
		}
		
		}
		
		}while(choice!=4);
		
	}
}