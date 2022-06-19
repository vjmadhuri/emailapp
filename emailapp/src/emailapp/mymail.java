package emailapp;

	

	import java.util.Scanner;

	//Email Administrator Application
	//scenario: task of creating email accounts for new hires.
	public class mymail  {
		
		private String firstName;
		private String lastName;
		private String password;
		private String department;
		
		private String email;
		private int defaultPasswordLength=10;
		
		private String companySuffix="company.com";

		//constructor to receive the first name and last name
		public void Email(String firstName,String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
//			System.out.println("Email Created:"+this.firstName+" "+this.lastName);
			
			//call a method for department, return the department
			this.department=setDepartment();
//			System.out.println("Department: "+this.department);
			
			//call a method that returns a random password
			this.password=randomPassword(defaultPasswordLength);
			System.out.println("Your password is: "+this.password+"\n\n");
			//combine element to generate email
			email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@" +department+"."+companySuffix;
//			System.out.println("Your email is:"+email);
		}
		//ask for the department
		private String setDepartment() {
			System.out.print("New Worker: "+firstName + "\nDEPARTMENT CODES:\n1 for Technical\n2 for Admin\n3 for Human Resource\n4 for Legal\n 0 for none Enter the department code: ");
			Scanner in=new Scanner(System.in);
			int depchoice=in.nextInt();
			if(depchoice==1) {
				return "Technical";
			}
			else if(depchoice==2) {
				return "Admin";
			}
			else if(depchoice==3) {
				return "Human Resource";
			}
			else if (depchoice==4){
				
				return"Legal";
			}
			else
				return "";
			}
		
		//generate a random password
		private String randomPassword(int length) {
			String passwordSet= "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
			char[] password=new char[length];
			for(int i=0;i<length;i++) {
				int rand=(int) (Math.random()*passwordSet.length());
				password[i]=passwordSet.charAt(rand);
			}
			return new String(password);
		}
		
		
		
		//change the password
		public void changePassword(String password) {
			this.password=password;
		}
		
	

	}


	public class Emailapp {

		public static void main(String[] args) {
			Email em1=new Email("wren","martin");
			Email em2=new Email("john","snow");
			System.out.println(em1.showinfo());
			System.out.println(em2.showinfo());
		}
	}
	