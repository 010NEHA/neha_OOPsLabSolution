package Service;

import java.util.Random;

import Model.Employee;

public class CredentialService {
	
	public String generatePassword() {
		
		//Using random method
		String sampleSpace = "A6Btuv@wxyzCD29EFGHIl#5mnopqrsJ3KLMN%O8PQRSab_cdef$g2hij&7kTUVWX*Y1Z";
		
		Random rnd = new Random();
		int start = rnd.nextInt(56);
		int end = start + 12;
		
		return sampleSpace.substring(start, end);
		
	}
	
	public String generateEmailAddress(Employee emp) {
	   return emp.getFirstName() + emp.getLastName() + "@" + emp.getDepartment() + ".abc.com";
			   
	}
		 
	public void showCredentials(Employee emp) {
		System.out.println("dear" + emp.getFirstName() + "your generated credentilas are as follows");
		System.out.println("email" + emp.getEmailAddress());
		System.out.println("password " + emp.getPassword());
	}

}
