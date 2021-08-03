package com.hcl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class BankApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankApplication.class, args);
		Scanner sc = new Scanner(System.in);
		
		List<User> UserList = new ArrayList<User>();
				UserList.add(new User( "Navya", 14526, 1000, "CA"));
				UserList.add(new User("Savya",45263,2000,"SA"));
				UserList.add(new User("Kavya",47852,3000,"CA"));
				UserList.add(new User( "Sri", 14524, 4000, "SA"));
				UserList.add(new User("Sravanthi",452578,5000,"CA"));
				UserList.add(new User("Divya",47852,6000,"CA"));
				UserList.add(new User( "Meghana", 14527, 7000, "CA"));
				UserList.add(new User("bhavana",45245,8000,"SA"));
				UserList.add(new User("Sasi",47857,9000,"CA"));
				UserList.add(new User( "Navya", 14526, 10000, "CA"));
			
	
	
	
		System.out.println("--choice--");
		System.out.println("1.SavingsAccount\n 2.CurrentAccount\n 3.Default");
		System.out.println("Enter the choice\n");
		int choice = Integer.parseInt(sc.nextLine());
		switch(choice) {
		case 1: //SavingsAccount;
			SavingsAccount sa = new SavingsAccount();
			for(User u1:UserList) {
				if(u1.getAccounttype()=="SA") {
				   System.out.println("AccountType is Savings Account");
				}
			}
			break;
	   case 2: //CurrentAccount;
		CurrentAccount ca = new CurrentAccount();
		for(User u1:UserList) {
			if(u1.getAccounttype()=="SA") {
			   System.out.println("AccountType is Current Account");
			}
		}
		break; 
		
	   case 3: //Deafult;
		   System.out.println("Invalid Credentails");
		   
			  }
		}
}


