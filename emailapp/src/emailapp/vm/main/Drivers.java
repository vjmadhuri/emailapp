package emailapp.vm.main;

import java.util.Scanner;

import email.vm.main.Employee;
import emailapp.vm.service.Credentials;

public class Drivers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee=new Employee("Vijaya","Madhuri");
		Credentials cs=new Credentials();
		String generatedEmail;
		char[] generatedPassword;
		String name;
			name="vijaya";
		
		System.out.println("Please enter department from the following");
		System.out.println("1.Technical");
		System.out.println("2.admin");
		System.out.println("3..Human Resource");
		System.out.println("4.legal");
		Scanner sc=new Scanner(System.in);
		int option=sc.nextInt();
		if(option==1) {
			generatedEmail=cs.generateEmail(employee.getFirstName().toLowerCase(),
			employee.getLastName().toLowerCase(),"tech");
			generatedPassword=cs.generatePassword();
			cs.showCredentials(employee,generatedEmail,generatedPassword);
		}
			if(option==2) {
				generatedEmail=cs.generateEmail(employee.getFirstName().toLowerCase(),
				employee.getLastName().toLowerCase(),"adm");
				generatedPassword=cs.generatePassword();
				cs.showCredentials(employee,generatedEmail,generatedPassword);
			}
			if(option==3) {
				generatedEmail=cs.generateEmail(employee.getFirstName().toLowerCase(),
				employee.getLastName().toLowerCase(),"hr");
				generatedPassword=cs.generatePassword();
				cs.showCredentials(employee,generatedEmail,generatedPassword);
			}
			if(option==4) {
				generatedEmail=cs.generateEmail(employee.getFirstName().toLowerCase(),
				employee.getLastName().toLowerCase(),"Legal");
				generatedPassword=cs.generatePassword();
				cs.showCredentials(employee,generatedEmail,generatedPassword);
				
			}
				
			}
				
			}
			
	
				
		
		

