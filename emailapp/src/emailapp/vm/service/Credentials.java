package emailapp.vm.service;

import java.util.Random;

import email.vm.main.Employee;

public class Credentials {
	public char[] generatePassword() {
		String capitalLetters="ABCDEFGIJKLMNOPQRSTUVWXYZ";
		String smallLetters="abcdefghijklmnopqrstuvwxyz";
		String numbers="0;123456789";
		String specialCharecters="!@#$%^&*<>?/-+";
		String values=capitalLetters+smallLetters+numbers+specialCharecters;
		
		Random random=new Random();
		char[] password=new char[6];
		for (int i=0;i<6;i++) {
			password[i]=values.charAt(random.nextInt(values.length()));
		}
		return password;
	    }
      public String generateEmail(String firstName,String lastName,String department)

       {
	     
    	  return firstName+lastName+"@"+department+".abc.com";
       }
    	  public void showCredentials(Employee employee,String email,char[] generatedPassword) {
    		  System.out.println("Dear"+employee.getFirstName()+"your generted credentials are as follows");
    		  System.out.println("Email-->"+email);
    		  System.out.print("password-->"+"");
    		  System.out.print(generatedPassword);
    		  
    	 
	     
       }
    	  
	  
}
    	  
    	  
    	  
 

     
